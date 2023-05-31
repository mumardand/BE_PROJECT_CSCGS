package com.bitRoute.service.signUp;

import com.bitRoute.entity.SignUP;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONException;

public interface SignUpService {
    public String saveUserDetails(SignUP signUP) throws JSONException;
    public String findCredentials(String username) throws JSONException;

    public String findProfile(String username) throws JsonProcessingException;
}
