package com.microservice.crop.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.crop.model.Crop;
import com.microservice.crop.repository.CropRepository;
import com.microservice.crop.service.CropService;


@RestController
public class CropController {

    @Autowired
    private CropService cropService;

    @RequestMapping("/crop/{Cropid}")
    public Optional<Crop> getCrop(@PathVariable("Cropid") String Cropid)
    {
        return cropService.getCrop(Cropid);
    }
    @RequestMapping(method=RequestMethod.GET, value="/crop")
    public List<Crop> getAllCrops()
    {
    return cropService.getAllCrops();
    }

    @RequestMapping(method=RequestMethod.POST,value="/crop")
    public void addcrop(@RequestBody Crop crop)
    {
    cropService.add(crop);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/crop/update/{Cropid}")
    public Crop updateCrop(@RequestBody Crop crop, @PathVariable("Cropid") String Cropid)
    {   crop.setCropid(Cropid);
         cropService.Update(crop);
         return crop;
    }

    @RequestMapping(method = RequestMethod.DELETE, value="crop/{Cropid}")
    public String deleteCropid(@PathVariable String Cropid) {
        cropService.delete(Cropid);
        return Cropid;
    }

}