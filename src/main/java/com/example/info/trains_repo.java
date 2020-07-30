package com.example.info;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;

@Configuration
public interface trains_repo extends MongoRepository<Train, String> {

}
