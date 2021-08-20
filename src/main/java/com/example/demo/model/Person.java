package com.example.demo.model;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private Integer id;
	private String name;
	private LocalDate birthDate;

	private Integer age;

	public Person(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", birthDate=" + birthDate + ", age=" + getAge() + "]";
	}

	public int getAge() {
		return Period.between(birthDate, LocalDate.now()).getYears();
	}

}
