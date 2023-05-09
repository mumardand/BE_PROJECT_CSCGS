package com.bitRoute.service.questions;

import com.bitRoute.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionsServiceImpl implements QuestionsService {
    @Autowired
    private QuestionsRepository questionsRepository;

    @Override
    public String findQuestions() {

        return questionsRepository.findAll().toString();
    }
}
