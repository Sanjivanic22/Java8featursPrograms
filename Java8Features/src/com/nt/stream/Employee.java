package com.nt.stream;

import java.util.ArrayList;
import java.util.List;

public class Employee {
int id;
String name;
float sal;

	public Employee(int id, String name, float sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}

	public static void main(String[] args) {
	List<Employee> employeelist=new ArrayList<Employee>();
	employeelist.add(new Employee(101,"Sanju chattekar",45000));
	employeelist.add(new Employee(102,"Akash Raje",345566));
	employeelist.add(new Employee(103,"Sanjivani",76000));
//	employeelist.stream()
//	.filter(employee->employee.sal>50000)
//	.forEach(employee->System.out.println(employee.name));
	Float totalSal=employeelist.stream()//for int we have take code like Optional<Integer>then same
			.map(employee->employee.sal)
			.reduce(0.0f, (sum,sal)->sum+sal);
	System.out.println(totalSal);
	//more precise code
	float totalSal2=employeelist.stream()
			.map(employee->employee.sal)
			.reduce(0.0f,Float::sum);//use to summ of all employeesal
	System.out.println(totalSal);
	

	}

}
