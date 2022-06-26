package project;

import inter.Plane2D;

public class Rectangle implements Plane2D{		
	private Point p1, p2;  // 커플링	
	
	@Override
	public long getArea() {		 
//		int width = ( p1.x - p2.x < 0)? -(p1.x - p2.x) : p1.x - p2.x;
//		int height =  (p1.y - p2.y < 0)? -(p1.y - p2.y) : p1.y - p2.y;
		
//		int width = p1.x - p2.x;
//		int height = p1.y - p2.y;
//		return (long) (Math.sqrt(width*height)*(width*height));
		
		int width = Math.abs(p1.x - p2.x);
		int height = Math.abs(p1.y - p2.y);
		return width*height;
	}
	
}
