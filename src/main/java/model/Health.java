package model;

import java.io.Serializable;

public class Health implements Serializable {
	private double height, weight, bmi;
	private String bodyTybe;

	public Health() {
		super();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getBodyTybe() {
		return bodyTybe;
	}

	public void setBodyTybe(String bodyTybe) {
		this.bodyTybe = bodyTybe;
	}

}
