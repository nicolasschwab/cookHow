package com.cook.how.CookHow.factory.message;

import org.springframework.stereotype.Component;

@Component
public class IngredientMessageFactory extends MessageFactory{

    @Override
    protected String formatStrings(String firstElement, String secondElement){
        return String.format(firstElement, "Ingredient " + secondElement);
    }


}
