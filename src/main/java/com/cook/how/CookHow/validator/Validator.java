package com.cook.how.CookHow.validator;

import java.util.List;
import java.util.function.Supplier;

import com.cook.how.CookHow.factory.message.MessageFactory;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import com.cook.how.CookHow.exception.ElementCantBeEmpty;
import com.cook.how.CookHow.exception.StringLengthMustBeGraterThanThree;

abstract class Validator {

    private static MessageFactory messageFactory = new MessageFactory();

    private static void stringIsNotNullNorEmpty(String aString, Supplier<String> function){
         if (StringUtils.isEmpty(aString)) throw new ElementCantBeEmpty(function.get());
    }

    private static void stringLengthIsGraterThanTwo(String aString, Supplier<String> function){
    	if (aString.length() < 3) throw new StringLengthMustBeGraterThanThree(function.get());
    }

    private static void hasAtLeastOneElement(List<?> aList, Supplier<String> function){
    	if (CollectionUtils.isEmpty(aList)) throw new ElementCantBeEmpty(function.get());
    }

    private static void objetCantBeNull(Object object, Supplier<String> function){
        if (object == null)  throw new ElementCantBeEmpty(function.get());
    }

    static void objetCantBeNull(Object object, String element){
        objetCantBeNull(object, ()-> messageFactory.createElementCantBeEmpty(element));
    }

    static void stringIsNotNullNorEmpty(String aString, String element){
        stringIsNotNullNorEmpty(aString, ()-> messageFactory.createElementCantBeEmpty(element));
    }

    static void stringLengthIsGraterThanTwo(String aString, String element){
        stringLengthIsGraterThanTwo(aString, ()-> messageFactory.createElementCantBeEmpty(element));
    }

    static void hasAtLeastOneElement(List<?> aList, String element){
        hasAtLeastOneElement(aList, ()-> messageFactory.createElementCantBeEmpty(element));
    }

}
