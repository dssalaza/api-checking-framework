package com.restfulbooker.api.payloads.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthResponse {

/*
    {
        "token": "abc123"
    }
*/

    @JsonProperty
    private String token;

    public String getToken(){
        return token;
    }

    public void setToken(String token){
        this.token = token;
    }

}
