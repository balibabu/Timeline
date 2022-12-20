package com.jpa.hibernet.course.jpa;

import org.springframework.stereotype.Repository;

import com.jpa.hibernet.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepo {
	@PersistenceContext //or @Autowired can be written
	private EntityManager entityManager;

	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	public void deleteById(long id) {
		Course course=entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
}
