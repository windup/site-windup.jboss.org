// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   LoginFilter.java

package com.acme.anvil;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import weblogic.i18n.logging.NonCatalogLogger;

public class LoginFilter
    implements javax.servlet.Filter
{

    public LoginFilter()
    {
        ncl = new NonCatalogLogger("LoginFilter");
    }

    public void destroy()
    {
        ncl.debug("LoginFilter destroy.");
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain)
        throws java.io.IOException, javax.servlet.ServletException
    {
        javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)req;
        javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)resp;
        javax.servlet.http.HttpSession session = request.getSession();
    }

    public void init(javax.servlet.FilterConfig config)
        throws javax.servlet.ServletException
    {
        ncl.debug("LoginFilter init.");
    }

    private weblogic.i18n.logging.NonCatalogLogger ncl;
}
