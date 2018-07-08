package com.cook.how.CookHow.exception;

public class StringLengthMustBeGraterThanThree extends RuntimeException {

	private static final long serialVersionUID = -169418003094948891L;

	public StringLengthMustBeGraterThanThree(String messageError){
        super(messageError);
    }
	
}
