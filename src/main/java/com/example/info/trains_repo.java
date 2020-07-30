package com.example.info;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface trains_repo extends MongoRepository<Train, String> {
    @Query(value="{trainName:?0}")
    Train findBytrainName(String trainName);
    List<Train> findBySourceAndDestination(String source,String destination);
    Train save(Train t);
}
