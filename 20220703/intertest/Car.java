package intertest;

import java.util.Arrays;
import java.util.List;

public class Car {
	private String model;
	private boolean gasoline;
	private int age;
	private int mileage;
	

	
	public Car(String model, boolean gasoline, int age, int mileage) {
		super();
		this.model = model;
		this.gasoline = gasoline;
		this.age = age;
		this.mileage = mileage;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public boolean isGasoline() {
		return gasoline;
	}

	public void setGasoline(boolean gasoline) {
		this.gasoline = gasoline;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public static List<Car> getCars() {
		return cars;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", gasoline=" + gasoline + ", age=" + age + ", mileage=" + mileage + "]";
	}

	public static final List<Car> cars = Arrays.asList(
			new Car("소나타", true, 12, 240000)
			,new Car("코란도", false, 15, 300000)
			,new Car("그랜저", true, 8, 160000)
			,new Car("싼타페", false, 5, 100000)
			,new Car("아반떼", true, 1, 20000)
			);
}
