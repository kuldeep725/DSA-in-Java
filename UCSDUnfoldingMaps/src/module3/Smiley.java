package module3;

import processing.core.PApplet;

public class Smiley extends PApplet{

	@Override
	public void setup() {
		super.setup();
		size(500, 500);
		background(200, 200, 200);
		
	}
	@Override
	public void draw() {
		//copying the draw the method already written in the super class
		super.draw();
		//extending the functions from now
		fill(255, 255 , 0);		//fixing color to be bright yellow
//		ellipse(200, 200, 390, 390);
		//USE OF ELLIPSE : ellipse(center-X, center-Y, width of ellipse, height of ellipse)
		ellipse(width/2, height/2, width - width/50, height-height/50);		//making ellipse 
		fill(0);			//fixing color to be black now
		ellipse(width/4, height/4, 80, 80);
		ellipse(3*width/4, height/4, 80, 80);
		//USE OF ARC : arc(center-X, center-Y, width of arc (ellipse), height of arc(ellipse),
//						first angle from x-axis (clockwise), second angle from x-axis (clockwise));
		arc(width/2, 3*height/4, 120, 80, 0, PI);	
		fill(255,0,0);
		ellipse(width/2, height/2+height/40, 50, 50);
		
	}
	
	

}
