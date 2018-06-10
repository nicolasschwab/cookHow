package com.cook.how.CookHow.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cook.how.CookHow.exception.ElementCantBeEmpty;
import com.cook.how.CookHow.exception.StringLengthMustBeGraterThanThree;
import com.cook.how.CookHow.util.ErrorTag;

@ControllerAdvice
public class ExceptionController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({ElementCantBeEmpty.class, StringLengthMustBeGraterThanThree.class})
    @ResponseBody
    ErrorTag handleBadRequest(HttpServletRequest req, Exception ex) {
        return new ErrorTag(ex.getMessage());
    }

}
