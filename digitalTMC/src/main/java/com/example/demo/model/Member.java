package com.example.demo.model;
import javax.persistence.*;

@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String pathways_level;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPathways_level() {
		return pathways_level;
	}
	public void setPathways_level(String pathways_level) {
		this.pathways_level = pathways_level;
	}
	
	
}
