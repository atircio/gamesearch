package com.atm.gameserch.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atm.gameserch.dto.RecordDTO;
import com.atm.gameserch.dto.RecordInsertDTO;
import com.atm.gameserch.entities.Game;
import com.atm.gameserch.entities.Record;
import com.atm.gameserch.repositories.GameRepository;
import com.atm.gameserch.repositories.RecordRepository;

@Service
public class RecordService {

	@Autowired
	private RecordRepository recordRepository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getReferenceById(dto.getGameId());
		entity.setGame(game);
		entity = recordRepository.save(entity);
		RecordDTO recordDTO = new RecordDTO(entity);
		return recordDTO;
	}

	@Transactional(readOnly = true)
	public Page<RecordDTO> findAllPaged(Pageable pageable) {
		Page<Record> list = recordRepository.findAll(pageable);
		return list.map(x -> new RecordDTO(x));
	}

	@Transactional(readOnly = true)
	public Page<RecordDTO> findByMoment(Instant minDate, Instant maxDate, PageRequest pageRequest) {	
		return recordRepository.findByMoment(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
	}
}
