package com.aim.training.java.constructor;

class Employee {

	String empID;
	String officialEmailID;
	String empBankAccount;
	
	public Employee(String empID, String officialEmailID,String empBankAccount) 
	{
		this.empID = empID;
		this.officialEmailID = officialEmailID;
		this.empBankAccount = empBankAccount;			

	}
	
	public Employee() {
//		super();
		System.out.println("---Default Constructor called ---");
	}
	
	public String toString()
	{
		String str = "---------------------------------------"
				+ "\nEmployee Details are : "
				+ "\nEmployee ID 		: " + this.empID
				+ "\nEmployee Email 		: " + this.officialEmailID
				+ "\nBank 			: " + this.empBankAccount
				+"\n---------------------------------------";
		return str;
				
	}
}


public class EmployeeManager {
	
	public static void main(String[] args) {
		Employee e1 = new Employee("emp_123", "emp1@abc.com","ICICI");
		Employee e2 = new Employee("emp_456", "emp2@abc.com","HDFC");
		Employee e3 = new Employee("emp_789", "emp3@abc.com","SBI");
		Employee e4 = new Employee("emp_111", "emp4@abc.com","AXIS");
		
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		
		Employee e5 = new Employee();
		System.out.println(e5);
	}
}
