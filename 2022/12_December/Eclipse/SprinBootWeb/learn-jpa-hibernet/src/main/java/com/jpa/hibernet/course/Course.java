package com.jpa.hibernet.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// jpa started with these annotation

@Entity(name="Course")	//if name is same no need for assigning name
public class Course {
	@Id
	private long id;
	@Column(name="name")
	private String name;
	@Column(name="author")
	private String author;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

}
