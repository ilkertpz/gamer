package com.gamerface.model.infra;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;


@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

  private static final String DATABASE_NAME = "gamerface";
  private static final String COLLECTION_NAME = "test";

  @Value("${mongo-db.url}")
  private String dbUrl;

  @Override
  protected String getDatabaseName() {
    return DATABASE_NAME;
  }

  @Override
  public MongoClient mongoClient() {
    ConnectionString connectionString = new ConnectionString(dbUrl);
    MongoClientSettings mongoClientSettings = MongoClientSettings.builder()
        .applyConnectionString(connectionString)
        .build();

    return MongoClients.create(mongoClientSettings);
  }

  @Override
  public Collection getMappingBasePackages() {
    return Collections.singleton(COLLECTION_NAME);
  }
}
