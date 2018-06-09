package com.cook.how.CookHow.controller;

import com.cook.how.CookHow.exception.ValueHasBadFormat;
import com.cook.how.CookHow.util.ErrorTag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionController {

    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    @ExceptionHandler(ValueHasBadFormat.class)
    @ResponseBody
    ErrorTag handleBadRequest(HttpServletRequest req, Exception ex) {
        return new ErrorTag(ex.getMessage());
    }

}
