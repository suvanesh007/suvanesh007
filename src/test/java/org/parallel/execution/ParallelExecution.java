package org.parallel.execution;

import org.testng.annotations.Test;

public class ParallelExecution {

	@Test
	private void tc1() {
		System.out.println("Test 1 "+ Thread.currentThread().getId());
	}
	@Test
	private void tc2() {
		System.out.println("Test 1 "+Thread.currentThread().getId());
	}
	@Test
	private void tc3() {
		System.out.println("Test 1 "+Thread.currentThread().getId());
	}
	@Test
	private void tc4() {
		System.out.println("Test 1 "+Thread.currentThread().getId());
	}
}
