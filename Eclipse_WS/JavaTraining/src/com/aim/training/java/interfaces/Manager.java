package com.aim.training.java.interfaces;

public class Manager {

	
	public static void main(String[] args) {
		Employee manager = new Employee();
		
		manager.setName("AHB");
		manager.setAge(40);
		manager.setLanguage("Kannada");
		manager.setEmpID("go1231903");
		manager.setOfficialEmail("ahb@google.com");
		manager.setPlace("KArnataka");
		
		Employee srManager = new Employee("KIRAN", 40, "Bangalore", "go121212"	, "kiran@google.com", "Kannada");
	
		manager.printEmployeeInfo();
		srManager.printEmployeeInfo();
		
	
	}
	
	
}
