// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   AnvilWebServlet.java

package com.acme.anvil;

import com.acme.anvil.service.ItemLookupLocal;
import com.acme.anvil.service.ItemLookupLocalHome;
import java.io.IOException;
import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

public class AnvilWebServlet extends javax.servlet.http.HttpServlet
{

    public AnvilWebServlet()
    {
    }

    protected void doGet(javax.servlet.http.HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
        throws javax.servlet.ServletException, java.io.IOException
    {
        try
        {
            javax.naming.InitialContext ic = new InitialContext();
            com.acme.anvil.service.ItemLookupLocalHome lh = (com.acme.anvil.service.ItemLookupLocalHome)ic.lookup("ejb/ItemLookupLocal");
            com.acme.anvil.service.ItemLookupLocal local = lh.create();
            java.lang.String itemId = req.getParameter("id");
            if(org.apache.commons.lang.StringUtils.isNotBlank(itemId))
            {
                java.lang.Long id = java.lang.Long.valueOf(java.lang.Long.parseLong(itemId));
                local.lookupItem(id.longValue());
            }
        }
        catch(javax.ejb.EJBException e)
        {
            LOG.error("Exception creating EJB.", e);
        }
        catch(javax.ejb.CreateException e)
        {
            LOG.error("Exception creating EJB.", e);
        }
        catch(javax.naming.NamingException e)
        {
            LOG.error("Exception looking up EJB LocalHome.", e);
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

    private static final org.apache.log4j.Logger LOG;

    static 
    {
        LOG = org.apache.log4j.Logger.getLogger(com.acme.anvil.AnvilWebServlet.class);
    }
}
