package com.gamerface.model.adapter;

import com.gamerface.model.domain.Gamer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamerRepoMongoImpl extends MongoRepository<Gamer, String> {

}

