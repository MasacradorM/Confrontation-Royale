package gameRC.sena.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gameRC.sena.service.CardsSevice;

import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/v1/crads")
public class CardsController {
    
    @Autowired
    private CardsSevice cardsService;

    @GetMapping("/")
    public ResponseEntity<Object> findAllCards() {
        var ListCards= cardsService.findByAllCards();
        return new RequestEntity<Object>(ListCards,HttpStatus.OK);
    }
    

}
