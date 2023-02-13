package com.atm.gameserch.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atm.gameserch.dto.GameDTO;
import com.atm.gameserch.entities.Game;
import com.atm.gameserch.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameDTO> findAll() {
		List<Game> list = gameRepository.findAll();
		return list.stream().map(game -> new GameDTO(game)).collect(Collectors.toList());
	}
	
	

}
