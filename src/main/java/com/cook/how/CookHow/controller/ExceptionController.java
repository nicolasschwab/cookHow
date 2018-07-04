package com.cook.how.CookHow.controller;

import javax.servlet.http.HttpServletRequest;

import com.cook.how.CookHow.exception.InternalServerError;
import com.cook.how.CookHow.factory.ResponseFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cook.how.CookHow.exception.ElementCantBeEmpty;
import com.cook.how.CookHow.exception.StringLengthMustBeGraterThanThree;
import com.cook.how.CookHow.util.Response;

@ControllerAdvice
public class ExceptionController {

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler({ElementCantBeEmpty.class, StringLengthMustBeGraterThanThree.class})
    @ResponseBody
    public Response handleBadRequest(HttpServletRequest req, Exception ex) {
        return ResponseFactory.createBadRequestResponse(ex.getMessage());
    }

    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(InternalServerError.class)
    @ResponseBody
    public Response handleInternalServerError(HttpServletRequest req, Exception ex) {
        return ResponseFactory.createInternalErrorResposne();
    }

    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Response defaultErrorHandler(HttpServletRequest req, Exception e){
        return ResponseFactory.createBadRequestResponse(e.getMessage());
    }
}
