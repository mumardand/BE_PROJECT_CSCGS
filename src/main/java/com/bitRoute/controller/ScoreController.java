package com.bitRoute.controller;

import com.bitRoute.entity.Scores;
import com.bitRoute.service.ScoreService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Scores saveDepartment(@Valid @RequestBody Scores scores){
//        DepartmentService service=new DepartmentServiceImpl();
        logger.info("Inside saveScore");
        return scoreService.saveScore(scores);
    }

}
