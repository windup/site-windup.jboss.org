// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   LogEventPublisher.java

package com.acme.anvil.service.jms;

import com.acme.anvil.vo.LogEvent;
import java.util.Properties;
import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.log4j.Logger;
import weblogic.transaction.ClientTransactionManager;
import weblogic.transaction.TransactionHelper;

public class LogEventPublisher
{

    public LogEventPublisher()
    {
    }

    public static void publishLogEvent(com.acme.anvil.vo.LogEvent log)
    {
        weblogic.transaction.ClientTransactionManager ctm = weblogic.transaction.TransactionHelper.getTransactionHelper().getTransactionManager();
        weblogic.transaction.Transaction saveTx = null;
        try
        {
            saveTx = ctm.forceSuspend();
            try
            {
                javax.naming.Context ic = com.acme.anvil.service.jms.LogEventPublisher.getContext();
                javax.jms.QueueSession session = com.acme.anvil.service.jms.LogEventPublisher.getQueueSession(ic);
                javax.jms.Queue queue = com.acme.anvil.service.jms.LogEventPublisher.getQueue(ic);
                javax.jms.QueueSender sender = session.createSender(queue);
                javax.jms.ObjectMessage logMsg = session.createObjectMessage(log);
                sender.send(logMsg);
            }
            catch(javax.jms.JMSException e)
            {
                LOG.error("Exception sending message.", e);
            }
            catch(javax.naming.NamingException e)
            {
                LOG.error("Exception looking up required resource.", e);
            }
        }
        finally
        {
            ctm.forceResume(saveTx);
        }
    }

    private static javax.naming.Context getContext()
        throws javax.naming.NamingException
    {
        java.util.Properties environment = new Properties();
        environment.put("java.naming.factory.initial", "weblogic.jndi.WLInitialContextFactory");
        environment.put("java.naming.provider.url", "t3://localhost:7001");
        javax.naming.Context context = new InitialContext(environment);
        return context;
    }

    private static javax.jms.Queue getQueue(javax.naming.Context context)
        throws javax.naming.NamingException
    {
        return (javax.jms.Queue)context.lookup("jms/LogEventQueue");
    }

    private static javax.jms.QueueSession getQueueSession(javax.naming.Context context)
        throws javax.jms.JMSException, javax.naming.NamingException
    {
        javax.jms.QueueConnectionFactory cf = (javax.jms.QueueConnectionFactory)context.lookup("jms/LogEventQueue");
        javax.jms.QueueConnection connection = cf.createQueueConnection();
        return (javax.jms.QueueSession)connection.createSession(false, 1);
    }

    static java.lang.Class _mthclass$(java.lang.String s)
    {
        try
        {
            return java.lang.Class.forName(s);
        }
        catch(java.lang.ClassNotFoundException classnotfoundexception)
        {
            throw new NoClassDefFoundError(classnotfoundexception.getMessage());
        }
    }

    private static final org.apache.log4j.Logger LOG;
    private static final java.lang.String QUEUE_JNDI_NAME = "jms/LogEventQueue";
    private static final java.lang.String QUEUE_FACTORY_JNDI_NAME = "jms/LogEventQueue";

    static 
    {
        LOG = org.apache.log4j.Logger.getLogger(com.acme.anvil.service.jms.LogEventPublisher.class);
    }
}
