package com.atm.gameserch.dto;

import java.io.Serializable;
import java.time.Instant;

import com.atm.gameserch.entities.Record;
import com.atm.gameserch.entities.enums.Platform;

public class RecordDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Instant moment;
	private String name;
	private Integer age;
	private String gameTitle;
	private Platform gamePlatform;
	private String genreName;
	
	
	public RecordDTO() {
		super();
	}


	public RecordDTO(Long id, Instant moment, String name, Integer age, String gameTitle, Platform gamePlatform,
			String genreName) {
		super();
		this.id = id;
		this.moment = moment;
		this.name = name;
		this.age = age;
		this.gameTitle = gameTitle;
		this.gamePlatform = gamePlatform;
		this.genreName = genreName;
	}


	public RecordDTO(Record entity) {
		super();
		this.id = entity.getId();
		this.moment = entity.getMoment();
		this.name = entity.getName();
		this.age = entity.getAge();
		this.gameTitle = entity.getGame().getTitle();
		this.gamePlatform = entity.getGame().getPlatform();
		this.genreName = entity.getGame().getGenre().getName();
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Instant getMoment() {
		return moment;
	}


	public void setMoment(Instant moment) {
		this.moment = moment;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getGameTitle() {
		return gameTitle;
	}


	public void setGameTitle(String gameTitle) {
		this.gameTitle = gameTitle;
	}


	public Platform getGamePlatform() {
		return gamePlatform;
	}


	public void setGamePlatform(Platform gamePlatform) {
		this.gamePlatform = gamePlatform;
	}


	public String getGenreName() {
		return genreName;
	}


	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	
	
	
	
	
	

}
