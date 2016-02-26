/**
 * Copyright 2016 Pentasoft Sistemas SL.
 */
package io.pst.lambda.hello.example;

/**
 * @author Borja Lopez Altarriba
 *
 */
public class Response {
    String greetings;

    public Response() {
    }

    public Response(String greetings) {
        this.greetings = greetings;
    }

    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }
}
