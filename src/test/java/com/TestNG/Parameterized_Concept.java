package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {

	@Test
	@Parameters({ "username", "password" })
	private void credentials(String username, int password) {

		System.out.println("Username :" + username);

		System.out.println("Password :" + password);

	}

	@Test
	@Parameters({ "username1", "password1" })
	private void credentials_Op(@Optional("keerthi") String username1, @Optional("807") int password1) {

		System.out.println("Username :" + username1);

		System.out.println("Password :" + password1);

	}

	@Test(dataProvider = "test_Data")
	private void credentials_Data(String username, int age) {

		System.out.println("Username :" + username);

		System.out.println("Password :" + age);

	}

	@DataProvider
	private Object test_Data() {
		return new Object[][] { { "Dharshini", 24 }, { "Keerthi", 27 }, { "Sabi", 51 } };
	}
}
