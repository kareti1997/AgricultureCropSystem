package com.microservice.crop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.crop.model.Crop;


public interface CropRepository  extends MongoRepository<Crop , String>{

}
