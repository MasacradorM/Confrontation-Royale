package gameRC.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gameRC.sena.model.Cards;

public interface ICards 
extends JpaRepository< Cards, Integer>

{

    
}
