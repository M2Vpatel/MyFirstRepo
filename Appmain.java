package com.miit.qa.novqa.basic;

public class Appmain {
	public static void main(String[] args) {
		System.out.println("hello world::");

		Employee e = new Employee();

		Employee e1 = new Employee("E2", 25, 10000);
		System.out.println("salary of employee E1:" + e1.salary);
		e1.salary = 10500;
		System.out.println("salary of employee E1:" + e1.salary);
		int tax = e1.calculateTax(13);
		System.out.println("tax for E1:" + tax);

		Employee e2 = new Employee("E2", 26, 5000);
		int tax2 = e2.calculateTax(13);

		System.out.println("tax for E2:" + tax2);

		int taxS2 = Employee.calculateTaxS(15000, 13);
		System.out.println("tax::" + taxS2);
	}
}
