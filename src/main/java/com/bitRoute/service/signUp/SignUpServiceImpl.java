package com.bitRoute.service.signUp;
import org.json.JSONException;
import org.json.JSONObject;

import com.bitRoute.entity.SignUP;
import com.bitRoute.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {
    @Autowired
    private SignUpRepository signUpRepository;

    @Override
    public String saveUserDetails(SignUP signUP)  {
        System.out.println(signUpRepository.findByEmail(signUP.getEmail()));
            if(signUpRepository.findByEmail(signUP.getEmail())==null){
                signUpRepository.save(signUP);
                return "SignUp Successful!!!";
            }
                return " Username Already Exists!!!";


    }

    @Override
    public String findCredentials(String username) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        if(signUpRepository.findByEmail(username)!=null) {
            jsonObject.put("email", signUpRepository.findByEmail(username).getEmail());
            jsonObject.put("password", signUpRepository.findByEmail(username).getPassword());
            return jsonObject.toString();
        }
        else {
            return null;
        }
    }

    @Override
    public String findProfile(String username) {

        return signUpRepository.findByEmail(username).toString();
    }
}
