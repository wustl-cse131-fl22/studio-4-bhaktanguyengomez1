package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
	
	StdDraw.setPenColor(Color.CYAN);
	StdDraw.filledRectangle(0.5,0.5,0.5,0.5);		

	StdDraw.setPenColor(120,42,42);
	StdDraw.filledCircle(0.5,0,0.63);
	
	
	StdDraw.setPenColor(120,42,42);
	StdDraw.filledRectangle(0.1,0.6,0.045,0.15);
	
	StdDraw.setPenColor(Color.GREEN);
	StdDraw.filledCircle(0,0,0.5);		
	StdDraw.filledCircle(1,0,0.25);	
	
	StdDraw.setPenColor(Color.ORANGE);
	StdDraw.filledCircle(0.1,0.75,0.15);		
	
	StdDraw.setPenColor(Color.RED);
	StdDraw.filledRectangle(0.05,0.05,0.05,0.05);
		
		
		
		
	}
}