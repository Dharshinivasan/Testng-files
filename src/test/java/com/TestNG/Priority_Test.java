package com.TestNG;

import org.testng.annotations.Test;

public class Priority_Test {
	
	@Test(priority = -1)
	private void laptopSearch() {
		
		System.out.println("Laptop Search");

	}
	
	@Test(priority = 0)
	private void mobileSearch() {
		
		System.out.println("Mobile Search");
		
	}
	
	@Test
	private void earphoneSearch() {
		
		System.out.println("EarPhones Search");

	}
	
	@Test(priority = 1)
	private void bookSearch() {
	
		System.out.println("Book Search");

	}

}
