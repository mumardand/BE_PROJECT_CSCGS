package com.bitRoute.service;

import com.bitRoute.entity.Scores;
import com.bitRoute.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class ScoreServiceImpl implements  ScoreService{

    @Autowired
    private ScoreRepository scoreRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public Scores saveScore(Scores scores) {
        return scoreRepository.save(scores);
    }
}
