package com.ntt;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
	
	private Point center;
	
public Point getCenter() {
		return center;
	}

    @Required
	public void setCenter(Point center) {
		this.center = center;
	}
    @PostConstruct
    public void initializeCircle() {
    	System.out.println("Init circle");
    }
    @PreDestroy
    public void destroyCircle() {
    	
    	System.out.println("Destroy of circle");
    }
    

public void draw() {
	System.out.println("Drawing Circle");
	System.out.println("Circle Point Is: (" + center.getX() + "," + center.getY() + ")" );
	
}


}
