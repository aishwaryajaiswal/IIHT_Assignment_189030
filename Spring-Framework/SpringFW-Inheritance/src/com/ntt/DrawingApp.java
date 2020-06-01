package com.ntt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle1");
		triangle.draw();

	}

}



/*
 * <bean id="parenttriangle" class="com.ntt.Triangle" abstract="true"> //it will not create the bean it will use it as a template
 * <property name="points" > 
 * <list>
 * <ref bean="pointA">
 * </list>
 * </property>
 * </bean>
 * 
 * <bean id="triangle1" class="com.ntt.Triangle" parent="parenttriangle">
 * <property name="points">
 * <list merge ="true"> //It will not override it will just add up with the parenet triangle 
 * 
 * <ref bean="pointB">
 * </list>
 * </property> </bean>
 */