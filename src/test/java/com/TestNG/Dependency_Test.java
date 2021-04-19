package com.TestNG;

import org.testng.annotations.Test;

public class Dependency_Test {
	
	@Test
	private void mobile() {

		System.out.println("Mobile");
		
	}
	
	@Test
	private void laptop() {

		System.out.println("Laptop");
		
	}
	
	@Test(dependsOnMethods = "mobile")
	private void offer() {

		System.out.println("Offer");
		
	}

}
