package com.skillbay.testng;

import org.testng.annotations.DataProvider;

public class TestData {

	@DataProvider
	public Object[][] sampledata() {
		return new Object[][] { new Object[] { 1, "a" }, new Object[] { 2, "b" }, };
	}

	@DataProvider
	public Object[][] createcustomerdata() {
		return new Object[][] {
				new Object[] { "TestNG-SkillBay-Customer1", "TestNG-SkillBay-CustomerDesc" },
				new Object[] { "TestNG-SkillBay-Customer2", "TestNG-SkillBay-CustomerDesc" },
				new Object[] { "TestNG-SkillBay-Customer3", "TestNG-SkillBay-CustomerDesc" },
				new Object[] { "TestNG-SkillBay-Customer4", "TestNG-SkillBay-CustomerDesc" } };
	}

	@DataProvider
	public Object[][] createProjectdata() {
		return new Object[][] {
				new Object[] { "TestNG-SkillBay-Customer1", "Project1", "TestNG-SkillBay-CustomerDesc" },
				new Object[] { "TestNG-SkillBay-Customer1", "Project2", "TestNG-SkillBay-CustomerDesc" },
				new Object[] { "TestNG-SkillBay-Customer2", "Project1", "TestNG-SkillBay-CustomerDesc" },
				new Object[] { "TestNG-SkillBay-Customer2", "Project1", "TestNG-SkillBay-CustomerDesc" }, };
	}

}
