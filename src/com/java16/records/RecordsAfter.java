package com.java16.records;

import java.util.List;

record EmployeeRecord(String fName, String lName, int id) {
}

public class RecordsAfter {
	public static void main(String[] args) {
		EmployeeRecord employee1 = new EmployeeRecord("Amit", "Kumar", 1);
		EmployeeRecord employee2 = new EmployeeRecord("Ram", "Patil", 2);
		EmployeeRecord employee3 = new EmployeeRecord("Sharan", "Sasane", 3);
		EmployeeRecord employee4 = new EmployeeRecord("Sanjay", "Rakshe", 4);

		List<EmployeeRecord> empList = List.of(employee1, employee2, employee3, employee4);
		empList.stream().forEach(s -> System.out.println(s));
	}

}
