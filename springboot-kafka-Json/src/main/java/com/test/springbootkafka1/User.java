package com.test.springbootkafka1;

public class User {

	String name;
	Integer salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String toString() {
		return "User [name=" + name + ", salary=" + salary + "]";
	}
}
