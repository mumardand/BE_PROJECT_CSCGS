package com.bitRoute.repository;


import com.bitRoute.entity.SignUP;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
SignUpRepository  extends MongoRepository<SignUP,String> {
    SignUP findByEmail(String username);
}
