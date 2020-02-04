package com.yedam.pgr.interfaces.model;

public class Employee {
	
	String name;
	int empNO;
	int salary;
	
	
	public Employee(String name, int empNO, int salary) {
		super();
		this.name = name;
		this.empNO = empNO;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNO() {
		return empNO;
	}
	public void setEmpNO(int empNO) {
		this.empNO = empNO;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [name=" + name + ", empNO=" + empNO + ", salary=" + salary + "]";
	}
	
	

}
