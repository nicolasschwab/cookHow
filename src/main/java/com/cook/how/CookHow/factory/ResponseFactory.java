package com.cook.how.CookHow.factory;

import com.cook.how.CookHow.exception.InternalServerError;
import com.cook.how.CookHow.factory.message.MessageFactory;
import com.cook.how.CookHow.util.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ResponseFactory {

    private static ObjectMapper objectMapper = new ObjectMapper();

    private static MessageFactory messageFactory = new MessageFactory();

    /*public static Response createOkResponseWithMessage(String message){

    }*/

    public static Response createBadRequestResponse(String message){
        return createErrorResponse(HttpStatus.BAD_REQUEST, message);
    }

    public static Response createInternalErrorResposne(){
        return createErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, messageFactory.createInternalError());
    }

    /**
     * @param payload might be Null. In that case a 404 response will be created
     * @return a Response
     */
    public static <T> Response createResponseWithPayload(List<T> payload){
        return createWithPayload(HttpStatus.OK, payload);
    }

    /**
     * @param payload might be Null. In that case a 404 response will be created
     * @return a Response
     */
    public static <T> Response createResponseWithPayload(T payload){
        return createWithPayload(HttpStatus.OK, payload);
    }

    public static Response createNotFoundResponse(){
        return createErrorResponse(HttpStatus.NOT_FOUND, messageFactory.createCantFindElement());
    }

    private static <T> Response createWithPayload(HttpStatus httpStatus ,T payload){
        if(payload == null){
            return createNotFoundResponse();
        }
        return createOkResponse(httpStatus, payload);
    }

    private static <T> Response createWithPayload(HttpStatus httpStatus ,List<T> payload){
        if(payload == null || payload.isEmpty()){
            return createNotFoundResponse();
        }
        return createOkResponse(httpStatus, payload);
    }

    private static Response createErrorResponse(HttpStatus httpStatus, String message){
        return new Response(httpStatus, message);
    }

    private static <T> Response createOkResponse(HttpStatus httpStatus ,T payload){
        try {
            return new Response(httpStatus , null, objectMapper.writeValueAsString(payload));
        } catch (JsonProcessingException e) {
            throw new InternalServerError();
        }
    }

}
