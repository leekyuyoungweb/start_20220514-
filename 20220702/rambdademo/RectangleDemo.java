package rambdademo;

import java.util.Arrays;

import rambda.Rectangle;

public class RectangleDemo {

	public static void main(String[] args) {
		int[] ary = {5,8,1,2};		
		Arrays.sort(ary);
		System.out.println(Arrays.toString(ary));
		
		Rectangle[] rectangles = {
				new Rectangle(3, 5)
				,new Rectangle(10, 5)
				,new Rectangle(20, 5)
		}; 
		Arrays.sort(rectangles);
		for (Rectangle rectangle : rectangles) {
			System.out.println(rectangle);
		}

	}

}
