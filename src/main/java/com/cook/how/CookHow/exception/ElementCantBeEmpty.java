package com.cook.how.CookHow.exception;

public class ElementCantBeEmpty extends RuntimeException {

	private static final long serialVersionUID = -7559239378399839129L;

	public ElementCantBeEmpty(String messageError){
        super(messageError);
    }
    public ElementCantBeEmpty(Throwable cause){
        super(cause);
    }
}
