package com.ntt;

public class Triangle {
	
	private String type;
	private int height;
	
	
	
	
	public int getHeight() {
		return height;
	}


	public Triangle(String type) {
		super();
		this.type = type;
	}


	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height= height;
	}


	public String getType() {
		return type;
	}


	/*
	 * public void setType(String type) { this.type = type; }
	 */


	public void draw() {
		System.out.println(getType() + "Triangle drwan");
	}

}
