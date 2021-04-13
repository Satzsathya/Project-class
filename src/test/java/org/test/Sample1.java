package org.test;

import org.testng.annotations.DataProvider;

public class Sample1 {
	
	@DataProvider(name="testdata")
	private static Object[][] logindata() {
		return new Object[][] {{"sathya","sathya@123"},{"satzsatiya","superman"},{"balakrish","bala@5678"}};
	}
}
