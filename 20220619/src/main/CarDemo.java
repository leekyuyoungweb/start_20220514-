package main;
import product.Car;

public class CarDemo {

	public static void main(String[] args) {
		Car c = new Car("자동차1", 100, 20, 20, 100);
		c.move(1, 1);
		System.out.printf("현재위치 x:%.2f  y:%.2f"
				,c.getX(),c.getY());
		
		c.move(3, 0);
		System.out.printf("현재위치 x:%.2f  y:%.2f"
				,c.getX(),c.getY());
		
	}

}
