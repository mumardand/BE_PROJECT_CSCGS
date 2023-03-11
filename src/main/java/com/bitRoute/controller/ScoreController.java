package com.bitRoute.controller;

import com.bitRoute.entity.Scores;
import com.bitRoute.service.ScoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    private final Logger logger= LoggerFactory.getLogger(ScoreController.class);

    @PostMapping("/scores")
    public ResponseEntity<String> saveDepartment(@Valid @RequestBody Scores scores){
        logger.info("Inside saveScore");
        logger.info(scoreService.saveScore(scores).toString());
//          return scoreService.saveScore(scores);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity<>("{Suggested_Domain: None}", headers, HttpStatus.CREATED);
    }

}
