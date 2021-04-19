package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {
	
	@Test
	private void credentials() {
		
		String actual="Dharshini";
		
		String expected="Keerthi";
		
		Assert.assertEquals(actual, expected);

	}
	
	@Test
	private void credentials1() {
		
		String actualName="Dharshini15";
		
		String expectedName="Keerthi08";
		
		Assert.assertEquals(actualName, expectedName);

	}
	
	
	

}
