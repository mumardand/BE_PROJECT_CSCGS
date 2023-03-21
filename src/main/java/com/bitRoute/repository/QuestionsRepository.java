package com.bitRoute.repository;

import com.bitRoute.entity.Questions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionsRepository extends MongoRepository<Questions,String> {
}
