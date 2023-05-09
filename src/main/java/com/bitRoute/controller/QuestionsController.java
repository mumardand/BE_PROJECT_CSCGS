package com.bitRoute.controller;

import com.bitRoute.entity.Questions;
import com.bitRoute.entity.Scores;
import com.bitRoute.service.questions.QuestionsService;
import com.bitRoute.service.score.ScoreService;
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
public class QuestionsController {
    @Autowired
    private QuestionsService questionsService;

    private final Logger logger= LoggerFactory.getLogger(QuestionsController.class);

    @GetMapping("/questions")
    public ResponseEntity<String> getQuestions(){
        logger.info("Inside getQuestions");
        logger.info(questionsService.findQuestions());
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(questionsService.findQuestions(), headers, HttpStatus.CREATED);
    }

    @GetMapping("/questions/{domain}")
    public ResponseEntity<String> getQuestionsByDomain(@PathVariable String domain) throws JSONException {
        logger.info("Inside getQuestionsByDomain");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>(questionsService.findByDomainId(domain), headers, HttpStatus.CREATED);
    }

}
