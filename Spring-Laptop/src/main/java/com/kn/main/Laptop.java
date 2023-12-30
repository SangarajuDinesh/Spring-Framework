package com.kn.main;

public class Laptop
{
	int manufacturerId;
	String name;
	double cost;
	public Laptop(int manufacturerId, String name, double cost) {
		super();
		this.manufacturerId = manufacturerId;
		this.name = name;
		this.cost = cost;
	}
	public Laptop() {
		super();
	}
	@Override
	public String toString() {
		return "Laptop [manufacturerId=" + manufacturerId + ", name=" + name + ", cost=" + cost + "]";
	}
	public int getManufacturerId() {
		return manufacturerId;
	}
	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
}
