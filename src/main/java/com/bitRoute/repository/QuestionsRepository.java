package com.bitRoute.repository;

import com.bitRoute.entity.Questions;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface QuestionsRepository extends MongoRepository<Questions,String> {
    List<Questions> findByDomainId(String domain);
}
