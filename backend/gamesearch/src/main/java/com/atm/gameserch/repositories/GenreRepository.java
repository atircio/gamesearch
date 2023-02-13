package com.atm.gameserch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atm.gameserch.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
