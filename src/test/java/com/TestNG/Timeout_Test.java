package com.TestNG;

import org.testng.annotations.Test;

public class Timeout_Test {
	
	@Test(timeOut = 2000)
	private void navigateToPage() throws Throwable {

		System.out.println("Click on Login Btn");
		
		Thread.sleep(1000);
		
		System.out.println("Navigate To Home Page");
		
	}

}
