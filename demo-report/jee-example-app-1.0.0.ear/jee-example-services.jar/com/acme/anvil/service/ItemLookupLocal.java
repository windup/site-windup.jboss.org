// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   ItemLookupLocal.java

package com.acme.anvil.service;

import com.acme.anvil.vo.Item;
import javax.ejb.EJBLocalObject;

public interface ItemLookupLocal
    extends javax.ejb.EJBLocalObject
{

    public abstract com.acme.anvil.vo.Item lookupItem(long l);
}
