package com.neo.springboot_module.neospringbootmodule.models;

/**
 * @author Neo
 * @since 10/06/2020-10:00 PM
 */
public class AuthenticationResponse {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
