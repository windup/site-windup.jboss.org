// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   ProductCatalogLocalHome.java

package com.acme.anvil.service;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.EJBLocalHome;

// Referenced classes of package com.acme.anvil.service:
//            ProductCatalogLocal

public interface ProductCatalogLocalHome
    extends javax.ejb.EJBLocalHome
{

    public abstract com.acme.anvil.service.ProductCatalogLocal create()
        throws javax.ejb.CreateException, javax.ejb.EJBException;
}
