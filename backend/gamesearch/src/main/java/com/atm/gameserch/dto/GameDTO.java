package com.atm.gameserch.dto;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;

import com.atm.gameserch.entities.Game;
import com.atm.gameserch.entities.enums.Platform;

public class GameDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private Platform platform;
	
	public GameDTO() {
		
	}

	public GameDTO(Long id, String title, Platform platform) {
		super();
		this.id = id;
		this.title = title;
		this.platform = platform;
	}

	public GameDTO(Game entity) {
		super();
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.platform = entity.getPlatform();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, platform, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameDTO other = (GameDTO) obj;
		return Objects.equals(id, other.id) && platform == other.platform && Objects.equals(title, other.title);
	}
	
	
	
}
