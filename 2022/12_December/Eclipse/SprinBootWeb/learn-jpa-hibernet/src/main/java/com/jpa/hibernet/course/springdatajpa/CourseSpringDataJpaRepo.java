package com.jpa.hibernet.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.hibernet.course.Course;

public interface CourseSpringDataJpaRepo extends JpaRepository<Course, Long>{
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
