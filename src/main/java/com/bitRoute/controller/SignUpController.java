package com.bitRoute.controller;

import com.bitRoute.entity.Scores;
import com.bitRoute.entity.SignUP;
import com.bitRoute.entity.SubjectDetails;
import com.bitRoute.service.score.ScoreService;
import com.bitRoute.service.signUp.SignUpService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api")
@Api(value = "SignUp", description = "SignUp Api")
public class SignUpController {
    @Autowired
    private SignUpService signUpService;

    private final Logger logger= LoggerFactory.getLogger(SignUpController.class);

    @ApiOperation("Post SignUp Api")
    @PostMapping("/signUp")
    public ResponseEntity<String> saveUserDetails(@Valid @RequestBody SignUP signUP) throws JSONException {
        logger.info("Inside signUp");
//        logger.info(signUpService.saveUserDetails(signUP).toString());
////         creating UUID
//        UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
//        scores.setId(String.valueOf(uid.randomUUID()));
        SubjectDetails subjectDetails=signUP.getSubjectDetails();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return ResponseEntity.status(HttpStatus.CREATED).body(signUpService.saveUserDetails(signUP));
//        return new ResponseEntity<>(signUpService.saveUserDetails(signUP), headers, HttpStatus.CREATED);
    }
}
