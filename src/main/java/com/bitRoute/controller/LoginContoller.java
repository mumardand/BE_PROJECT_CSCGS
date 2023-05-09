package com.bitRoute.controller;

import com.bitRoute.entity.SignUP;
import com.bitRoute.service.questions.QuestionsService;
import com.bitRoute.service.score.ScoreService;
import com.bitRoute.service.signUp.SignUpService;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginContoller {
//    @Autowired
//    private LoginService loginService;
    @Autowired
    private SignUpService signUpService;

    private final Logger logger= LoggerFactory.getLogger(LoginContoller.class);

    @GetMapping("/login/{username}")
    public ResponseEntity<String> getQuestions(@PathVariable String username) throws JSONException {
        logger.info("Inside Login");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(signUpService.findCredentials(username), headers, HttpStatus.CREATED);
    }
}
