package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		 StdDraw.clear();
		   StdDraw.setPenColor(255, 0, 0);
		   StdDraw.setPenColor(0, 0, 127);
		   StdDraw.filledCircle(2,2,2);
		   
		  
		   StdDraw.setPenColor(124, 20, 30);
		   StdDraw.setXscale(0, 22);
		   StdDraw.setYscale(0, 22);
		   
		
		  Color color = new Color (255,215,0);
		  StdDraw.setPenColor(color);
		  double [] x = {7,9,10};
		  double []	y = {5,10,7};
		  StdDraw.filledPolygon(x, y);  
		  
		  Color color2 = new Color (159,226,191);
		  StdDraw.setPenColor(color2);
		  StdDraw.filledCircle(5,8,3); 
		  
		  StdDraw.setPenColor(Color.PINK);
		  StdDraw.filledSquare(3,17,2); 
		  
		  Color color3 = new Color (255,105,180);
		  StdDraw.setPenColor(color3);
		  StdDraw.filledRectangle(20,3,4,8);
		  
		  Color color4 = new Color (204,204,255);
		  StdDraw.setPenColor(color4);
		  StdDraw.filledEllipse(11,3,4,2);
		  
		  StdDraw.picture(7,13,"resources/IMG_0737.jpeg",12,10,180);
		
	}
}