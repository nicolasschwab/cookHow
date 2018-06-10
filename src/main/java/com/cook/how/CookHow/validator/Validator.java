package com.cook.how.CookHow.validator;

import java.util.List;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.cook.how.CookHow.exception.ElementCantBeEmpty;
import com.cook.how.CookHow.exception.StringLengthMustBeGraterThanThree;

public abstract class Validator {

    static void stringIsNotNullNorEmpty(String aString, String errorMessage){
         if (StringUtils.isEmpty(aString)) throw new ElementCantBeEmpty(errorMessage);
    }
    
    static void stringLengthIsThree(String aString, String errorMessage){
    	if (aString.length() < 3) throw new StringLengthMustBeGraterThanThree(errorMessage);
    }
    
    static void hasAtLeastOneElement(List<?> aList, String errorMessage){
    	if (CollectionUtils.isEmpty(aList)) throw new ElementCantBeEmpty(errorMessage);
    }
}
