package com.bitRoute.repository;

import com.bitRoute.entity.Login;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends MongoRepository<Login,String> {

}
