package com.bitRoute.repository;

import com.bitRoute.entity.Common;
import com.bitRoute.entity.Questions;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CommonRepository extends MongoRepository<Common,String> {

}
