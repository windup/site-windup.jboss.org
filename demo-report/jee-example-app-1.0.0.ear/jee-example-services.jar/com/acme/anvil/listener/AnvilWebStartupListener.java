// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   AnvilWebStartupListener.java

package com.acme.anvil.listener;

import com.acme.anvil.management.AnvilInvokeBeanImpl;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.naming.Context;
import javax.naming.NamingException;
import weblogic.common.T3ServicesDef;
import weblogic.common.T3StartupDef;
import weblogic.i18n.logging.NonCatalogLogger;
import weblogic.jndi.Environment;

public class AnvilWebStartupListener
    implements weblogic.common.T3StartupDef
{

    public AnvilWebStartupListener()
    {
        log = new NonCatalogLogger("AnvilWebStartupListener");
    }

    public void setServices(weblogic.common.T3ServicesDef services)
    {
        this.services = services;
    }

    public java.lang.String startup(java.lang.String name, java.util.Hashtable ht)
    {
        log.info((new StringBuilder()).append("Starting Server Startup Class: ").append(name).append(" with properties: ").toString());
        java.lang.Object key;
        for(java.util.Iterator i$ = ht.keySet().iterator(); i$.hasNext(); log.info((new StringBuilder()).append("Key[").append(key).append("] = Value[").append(ht.get(key)).append("]").toString()))
            key = i$.next();

        return (new StringBuilder()).append("Completed Startup Class: ").append(name).toString();
    }

    private javax.management.MBeanServer getMBeanServer()
        throws javax.naming.NamingException
    {
        weblogic.jndi.Environment env = new Environment();
        env.setProviderUrl("t3://weblogicServer:7001");
        env.setSecurityPrincipal("fred");
        env.setSecurityCredentials("seafood");
        javax.naming.Context context = env.getContext();
        javax.management.MBeanServer server = (javax.management.MBeanServer)context.lookup("java:comp/jmx/runtime");
        return server;
    }

    private void registerMBean()
    {
        log.info("Registering MBeans.");
        try
        {
            javax.management.MBeanServer server = getMBeanServer();
            server.registerMBean(new AnvilInvokeBeanImpl(), new ObjectName("com.acme:Name=anvil,Type=com.acme.anvil.management.AnvilInvokeBeanT3StartupDef"));
            log.info("Registered MBean[com.acme:Name=anvil,Type=com.acme.anvil.management.AnvilInvokeBeanT3StartupDef]");
        }
        catch(java.lang.Exception e)
        {
            log.error("Exception while registering MBean[com.acme:Name=anvil,Type=com.acme.anvil.management.AnvilInvokeBeanT3StartupDef]");
        }
    }

    private static final java.lang.String MBEAN_NAME = "com.acme:Name=anvil,Type=com.acme.anvil.management.AnvilInvokeBeanT3StartupDef";
    private weblogic.i18n.logging.NonCatalogLogger log;
    private weblogic.common.T3ServicesDef services;
}
