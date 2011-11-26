/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
/*
 * Generated by XDoclet - Do not edit!
 */
package com.opensymphony.workflow.spi.ejb;


/**
 * Local home interface for CurrentStepPrev.
 * @author Hani Suleiman (hani@formicary.net) Date: Apr 7, 2003 Time: 8:17:26 PM
 */
public interface CurrentStepPrevLocalHome extends javax.ejb.EJBLocalHome {
    //~ Static fields/initializers /////////////////////////////////////////////

    public static final String COMP_NAME = "java:comp/env/ejb/CurrentStepPrev";
    public static final String JNDI_NAME = "CurrentStepPrev";

    //~ Methods ////////////////////////////////////////////////////////////////

    public com.opensymphony.workflow.spi.ejb.CurrentStepPrevLocal create(long id, long previousId) throws javax.ejb.CreateException;

    public com.opensymphony.workflow.spi.ejb.CurrentStepPrevLocal findByPrimaryKey(com.opensymphony.workflow.spi.ejb.PreviousStepPK pk) throws javax.ejb.FinderException;

    public java.util.Collection findByStepId(long entryId) throws javax.ejb.FinderException;
}
