// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: fullnames 
// Source File Name:   AnvilInvokeBeanImpl.java

package com.acme.anvil.management;

import javax.management.NotCompliantMBeanException;
import javax.management.StandardMBean;

// Referenced classes of package com.acme.anvil.management:
//            AnvilInvokeBean

public class AnvilInvokeBeanImpl extends javax.management.StandardMBean
    implements com.acme.anvil.management.AnvilInvokeBean
{

    public AnvilInvokeBeanImpl()
        throws javax.management.NotCompliantMBeanException
    {
        super(com.acme.anvil.management.AnvilInvokeBean.class);
        invoked = 0;
    }

    public void addInvoked()
    {
        invoked++;
    }

    public int getInvoked()
    {
        return invoked;
    }

    private int invoked;
}
