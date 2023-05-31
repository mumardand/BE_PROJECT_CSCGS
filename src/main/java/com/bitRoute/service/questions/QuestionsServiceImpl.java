package com.bitRoute.service.questions;

import com.bitRoute.entity.Questions;
import com.bitRoute.repository.QuestionsRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsServiceImpl implements QuestionsService {
    @Autowired
    private QuestionsRepository questionsRepository;

    @Override
    public String findQuestions() {
        return questionsRepository.findAll().toString();
    }

    @Override
    public List<Questions> findByDomainId(String Domain) throws JSONException {
//            if(questionsRepository.findByDomainId(Domain)==null){
//                JSONObject object=new JSONObject();
//                object.put("statusCode",404);
//                object.put("message","Question Domain Not Found!!!");
//                return (object.toString());
//            }
            return questionsRepository.findByDomainId(Domain);
    }


}
