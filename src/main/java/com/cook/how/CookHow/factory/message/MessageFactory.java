package com.cook.how.CookHow.factory.message;

public class MessageFactory{

    public String createElementCantBeEmpty(String element){
        return formatStrings(Messages.CANT_BE_EMPTY, element);
    }

    public String createElementAlreadyExist(String element){
        return formatStrings(Messages.ALREADY_EXIST, element);
    }

    public String lengthMustBeGraterThanThree(String element){
        return formatStrings(Messages.LENGTH_MUST_BE_GRATER_THAN_THREE,element);
    }

    public String createInternalError(){
        return Messages.INTERNAL_ERROR;
    }

    public String createCantFindElement(){
        return Messages.CANT_FIND_ELEMENT;
    }

    protected String formatStrings(String firstElement, String secondElement){
        return String.format(firstElement, secondElement);
    }
}
