package com.bitRoute.controller;

import com.bitRoute.entity.Login;
import com.bitRoute.service.signUp.SignUpService;
import org.json.JSONException;
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
public class ProfileController {
    @Autowired
    private SignUpService signUpService;

    private final Logger logger= LoggerFactory.getLogger(LoginContoller.class);
    @GetMapping("/profile/{username}")
    public ResponseEntity<String> getProfile(@PathVariable String username) throws JSONException {
        logger.info("Inside Profile");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(signUpService.findProfile(username), headers, HttpStatus.CREATED);

    }
    }
