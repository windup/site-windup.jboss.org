// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   ProductCatalog.java

package com.acme.anvil.service;

import javax.ejb.EJBObject;

public interface ProductCatalog
    extends javax.ejb.EJBObject
{

    public abstract void populateCatalog();
}
