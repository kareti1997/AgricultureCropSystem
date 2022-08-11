package com.eaxmple.Farmer.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eaxmple.Farmer.models.Farmer;
import com.eaxmple.Farmer.repository.FarmerRepository;

@Service
public class FarmerService {
    @Autowired
    private FarmerRepository farmerRepository;
    
    public List<Farmer> getAllFarmers()
    {
    List<Farmer> farmers=new ArrayList<>();
    farmerRepository.findAll()
    .forEach(farmers::add);
    return farmers;
    }
    
    public void add(Farmer farmer) {
        farmerRepository.save(farmer);
    }
    
    public void Update(Farmer farmer) {
        farmerRepository.save(farmer);

        }
    
    public void delete(String Farmid) {
        farmerRepository.deleteById(Farmid);

        }
    
    public Optional<Farmer> getFarmer(String Farmid) {
        // TODO Auto-generated method stub
        return null;
    }

}
    
