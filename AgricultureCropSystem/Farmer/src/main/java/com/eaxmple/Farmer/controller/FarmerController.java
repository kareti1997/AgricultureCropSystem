package com.eaxmple.Farmer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eaxmple.Farmer.models.Farmer;
import com.eaxmple.Farmer.service.FarmerService;

@RestController
public class FarmerController {

    @Autowired
    private FarmerService farmerService;
    
    @RequestMapping("/farmer/{Farmid}")
    public Optional<Farmer> getFarmer(@PathVariable("Farmid") String Farmid)
    {
        return farmerService.getFarmer(Farmid);
    }
    @RequestMapping(method=RequestMethod.GET, value="/farmer")
    public List<Farmer> getAllFarmers()
    {
    return farmerService.getAllFarmers();
    }
    
    @RequestMapping(method=RequestMethod.POST,value="/farmer")
    public void addfarmer(@RequestBody Farmer farmer)
    {
    farmerService.add(farmer);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/farmer/update/{Farmid}")
    public Farmer updateFarmer(@RequestBody Farmer farmer, @PathVariable("Farmid") String Farmid)
    {   farmer.setFarmid(Farmid);
         farmerService.Update(farmer);
         return farmer;
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value="farmer/{Farmid}")
    public String deleteFarmid(@PathVariable String Farmid) {
        farmerService.delete(Farmid);
        return Farmid;
    }
}