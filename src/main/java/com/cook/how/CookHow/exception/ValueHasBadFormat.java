package com.cook.how.CookHow.exception;

import com.cook.how.CookHow.util.ExceptionMessages;

public class ValueHasBadFormat extends RuntimeException {

    public ValueHasBadFormat(String messageError){
        super(String.format(ExceptionMessages.BAD_FORMAT, messageError));
    }
    public ValueHasBadFormat(Throwable cause){
        super(cause);
    }
}
