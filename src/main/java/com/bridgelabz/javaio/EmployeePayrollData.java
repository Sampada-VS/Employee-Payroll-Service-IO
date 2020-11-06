package com.bridgelabz.javaio;

public class EmployeePayrollData {
	public int id;
	public String name;
	public double salary;

	public EmployeePayrollData(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "Id : " + id + ", Name : " + name + ", Salary : " + salary;
	}
}
