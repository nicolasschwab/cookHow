package com.cook.how.CookHow.validator;

import org.springframework.util.StringUtils;

public abstract class Validator {

    static Boolean stringIsNotNullNorEmpty(String aString){
        return !StringUtils.isEmpty(aString);
    }
    
    static Boolean stringLengthIs3(String aString){
        return aString.length() == 3;
    }
}
