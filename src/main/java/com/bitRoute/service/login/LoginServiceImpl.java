package com.bitRoute.service.login;

import com.bitRoute.repository.LoginRepository;
import com.bitRoute.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private LoginRepository loginRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
}
