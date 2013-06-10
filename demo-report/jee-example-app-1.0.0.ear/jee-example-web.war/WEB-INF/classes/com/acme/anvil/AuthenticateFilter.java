// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   AuthenticateFilter.java

package com.acme.anvil;

import java.io.IOException;
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang.time.DateUtils;
import weblogic.i18n.logging.NonCatalogLogger;
import weblogic.servlet.security.ServletAuthentication;

public class AuthenticateFilter
    implements javax.servlet.Filter
{

    public AuthenticateFilter()
    {
        ncl = new NonCatalogLogger("AuthenticateFilter");
    }

    public void destroy()
    {
        ncl.debug("AuthenticateFilter destroy.");
    }

    public void doFilter(javax.servlet.ServletRequest req, javax.servlet.ServletResponse resp, javax.servlet.FilterChain chain)
        throws java.io.IOException, javax.servlet.ServletException
    {
        javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)req;
        javax.servlet.http.HttpSession session = request.getSession();
        ncl.debug("AuthenticateFilter doFilter.");
        if(req.getAttribute("cancelSession") != null)
        {
            ncl.info("Cancelled session due to session timeout.");
            weblogic.servlet.security.ServletAuthentication.invalidateAll(request);
        } else
        if(session != null)
        {
            java.util.Date fiveMinutesAgo = org.apache.commons.lang.time.DateUtils.addMinutes(new Date(), -5);
            java.util.Date timeLastAccessed = new Date(session.getLastAccessedTime());
            if(timeLastAccessed.before(fiveMinutesAgo))
            {
                session.invalidate();
                weblogic.servlet.security.ServletAuthentication.invalidateAll(request);
            }
        }
    }

    public void init(javax.servlet.FilterConfig config)
        throws javax.servlet.ServletException
    {
        ncl.debug("AuthenticateFilter init.");
    }

    private weblogic.i18n.logging.NonCatalogLogger ncl;
}
