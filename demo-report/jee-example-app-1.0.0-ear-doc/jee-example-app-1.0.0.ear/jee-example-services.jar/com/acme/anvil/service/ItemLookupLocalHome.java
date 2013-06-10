// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   ItemLookupLocalHome.java

package com.acme.anvil.service;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.EJBLocalHome;

// Referenced classes of package com.acme.anvil.service:
//            ItemLookupLocal

public interface ItemLookupLocalHome
    extends javax.ejb.EJBLocalHome
{

    public abstract com.acme.anvil.service.ItemLookupLocal create()
        throws javax.ejb.CreateException, javax.ejb.EJBException;
}
