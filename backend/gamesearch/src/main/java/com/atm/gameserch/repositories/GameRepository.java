package com.atm.gameserch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atm.gameserch.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
