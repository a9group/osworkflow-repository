/*
 * Copyright (c) 2002-2003 by OpenSymphony
 * All rights reserved.
 */
package com.opensymphony.module.propertyset;


/**
 * Thrown if a property is attempted to be retrieved that
 * does exist but is of different type.
 *
 * @author <a href="mailto:joe@truemesh.com">Joe Walnes</a>
 * @version $Revision: 146 $
 */
public class InvalidPropertyTypeException extends PropertyException {
    private static final long serialVersionUID = 3804721459594221359L;

    //~ Constructors ///////////////////////////////////////////////////////////

    public InvalidPropertyTypeException() {
        super();
    }

    public InvalidPropertyTypeException(String msg) {
        super(msg);
    }

    public InvalidPropertyTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidPropertyTypeException(Throwable cause) {
        super(cause);
    }
}
