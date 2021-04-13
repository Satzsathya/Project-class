package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependgroup {
	
	@Test(groups= {"smoke"})
	private void tc0() {
		System.out.println("Method1");
	}
	
	@Test(groups= {"smoke","sanity"})
	private void tc1() {
		Assert.assertTrue(false);
		System.out.println("Method2");
	}
	
	@Test(groups= {"reg"},dependsOnGroups= {"smoke"}
	)
	private void tc2() {
		System.out.println("Method3");
	}
	
	@Test(groups= {"retest"})
	private void tc3() {
		System.out.println("Method4");
	}
	
	@Test(groups= {"E2E"})
	private void tc4() {
		System.out.println("Method5");
}
}
