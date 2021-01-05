package com.airbiquity;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.airbiquity.dao.CarDAO;
import com.airbiquity.model.Car;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@ApiOperation(value="/cars", tags="Cars Controller")
@RestController
@RequestMapping(path = "/cars")
public class CarsController {

	@Autowired
	private CarDAO carDao;

	@ApiOperation(value="Fetch All the cars", response=List.class)
	@GetMapping(path = "/allCars", produces = "application/json")
	public List<Car> getCars() {
		return carDao.getAllCars();
	}

	@ApiOperation(value="Add a new car", response=Object.class)
	@PostMapping(path = "/newCar", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Object> addCar(
			@ApiParam(name = "Car", value = "New Car Details to add") @RequestBody Car car) {
		carDao.addNewCar(car);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(car.getId())
				.toUri();

		return ResponseEntity.created(location).build();
	}

}
