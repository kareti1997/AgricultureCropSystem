package com.eaxmple.Farmer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.eaxmple.Farmer.models.Farmer;



public interface FarmerRepository  extends MongoRepository<Farmer , String>{

}
