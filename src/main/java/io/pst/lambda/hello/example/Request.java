/**
 * Copyright 2016 Pentasoft Sistemas SL.
 */
package io.pst.lambda.hello.example;

/**
 * @author Borja Lopez Altarriba
 *
 */
public class Request {
    String firstName;
    String lastName;

    public Request() {
    }

    public Request(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
