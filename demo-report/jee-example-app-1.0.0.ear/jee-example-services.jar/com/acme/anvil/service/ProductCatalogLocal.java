// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   ProductCatalogLocal.java

package com.acme.anvil.service;

import javax.ejb.EJBLocalObject;

public interface ProductCatalogLocal
    extends javax.ejb.EJBLocalObject
{

    public abstract void populateCatalog();
}
