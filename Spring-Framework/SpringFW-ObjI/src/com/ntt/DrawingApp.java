package com.ntt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) context.getBean("triangle");
		triangle.draw();

	}

}

//to have extra validation for valid id
//<idref="zeroPoint"/>


//to change the name for our convenient
//<alias name="triangle" alias="triangle-alias"/>


//Inner Bean

/*
 * <beans>
 * 
 * <bean id="triangle" class="com.ntt.Triangle"> 
 * <property name="pointA" ref="zeroPoint"/> 
 * 
 * <property name="pointB" > 
 * 
 *  </bean>
 * 
 * <bean class="com.ntt.Point"> 
 * <property name="x" value="20" />
 * <property name="y" value="0" />
 * 
 * 
 * </bean>
 * </property>
 * 
 * <property name="pointC">
 * 
 * <bean class="com.ntt.Point"> 
 * <property name="x" value="20" />
 * <property name="y" value="0" />
 * 
 * </property>
 * </bean>
 * 
 * <bean id="zeroPoint" class="com.ntt.Point"> <property name="x" value="0" />
 * <property name="y" value="0" />
 * 
 * 
 *
 * 
 * 
 * 
 * </beans>
 */
