package com.microservice.dealer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.dealer.model.Dealer;



public interface DealerRepository  extends MongoRepository<Dealer , String>{

}
