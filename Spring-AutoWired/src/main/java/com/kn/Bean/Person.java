package com.kn.Bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Person
{
	int id;
	int age;
	Mobile mobile;
	@Autowired
	public Person(int id, int age, Mobile mobile) {
		super();
		this.id = id;
		this.age = age;
		this.mobile = mobile;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", mobile=" + mobile + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
}
