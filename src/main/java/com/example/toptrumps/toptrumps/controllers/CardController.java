package com.example.toptrumps.toptrumps.controllers;

import com.example.toptrumps.toptrumps.models.Card;
import com.example.toptrumps.toptrumps.repositories.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CardController {
    @Autowired
    CardRepository cardRepository;

    @GetMapping(value = "/cards")
    public ResponseEntity<List<Card>> getAllCards(){
        return new ResponseEntity<>(cardRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/cards/{id}")
    public ResponseEntity getCard(@PathVariable Long id){
        return new ResponseEntity<>(cardRepository.findById(id), HttpStatus.OK);
    }
}
