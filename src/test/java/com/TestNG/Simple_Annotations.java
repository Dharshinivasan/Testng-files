package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {
	
	@BeforeSuite
	private void setProperty() {

		System.out.println("Set Property");
	}
	
	@BeforeTest
	private void browserLaunch() {
	
		System.out.println("Browser Launch");

	}
	
	@BeforeClass
	private void url() {
		
		System.out.println("URL");

	}
	
	@BeforeMethod
	private void login() {
		
		System.out.println("Login");

	}
	
	@Test
	private void laptopSearch() {
		
		System.out.println("Laptop Search");

	}
	
	@Test
	private void mobileSearch() {
		
		System.out.println("Mobile Search");
		
	}
	
	@Test
	private void earphoneSearch() {
		
		System.out.println("EarPhones Search");

	}
	
	@AfterMethod
	private void logout() {
		
		System.out.println("Logout");

	}

	@AfterClass
	private void verifyHomePage() {
		
		System.out.println("Home Page");
	}
	
	@AfterTest
	private void close() {
		
		System.out.println("Close");

	}
	
	@AfterSuite
	private void deleteAllCookies() {
	
		System.out.println("Delete All Cookies");

	}
}
