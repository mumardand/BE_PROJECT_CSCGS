package com.bitRoute.service.questions;

import com.bitRoute.repository.QuestionsRepository;
import com.bitRoute.repository.ScoreRepository;
import com.bitRoute.service.questions.QuestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class QuestionsServiceImpl implements QuestionsService {
    @Autowired
    private QuestionsRepository questionsRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public String findQuestions() {

        return questionsRepository.findAll().toString();
    }
}
