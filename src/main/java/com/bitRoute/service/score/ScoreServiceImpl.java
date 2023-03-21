package com.bitRoute.service.score;

import com.bitRoute.entity.Scores;
import com.bitRoute.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ScoreServiceImpl implements ScoreService {
    static String currentScore;

    @Autowired
    private ScoreRepository scoreRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public String saveScore(Scores scores) {
        currentScore= String.valueOf(scores);
        System.out.println(currentScore);
        return "Suggested Domain: "+ null;
    }
}
