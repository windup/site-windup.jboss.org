// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   AnvilWebLifecycleListener.java

package com.acme.anvil.listener;

import com.acme.anvil.management.AnvilInvokeBeanImpl;
import java.util.Properties;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.apache.log4j.Logger;
import weblogic.application.ApplicationContext;
import weblogic.application.ApplicationLifecycleEvent;
import weblogic.application.ApplicationLifecycleListener;

public class AnvilWebLifecycleListener extends weblogic.application.ApplicationLifecycleListener
{

    public AnvilWebLifecycleListener()
    {
    }

    public void preStart(weblogic.application.ApplicationLifecycleEvent evt)
    {
        java.lang.String appName = evt.getApplicationContext().getApplicationName();
        LOG.info((new StringBuilder()).append("Before Start Application[").append(appName).append("]").toString());
    }

    public void postStart(weblogic.application.ApplicationLifecycleEvent evt)
    {
        java.lang.String appName = evt.getApplicationContext().getApplicationName();
        LOG.info((new StringBuilder()).append("After Start Application[").append(appName).append("]").toString());
        registerMBean();
    }

    public void postStop(weblogic.application.ApplicationLifecycleEvent evt)
    {
        java.lang.String appName = evt.getApplicationContext().getApplicationName();
        LOG.info((new StringBuilder()).append("Before Stop Application[").append(appName).append("]").toString());
        unregisterMBean();
    }

    public void preStop(weblogic.application.ApplicationLifecycleEvent evt)
    {
        java.lang.String appName = evt.getApplicationContext().getApplicationName();
        LOG.info((new StringBuilder()).append("After Stop Application[").append(appName).append("]").toString());
    }

    private javax.management.MBeanServer getMBeanServer()
        throws javax.naming.NamingException
    {
        java.util.Properties environment = new Properties();
        environment.put("java.naming.factory.initial", "weblogic.jndi.WLInitialContextFactory");
        environment.put("java.naming.provider.url", "t3://localhost:7001");
        javax.naming.Context context = new InitialContext(environment);
        javax.management.MBeanServer server = (javax.management.MBeanServer)context.lookup("java:comp/jmx/runtime");
        return server;
    }

    private void registerMBean()
    {
        LOG.info("Registering MBeans.");
        try
        {
            javax.management.MBeanServer server = getMBeanServer();
            server.registerMBean(new AnvilInvokeBeanImpl(), new ObjectName("com.acme:Name=anvil,Type=com.acme.anvil.management.AnvilInvokeBeanApplicationLifecycleListener"));
            LOG.info("Registered MBean[com.acme:Name=anvil,Type=com.acme.anvil.management.AnvilInvokeBeanApplicationLifecycleListener]");
        }
        catch(java.lang.Exception e)
        {
            LOG.error("Exception while registering MBean[com.acme:Name=anvil,Type=com.acme.anvil.management.AnvilInvokeBeanApplicationLifecycleListener]");
        }
    }

    private void unregisterMBean()
    {
        LOG.info("Unregistering MBeans.");
        try
        {
            javax.management.MBeanServer server = getMBeanServer();
            server.unregisterMBean(new ObjectName("com.acme:Name=anvil,Type=com.acme.anvil.management.AnvilInvokeBeanApplicationLifecycleListener"));
            LOG.info("Unregistered MBean[com.acme:Name=anvil,Type=com.acme.anvil.management.AnvilInvokeBeanApplicationLifecycleListener]");
        }
        catch(java.lang.Exception e)
        {
            LOG.error("Exception while unregistering MBean[com.acme:Name=anvil,Type=com.acme.anvil.management.AnvilInvokeBeanApplicationLifecycleListener]");
        }
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

    private static org.apache.log4j.Logger LOG;
    private static final java.lang.String MBEAN_NAME = "com.acme:Name=anvil,Type=com.acme.anvil.management.AnvilInvokeBeanApplicationLifecycleListener";

    static 
    {
        LOG = org.apache.log4j.Logger.getLogger(com.acme.anvil.listener.AnvilWebLifecycleListener.class);
    }
}
