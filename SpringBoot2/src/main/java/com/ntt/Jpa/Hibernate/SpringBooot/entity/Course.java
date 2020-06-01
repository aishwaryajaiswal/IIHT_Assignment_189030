package com.ntt.Jpa.Hibernate.SpringBooot.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@NamedQuery(name="query_get_all_courses", query="Select c From Course c")
@NamedQuery(name="query_get_100_Step_courses", query="Select c From Course c where name like '%100 Steps'")

public class Course {
	
	 @Id
	 @GeneratedValue
	 private long id;
	 
	 @Column(nullable = false)
	 private String name;
	 
	 @UpdateTimestamp
	 private LocalDateTime lastUpdatedDate;
	 
	 @CreationTimestamp
	 private LocalDateTime createdDate;
	 
	 protected Course() {
		 
	 }

	public Course(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + "]";
	}
	 
	 
}
