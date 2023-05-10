package com.bitRoute.repository;

import com.bitRoute.entity.Login;
import com.bitRoute.entity.Questions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginRepository extends MongoRepository<Login,String> {
}
