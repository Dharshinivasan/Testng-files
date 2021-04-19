package com.TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	

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
	
	@Test(enabled = false)
	private void earphoneSearch() {
		
		System.out.println("EarPhones Search");

	}
	
	@Ignore
	@Test
	private void bookSearch() {
	
		System.out.println("Book Search");

	}
	
	@AfterMethod
	private void logout() {
		
		System.out.println("Logout");

	}
}
