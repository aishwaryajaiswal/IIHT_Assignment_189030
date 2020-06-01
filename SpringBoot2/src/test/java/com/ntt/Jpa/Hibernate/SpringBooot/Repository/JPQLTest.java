package com.ntt.Jpa.Hibernate.SpringBooot.Repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.ntt.Jpa.Hibernate.SpringBooot.DemoApplication;
import com.ntt.Jpa.Hibernate.SpringBooot.entity.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
class JPQLTest {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	 @Autowired
	 EntityManager em;
	
	 @Test
	public void jpql_basics() {
	
		 Query query = em.createNamedQuery("query_get_all_courses");
		 List resultList = query.getResultList();
	 
		logger.info("Select c From Course c -> {}", resultList);
		
	 }
	 
	 @Test
		public void jpql_typed() {
		
		 
		   TypedQuery<Course> query = em.createNamedQuery("query_get_all_courses", Course.class);
			 List resultList = query.getResultList();
		 
			logger.info("Select c From Course c -> {}", resultList);
			
		 } 
	
	 
	 @Test
		public void jpql_Where() {
		
		 
		   TypedQuery<Course> query = em.createNamedQuery("Select c From Course c where name like '%100 Steps '", Course.class);
			 List resultList = query.getResultList();
		 
			logger.info("Select c From Course c where name like '%100 Steps' -> {}", resultList);
			
		 } 
	
	
}
