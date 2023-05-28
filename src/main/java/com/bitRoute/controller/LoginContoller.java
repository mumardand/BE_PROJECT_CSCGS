package com.bitRoute.controller;

import com.bitRoute.entity.Login;
import com.bitRoute.entity.Scores;
import com.bitRoute.entity.SignUP;
import com.bitRoute.service.questions.QuestionsService;
import com.bitRoute.service.score.ScoreService;
import com.bitRoute.service.signUp.SignUpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@Api(value = "Login", description = "Login Api")
public class LoginContoller {

    @Autowired
    private SignUpService signUpService;

    private final Logger logger= LoggerFactory.getLogger(LoginContoller.class);
    @ApiOperation("Post Login Api")
    @PostMapping("/login")
    public ResponseEntity<String> postLogin(@Valid @RequestBody Login login) throws JSONException {
        logger.info("Inside Login");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        System.out.println(login.getEmail());
        boolean validCredentials = validateCredentials(login.getEmail(), login.getPassword());
        if (!validCredentials) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
        else {
            return ResponseEntity.status(HttpStatus.CREATED).body("Logged In successfully");

        }
    }
    private boolean validateCredentials(String email, String password) throws JSONException {
//        JSONObject object=new JSONObject (signUpService.findCredentials(email));
//        System.out.println(object.toString());
        if(signUpService.findCredentials(email)!=null ){
            JSONObject object=new JSONObject (signUpService.findCredentials(email));
            System.out.println(signUpService.findCredentials(email));
            System.out.println(object.getString("email"));
            String actualPassword=object.getString("password");
            System.out.println(password+" "+actualPassword);
            if(actualPassword.equals(password)){
                return  true;
            }
        }
        // Perform validation against a database or other authentication mechanism
        // Return true if the credentials are valid, false otherwise
        return false;
    }
}
