package com.airbiquity.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Car Model")
public class Car {

	@ApiModelProperty(notes="Car id", name="id", required=true)
	private String id;
	@ApiModelProperty(notes="Car Name", name="name", required=true)
	private String name;
	@ApiModelProperty(notes="Car Model", name="model", required=true)
	private String model;

	public Car() {

	}

	public Car(String id, String name, String model) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", model=" + model + "]";
	}
}
