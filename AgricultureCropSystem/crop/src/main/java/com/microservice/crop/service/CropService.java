package com.microservice.crop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.crop.model.Crop;
import com.microservice.crop.repository.CropRepository;

@Service
public class CropService {
    @Autowired
    private CropRepository cropRepository;


    public List<Crop> getAllCrops()
    {
    List<Crop> cropsbook=new ArrayList<>();
    cropRepository.findAll()
    .forEach(cropsbook::add);
    return cropsbook;
    }

    public void add(Crop crop) {
    cropRepository.save(crop);


    }


    public void Update(Crop crop) {
    cropRepository.save(crop);

    }
    public void delete(String Cropid) {
    cropRepository.deleteById(Cropid);

    }

    public Optional<Crop> getCrop(String Cropid) {
        // TODO Auto-generated method stub
        return null;
    }


    }