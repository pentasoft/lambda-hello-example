/**
 * Copyright 2016 Pentasoft Sistemas SL.
 */
package io.pst.lambda.hello.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * @author Borja Lopez Altarriba
 *
 */
public class Hello implements RequestHandler<Request, Response> {
    
    public Response handleRequest(Request request, Context context) {
        String greetingString = String.format("Hello %s %s.", request.firstName, request.lastName);
        return new Response(greetingString);
    }
}
