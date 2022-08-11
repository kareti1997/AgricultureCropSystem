package com.microservice.dealer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.dealer.model.Dealer;
import com.microservice.dealer.repository.DealerRepository;


@RestController
@RequestMapping("/dealers")

public class DealerController {

	@Autowired
	DealerRepository dealerRepository;
	
	@GetMapping(path="/dealers")
    public List<Dealer> getAlldealer(){
        return dealerRepository.findAll();
    }
	
	@PostMapping("/adddealers")
    public String saveBook(@RequestBody Dealer dealer) {
        dealerRepository.save(dealer);
        return "Added Dealers with id : " + dealer.getDealid();
	}
	
	@GetMapping("/getAlldealers/{Dealid}")
    public java.util.Optional<Dealer> getDealName(@PathVariable("Dealid") String Dealid) {
        return dealerRepository.findById(Dealid);
	}
	
	@DeleteMapping("/delete/{Dealid}")
    public String deleteDealer (@PathVariable String Dealid) {
        dealerRepository.deleteById(Dealid);
        return "Dealer deleted with no : "+Dealid;

    }

    @PutMapping("/update/{Dealid}")
    public Dealer updateDealer(@PathVariable("Dealid") String Dealid,@RequestBody Dealer t ) {
        t.setDealno(Dealid);
        dealerRepository.save(t);
        return t;

    }
}
