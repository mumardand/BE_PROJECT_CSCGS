package com.bitRoute.service.signUp;

import com.bitRoute.entity.SignUP;
import org.json.JSONException;

public interface SignUpService {
    public String saveUserDetails(SignUP signUP) throws JSONException;
    public String findCredentials(String username) throws JSONException;
}
