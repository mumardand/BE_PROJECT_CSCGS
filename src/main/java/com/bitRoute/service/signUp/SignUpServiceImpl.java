package com.bitRoute.service.signUp;
import com.bitRoute.entity.SubjectDetails;
import com.mongodb.DuplicateKeyException;
import com.mongodb.MongoWriteException;
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
            if(signUpRepository.findByEmail(signUP.getEmail())==null){
                signUpRepository.save(signUP);
                return "SignUp Successful!!!";
            }
            else {
                return " Username Already Exists!!!";
            }

    }

    @Override
    public String findCredentials(String username) throws JSONException {
        JSONObject jsonObject = new JSONObject();
        if(signUpRepository.findByEmail(username)!=null) {
            jsonObject.put("username", signUpRepository.findByEmail(username).getEmail());
            jsonObject.put("password", signUpRepository.findByEmail(username).getPassword());
            return jsonObject.toString();
        }
        else {
            return "Username Does not Exist!!! Please Sign Up!!!";
        }
    }

    @Override
    public String findProfile(String username) {

        return signUpRepository.findByEmail(username).toString();
    }
}
