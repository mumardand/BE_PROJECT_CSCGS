package com.bitRoute.service.questions;

import com.bitRoute.entity.Answers;
import com.bitRoute.repository.CommonRepository;
import com.bitRoute.repository.QuestionsRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionsServiceImpl implements QuestionsService {
    @Autowired
    private QuestionsRepository questionsRepository;
    @Autowired
    private CommonRepository commonRepository;

    @Override
    public String findQuestions() throws JsonProcessingException, JSONException {
        ObjectMapper objectMapper = new ObjectMapper();
        String allQuestions = objectMapper.writeValueAsString(commonRepository.findAll());
        JSONArray array=new JSONArray(allQuestions);
        return allQuestions.toString();
    }

    @Override
    public String findByDomainId(String Domain) throws JSONException, JsonProcessingException {
//            if(questionsRepository.findByDomainId(Domain)==null){
//                JSONObject object=new JSONObject();
//                object.put("statusCode",404);
//                object.put("message","Question Domain Not Found!!!");
//                return (object.toString());
//            }
        ObjectMapper objectMapper = new ObjectMapper();
        String questions = objectMapper.writeValueAsString(questionsRepository.findByDomainId(Domain));

        return questions.toString();
    }


}
