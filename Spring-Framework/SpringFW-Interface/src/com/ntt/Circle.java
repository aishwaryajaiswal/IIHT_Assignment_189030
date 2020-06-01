package com.ntt;

public class Circle implements Shape {
	
	private Point center;
	
public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

public void draw() {
	System.out.println("Drawing Circle");
	System.out.println("Circle Point Is: (" + center.getX() + "," + center.getY() + ")" );
	
}


}
