package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SmartRectangle extends Rectangle {
	
	SmartRectangle(double xPos, double yPos)
	{
		this.setX(xPos);
		this.setY(yPos);
		this.setHeight(100);
		this.setWidth(30);
		this.setFill(Color.CRIMSON);
		System.out.println("HELLLOOOOO : " + this.getX() +" : " +this.getY());
	}

	
//	r.setY(rand.nextDouble()*(i*30));
//	r.setX(rand.nextDouble()*(i*30)+30);
//	r.setWidth(i*5+20);
//	r.setHeight(i*3 + 50);
//	r.setFill(new Color(rand.nextDouble(),rand.nextDouble(),rand.nextDouble(), 1));
	
	
//	Rectangle r = new Rectangle();
//	r.setY(rand.nextDouble()*(i*30));
//	r.setX(rand.nextDouble()*(i*30)+30);
//	r.setWidth(i*5+20);
//	r.setHeight(i*3 + 50);
//	r.setFill(new Color(rand.nextDouble(),rand.nextDouble(),rand.nextDouble(), 1));
//	g.getChildren().add(r);
}
