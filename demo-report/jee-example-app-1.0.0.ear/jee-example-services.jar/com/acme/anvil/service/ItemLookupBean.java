// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   ItemLookupBean.java

package com.acme.anvil.service;

import com.acme.anvil.service.jms.LogEventPublisher;
import com.acme.anvil.vo.Item;
import com.acme.anvil.vo.LogEvent;
import java.util.Date;
import javax.ejb.SessionBean;
import org.apache.log4j.Logger;
import weblogic.ejb.GenericSessionBean;

// Referenced classes of package com.acme.anvil.service:
//            ItemLookup

public class ItemLookupBean extends weblogic.ejb.GenericSessionBean
    implements javax.ejb.SessionBean
{

    public ItemLookupBean()
    {
    }

    public com.acme.anvil.vo.Item lookupItem(long id)
    {
        LOG.info("Calling lookupItem.");
        com.acme.anvil.vo.Item item = new Item();
        item.setId(id);
        com.acme.anvil.vo.LogEvent le = new LogEvent(new Date(), (new StringBuilder()).append("Returning Item: ").append(id).toString());
        com.acme.anvil.service.jms.LogEventPublisher.publishLogEvent(le);
        return item;
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
        LOG = org.apache.log4j.Logger.getLogger(com.acme.anvil.service.ItemLookup.class);
    }
}
