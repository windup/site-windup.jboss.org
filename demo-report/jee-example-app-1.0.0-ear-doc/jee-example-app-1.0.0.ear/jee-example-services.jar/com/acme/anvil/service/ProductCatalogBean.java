// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   ProductCatalogBean.java

package com.acme.anvil.service;

import java.rmi.RemoteException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import weblogic.i18n.logging.NonCatalogLogger;

public class ProductCatalogBean
    implements javax.ejb.SessionBean
{

    public ProductCatalogBean()
    {
    }

    public void setSessionContext(javax.ejb.SessionContext ctx)
        throws javax.ejb.EJBException, java.rmi.RemoteException
    {
        sessionContext = sessionContext;
    }

    public void ejbRemove()
        throws javax.ejb.EJBException, java.rmi.RemoteException
    {
        LOG.info("Called Remove.");
    }

    public void ejbActivate()
        throws javax.ejb.EJBException, java.rmi.RemoteException
    {
        LOG.info("Called Activate");
    }

    public void ejbPassivate()
        throws javax.ejb.EJBException, java.rmi.RemoteException
    {
        LOG.info("Called Passivate");
    }

    public void populateCatalog()
    {
        LOG.info("Do something.");
    }

    private static final weblogic.i18n.logging.NonCatalogLogger LOG = new NonCatalogLogger("ProductCatalogBean");
    private javax.ejb.SessionContext sessionContext;

}
