package com.cook.how.CookHow.exception;

import com.cook.how.CookHow.util.ExceptionMessages;

public class ElementCantBeEmpty extends RuntimeException {

	private static final long serialVersionUID = -7559239378399839129L;
	
	public ElementCantBeEmpty(String messageError){
        super(String.format(ExceptionMessages.CANT_BE_EMPTY, messageError));
    }
    public ElementCantBeEmpty(Throwable cause){
        super(cause);
    }
}
