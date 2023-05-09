package com.bitRoute.service.questions;

import com.bitRoute.entity.Questions;
import com.bitRoute.repository.QuestionsRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.bson.json.JsonObject;
import org.json.JSONException;
import org.json.JSONObject;
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

    @Override
    public String findByDomainId(String domain) throws JSONException {
        if(questionsRepository.findByDomainId(domain)==null){
            JSONObject object=new JSONObject();
            object.put("statusCode",404);
            object.put("message","Question Domain Not Found!!!");
            return (object.toString());
        }
        return questionsRepository.findByDomainId(domain).toString();
    }
}
