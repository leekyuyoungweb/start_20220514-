package lambda;

import java.util.ArrayList;
import java.util.List;

import inter.CarConsummer;
import inter.CarPredicate;
import intertest.Car;


public class CarDemo {
	
	public static List<Car> findCars(List<Car> all, CarPredicate c){
		List<Car> result = new ArrayList<Car>();
		for (Car car : all) {
			if(c.test(car)) {
				result.add(car);
			}
		}
		return result;		
	}

	public static void printCars(List<Car> all, CarConsummer c) {
		for (Car car : all) {
			c.apply(car);
		}
	}
	
	public static void main(String[] args) {
		List<Car> cars = Car.cars;
		List<Car> results = findCars(cars, car-> !car.isGasoline() );
		System.out.println("디젤자동차 = " + results);
		
		List<Car> tenYearsOvers = findCars(cars, car-> car.getAge() > 10 );
		System.out.println("10년이상된 자동차 = " + tenYearsOvers);
		
		List<Car> tenYearDigel = findCars(cars, car-> car.getAge() > 10 && !car.isGasoline() );
		System.out.println("10년이상된 디젤 자동차 = " + tenYearDigel);
		
		printCars(results
				, car-> System.out.printf("연식:%d 모델:%s\n", car.getAge(),car.getModel() )  );		
				
		printCars(tenYearsOvers, car-> System.out.printf("연식:%d 모델:%s 주행거리:%d\n"
				, car.getAge(),car.getModel(),car.getMileage())  );

	}

}
