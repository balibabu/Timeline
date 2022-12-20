package com.jpa.hibernet.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.hibernet.course.jpa.CourseJpaRepo;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepo repository;
	
	@Autowired
	private CourseJpaRepo repository;

	@Override
	public void run(String... args) throws Exception {	
		repository.insert(new Course(1,"Learn Spring","by Bali"));
		repository.insert(new Course(2,"Learn AWS","by Bali"));
		repository.insert(new Course(3,"Learn AZURE","by Bali"));
		
		repository.deleteById(1);
		System.out.println(repository.findById(2));
	}

}
