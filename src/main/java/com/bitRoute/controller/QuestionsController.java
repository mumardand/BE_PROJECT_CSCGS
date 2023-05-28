package com.bitRoute.controller;

import com.bitRoute.entity.Questions;
import com.bitRoute.entity.Scores;
import com.bitRoute.service.questions.QuestionsService;
import com.bitRoute.service.score.ScoreService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.bson.json.JsonObject;
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
@Api(value = "Questions", description = "Questions Api")
public class QuestionsController {
    @Autowired
    private QuestionsService questionsService;

    private final Logger logger= LoggerFactory.getLogger(QuestionsController.class);
    @ApiOperation("Get all questions")
    @GetMapping("/questions")
    public ResponseEntity<String> getQuestions(){
        logger.info("Inside getQuestions");
        logger.info(questionsService.findQuestions());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return ResponseEntity.status(HttpStatus.CREATED).body(questionsService.findQuestions());
//        return new ResponseEntity<>(questionsService.findQuestions(), headers, HttpStatus.CREATED);
    }
    @ApiOperation("Get questions by domain Id")
    @GetMapping("/questions/{domain}")
    public ResponseEntity<String> getQuestionsByDomain(@PathVariable String domain) throws JSONException {
        logger.info("Inside getQuestionsByDomain");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        JSONObject jsonObject = new JSONObject(questionsService.findByDomainId(domain));
        if (jsonObject.toString().contains("statusCode"))
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("UserNameDoesNotExist");
        else
            return ResponseEntity.status(HttpStatus.CREATED).body(jsonObject.toString());
//        return new ResponseEntity<>(questionsService.findByDomainId(domain), headers, HttpStatus.CREATED);
    }

}
