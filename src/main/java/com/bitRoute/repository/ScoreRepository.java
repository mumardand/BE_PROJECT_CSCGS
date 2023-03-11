package com.bitRoute.repository;

import com.bitRoute.entity.Scores;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends MongoRepository<Scores,String> {
}
