package com.bitRoute.controller;

import com.bitRoute.entity.Scores;
import com.bitRoute.service.score.ScoreService;
//import net.bytebuddy.utility.RandomString;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.StringValueExp;
import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/api")
@Api(value = "Score", description = "Score Api Call")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    private final Logger logger= LoggerFactory.getLogger(ScoreController.class);

    @ApiOperation("Post Score")
    @PostMapping("/scores")
    public ResponseEntity<String> saveDepartment(@Valid @RequestBody Scores scores){
        logger.info("Inside saveScore");
        logger.info(scoreService.saveScore(scores).toString());
        // creating UUID
        UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
        scores.setId(String.valueOf(UUID.randomUUID()));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return ResponseEntity.status(HttpStatus.CREATED).body(scoreService.saveScore(scores));
//        return new ResponseEntity<>(scoreService.saveScore(scores).toString(), headers, HttpStatus.CREATED);
    }

}