package com.jpa.hibernet.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.hibernet.course.jpa.CourseJpaRepo;
import com.jpa.hibernet.course.springdatajpa.CourseSpringDataJpaRepo;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepo repository;
	
//	@Autowired
//	private CourseJpaRepo repository;
	
	@Autowired
	private CourseSpringDataJpaRepo repository;

	@Override
	public void run(String... args) throws Exception {	
		repository.save(new Course(1,"Learn Spring","Bali"));
		repository.save(new Course(2,"Learn AWS","Bali"));
		repository.save(new Course(3,"Learn AZURE","Bali"));
		
		repository.deleteById(1l);
		System.out.println(repository.findById(2l));
		System.out.println(repository.findByAuthor("Bali"));
		System.out.println(repository.findByName("Learn AWS"));
	}

}
