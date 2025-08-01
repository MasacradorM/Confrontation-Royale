package gameRC.sena.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gameRC.sena.DTO.CardsDTO;
import gameRC.sena.model.Cards;
import gameRC.sena.repository.ICards;

@Service
public class CardsSevice {

    @Autowired
    private ICards iCards;

    public List<Cards> findByAllCards(){
        return iCards.findAll();
    }

    public Optional<Cards> findByCardsId(int cardsId){
        return iCards.findById(cardsId);
    }


    public void save(Cards cards){
        iCards.save(cards);
    }

    public CardsDTO convertToDTO(Cards cards){
        CardsDTO cardsdto  = new CardsDTO(
            cards.getCharacterName(),
            cards.getPosition(),
            cards.getClub(),
            cards.getImage()
        );
        return cardsdto;
    }

    public Cards convertToModel(Cards cardsdto){
        Cards cards = new Cards(
            0,
            cardsdto.getCharacterName(),
            cardsdto.getPosition(),
            cardsdto.getClub(),
            cardsdto.getImage());

            return cards;
    }


    
    
}
