package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.ChocolateService;
import com.bnta.chocolate.services.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
@RestController
public class EstateController {
    @Autowired
    private EstateService estateService;


    @GetMapping("/estates")
    public List<Estate> getAllEstates() {
        return estateService.getAllEstates();
    }

    @GetMapping("/estates/1")
        Estate firstOne(){
        return estateService.getAllEstates().get(0);
    }

    @PostMapping("/estates")
    Estate post(@RequestBody Estate estate){
        return estateService.save(estate);
    }
}
