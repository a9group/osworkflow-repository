/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
/*
 * Generated by XDoclet - Do not edit!
 */
package com.opensymphony.module.sequence;


/**
 * CMP layer for Sequence.
 * @author <a href="mailto:joe@truemesh.com">Joe Walnes</a>
 * @author <a href="mailto:hani@formicary.net">Hani Suleiman</a>
 * @version $Revision: 127 $
 */
public abstract class SequenceCMP extends com.opensymphony.module.sequence.SequenceEJB implements javax.ejb.EntityBean {
    //~ Methods ////////////////////////////////////////////////////////////////

    public abstract void setActualCount(long actualCount);

    public abstract long getActualCount();

    public void setEntityContext(javax.ejb.EntityContext ctx) {
        super.setEntityContext(ctx);
    }

    public abstract void setName(java.lang.String name);

    public abstract java.lang.String getName();

    public void ejbActivate() {
        super.ejbActivate();
    }

    public void ejbLoad() {
        super.ejbLoad();
    }

    public void ejbPassivate() {
        super.ejbPassivate();
    }

    public void ejbRemove() throws javax.ejb.RemoveException {
        super.ejbRemove();
    }

    public void ejbStore() {
        super.ejbStore();
    }

    public void unsetEntityContext() {
        super.unsetEntityContext();
    }
}
