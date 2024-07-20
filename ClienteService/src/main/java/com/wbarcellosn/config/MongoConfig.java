package com.wbarcellosn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.wbarcellosn.repository")
public class MongoConfig {

}
