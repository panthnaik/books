package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class BooksEntity {
	@Id
	int id;
	String name;
	
	public BooksEntity() {
		super();
	}
	public BooksEntity(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "BooksEntity [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
