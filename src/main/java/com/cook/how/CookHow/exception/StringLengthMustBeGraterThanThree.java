package com.cook.how.CookHow.exception;

import com.cook.how.CookHow.util.ExceptionMessages;

public class StringLengthMustBeGraterThanThree extends RuntimeException {

	private static final long serialVersionUID = -169418003094948891L;

	public StringLengthMustBeGraterThanThree(String messageError){
        super(String.format(ExceptionMessages.LENGTH_MUST_BE_GRATER_THAN_THREE, messageError));
    }
    public StringLengthMustBeGraterThanThree(Throwable cause){
        super(cause);
    }
	
}
