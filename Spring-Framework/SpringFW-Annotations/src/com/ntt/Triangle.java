package com.ntt;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service  //@Repository //Controller
public class Triangle implements Shape {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	@Resource(name = "pointC")
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	@Autowired
	@Qualifier("triangleRealated")
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		
	
		System.out.println("Point A= (" + getPointA().getX() +", "+getPointA().getY()+ ")");

		System.out.println("Point B= (" + getPointB().getX() +", "+getPointB().getY() +")");

		System.out.println("Point C= (" + getPointC().getX() +", "+getPointC().getY() +")");

	}
	

}
