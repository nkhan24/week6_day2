package com.bnta.chocolate.controllers;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.services.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ChocolateController {

        @Autowired
        private ChocolateService chocolateService;


        @GetMapping("/chocolates")
        public List<Chocolate> getAllChocolates(){
            return chocolateService.getAllChocolates();
        }
        @GetMapping("/chocolates/1")
        Chocolate firstOne() {
                return chocolateService.getAllChocolates().get(0);
        }
        @PostMapping("/chocolates")
        Chocolate post(@RequestBody Chocolate chocolate){
                return chocolateService.save(chocolate);
}
}
