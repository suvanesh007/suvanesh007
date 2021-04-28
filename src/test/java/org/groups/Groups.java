package org.groups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups {
	@Test(groups="smoke")
	private void testClass1() {
		System.out.println("method 1");
		Assert.assertTrue(false);
	}
	@Test(groups="sanity")
	private void testClass2() {
		System.out.println("method 2");
	}
	@Test(groups="smoke")
	private void testClass4() {
		System.out.println("method 4");
	}
	@Test(groups="reg", dependsOnGroups="smoke", alwaysRun=true)
	private void testClass3() {
		System.out.println("method 3");
	}
}
