package com.java16.records;

import java.util.List;

public class RecordsBefore {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Amit", "Kumar",1);
		Employee employee2 = new Employee("Ram", "Patil",2);
		Employee employee3 = new Employee("Sharan", "Sasane",3);
		Employee employee4 = new Employee("Sanjay", "Rakshe",4);
		
		List<Employee> empList = List.of(employee1,employee2,employee3, employee4);
		empList.stream().forEach(s->System.out.println(s));
		//System.out.println(empList);
		
		
	}

}

//Java Program Illustrating Program Without usage of
//Records

//A sample Employee class
class Employee {

	// Member variables of this class
	private String firstName;
	private String lastName;
	private int Id;

	// Constructor of this class
	public Employee(String firstName, String lastName,
					int Id)
	{

		// This keyword refers to current instance itself
		this.firstName = firstName;
		this.lastName = lastName;
		this.Id = Id;
	}

	// Setter and Getter methods

	// Setter-getter Method 1
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	// Setter-getter Method 2
	// to get the first name of employee
	public String getFirstName() { return firstName; }

	// Setter-getter Method 3
	// To set the last name of employees
	public void setLastName(String lasstName)
	{

		// This keyword refers to current object itself
		this.lastName = lastName;
	}

	// Setter-getter Method 3
	// To set the last name of employees
	public String getLastName() { return lastName; }

	// Setter-getter Method 4
	// To set the last name of employees
	public void setId(int Id) { this.Id = Id; }

	// Setter-getter Method 5
	// To set the last name of employees
	public int getId() { return Id; }

	// Setter-getter Method 6
	public String toString()
	{

		// Return the attributes
		return "Employee [firstName=" + firstName
			+ ", lastName=" + lastName + ", Id=" + Id + "]";
	}

	// Method 7
	// Overriding hashCode method
	@Override public int hashCode()
	{

		// Final variable
		final int prime = 31;
		int result = 1;

		result = prime * result + Id;
		result = prime * result
				+ ((firstName == null)
						? 0
						: firstName.hashCode());
		result
			= prime * result
			+ ((lastName == null) ? 0
									: lastName.hashCode());

		return result;
	}

	// Method 8
	// Overriding equals method to
	// implement with data structures
	@Override public boolean equals(Object obj)
	{

		// This refers to current instance itself
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Employee other = (Employee)obj;

		if (Id != other.Id)
			return false;

		if (firstName == null) {
			if (other.firstName != null)
				return false;
		}

		else if (!firstName.equals(other.firstName))
			return false;

		if (lastName == null) {
			if (other.lastName != null)
				return false;
		}

		else if (!lastName.equals(other.lastName))
			return false;

		return true;
	}
}

