package com.airbiquity.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.airbiquity.model.Car;

@Repository
public class CarDAO {

	private static List<Car> cars = new ArrayList<Car>();

	static {
		cars.add(new Car("A101", "Audi", "A6"));
		cars.add(new Car("A105", "Audi", "Q2"));
		cars.add(new Car("A107", "Audi", "Q8"));
		cars.add(new Car("B503", "BMW", "X7"));
		cars.add(new Car("B507", "BMW", "Z4"));
		cars.add(new Car("T905", "TOYOTA", "Crysta"));
	}

	public List<Car> getAllCars() {

		return cars;
	}

	public void addNewCar(Car car) {
		cars.add(car);
	}
}
