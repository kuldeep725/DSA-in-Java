package module3;
import processing.core.*;
public class ColorChangingSun extends PApplet {

	PImage myImage;
//	String URL = "http://cseweb.ucsd.edu/~minnes/palmTrees.jpg";
	String URL = "palmTrees.jpg";
	public void setup() {
		size (500, 500);
		myImage = loadImage(URL, "jpg");
		
	}
	
	public void draw() {
		image(myImage, 0, 0);
		myImage.resize(0, height);
//		save("/home/kunal/palmTrees.jpg");
		int[] color = getColorAtTime(second());
		fill(color[0], color[1], color[2]);
		ellipse(width/4, height/5, width/5, height/5);
		
	}

	private int[] getColorAtTime(double second) {
		
		int[] rgb = new int[3];
		double diffFrom = Math.abs(30-second);
		double ratio = diffFrom/30;
		rgb[0] = (int) (255*ratio);
		rgb[1] = (int) (255*ratio);
		rgb[2] = 0; 
		return rgb;
	}
	
}
