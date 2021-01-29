package com.aim.training.java.interfaces;

public class Employee extends Person implements HumanBeing, LivingOnEarth
{
	private String empID;
	private String officialEmail;
	private String language = "English , Kannada ,Hindi";
	
	public void setLanguage(String language)
	{
		this.language = language;
	}
	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getOfficialEmail() {
		return officialEmail;
	}

	public void setOfficialEmail(String officialEmail) {
		this.officialEmail = officialEmail;
	}

	public String getLanguage()
	{
		return this.language;
	}
	
	@Override
	public String languagesKnown(String[] languages) 
	{
		// TODO Auto-generated method stub
		return this.language;
		
	}

	@Override
	public String nativeFrom() {
		// TODO Auto-generated method stub
		return getPlace();
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, String place, String empID, String officialEmail,String language)
	{
		setName(name);
		setAge(age);
		setPlace(place);
		setEmpID(empID);
		setEmpID(officialEmail);
		setLanguage(language);
	}
	
	public void printEmployeeInfo()
	{
		System.out.println("----------------Employee Details ------------");
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getLanguage());
		System.out.println(getEmpID());
		System.out.println(getOfficialEmail());
		System.out.println(languagesKnown(language.split(",")));
		System.out.println(nativeFrom());
		isOnEarth();
		
	}
	@Override
	public void isOnEarth() {
		System.out.println("Yes..! On Earth");
		
	}
	
}
