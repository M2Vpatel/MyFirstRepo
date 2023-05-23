package com.miit.qa.novqa.basic;

public class Employee {//class

	public String name;//instance
	
	public int age;
	
	public int salary;
	
	public static String COMPANY_NAME = "MIIT";//static
	
	public Employee() {//default constructor
		System.out.println("inside default Constructor::");
	}
	
	public Employee(String name, int age, int salary) {//parameterized constructor
		System.out.println("inside default Constructor::");
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public int calculateTax(int taxRate) {//instance method
		int tax = this.salary * taxRate /100;//local variable
		return tax;
	}
	
	public static int calculateTaxS(int salary, int taxRate) {
		int tax = salary * taxRate /100;//local variable
		return tax;
	}
	
}
