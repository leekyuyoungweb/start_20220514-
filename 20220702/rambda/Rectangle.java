package rambda;

public class Rectangle implements Comparable<Rectangle>{

	private int width,height;

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return this.width * this.height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	@Override
	public int compareTo(Rectangle o) {
		return this.getArea() - o.getArea();
	}

	

	
	
	
}
