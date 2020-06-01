package com.ntt.Jpa.Hibernate.SpringBooot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ntt.Jpa.Hibernate.SpringBooot.Repository.CourseRepository;
import com.ntt.Jpa.Hibernate.SpringBooot.entity.Course;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private CourseRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	Course course =	repository.findById(10001L);
	
	logger.info("Course 10001 ->{}" , course);

	repository.save(new Course("Microservices in 100 steps"));

	}

}
