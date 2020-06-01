package com.ntt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Circle implements Shape {
	
	private Point center;
	@Autowired
	private MessageSource messageSource;
	
	
	
public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	} 

public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

public void draw() {
	System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Drawing Message", null));
	System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX() ,center.getY()}, "Default Point Message", null));

	//System.out.println("Circle Point Is: (" + center.getX() + "," + center.getY() + ")" );
	//System.out.println(this.messageSource.getMessage("greeting", null, "Default Greeting", null));
}


}
