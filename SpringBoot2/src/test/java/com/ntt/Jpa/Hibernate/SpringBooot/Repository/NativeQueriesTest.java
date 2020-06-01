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
class NativeQueriesTest {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	 @Autowired
	 EntityManager em;
	
	 @Test
	public void native_queries_basic() {
	
		 Query query = em.createNativeQuery("SELECT * FROM COURSE", Course.class);
		 List resultList = query.getResultList();
	 
		logger.info("Select * From Course  -> {}", resultList);
		
	 }
	 
	 
	
}
