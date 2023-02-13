package com.atm.gameserch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atm.gameserch.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}
