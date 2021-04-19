package com.TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Concept {

	@Test
	private void credential_HardEqual() {

		String actual = "Dharshini";

		String expected = "keerthi";

		Assert.assertEquals(actual, expected);// failed

		System.out.println("Process Completed");

	}

	@Test
	private void credential_Soft() {

		String actual = "Dharshini";

		String expected = "keerthi";

		SoftAssert soft = new SoftAssert();

		soft.assertEquals(actual, expected);// failed

		System.out.println("Process Completed");

	}

	@Test
	private void credential_HardNotEqual() {

		String actual = "Dharshini";

		String expected = "keerthi";

		Assert.assertNotEquals(actual, expected);// passed

		System.out.println("Process Completed");

	}

	@Test
	private void credential_HardSame() {

		String actual = "keerthi";

		String expected = "keerthi";

		Assert.assertSame(actual, expected);

		System.out.println("Process Completed");

	}

	@Test
	private void credential_HardNull() {

		String actual = null;

		Assert.assertNull(actual);// passed

		System.out.println("Process Completed");

	}

	@Test
	private void credential_HardNotNull() {

		String actual = null;

		Assert.assertNotNull(actual);// failed

		System.out.println("Process Completed");

	}

}
