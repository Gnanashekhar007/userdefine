package org.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeDetails {
public static void main(String[] args) {
	Set<Employee> en=new LinkedHashSet<>();
	
	Employee y=new Employee();
	y.setId(64);
	y.setName("rehas");
	y.setYofJoining("2020");
	y.setAddress("Uttah");
	en.add(y);
	
	Employee y1=new Employee();
	y1.setId(65);
	y1.setName("rehas");
	y1.setYofJoining("2020");
	y1.setAddress("UK");
	en.add(y1);
	
	Employee y2=new Employee();
	y2.setId(64);
	y2.setName("rehas");
	y2.setYofJoining("2020");
	y2.setAddress("USA");
	en.add(y2);
	
	for (Employee d : en) {
		System.out.println("emp id is"+d.getId());
		System.out.println("emp add is a"+d.getAddress());
	}
		
	}
	


}
