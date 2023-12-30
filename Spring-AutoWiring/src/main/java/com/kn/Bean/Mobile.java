package com.kn.Bean;

public class Mobile 
{
	String brand;
	String ram;
	Double cost;
	public Mobile(String brand, String ram, Double cost) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.cost = cost;
	}
	public Mobile() {
		super();
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", ram=" + ram + ", cost=" + cost + "]";
	}
	
	
}
