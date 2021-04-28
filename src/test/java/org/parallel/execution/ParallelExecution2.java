package org.parallel.execution;

import org.testng.annotations.Test;

public class ParallelExecution2 {
	@Test
	private void tc100() {
		System.out.println("test 3 "+Thread.currentThread().getId());
	}
	@Test
	private void tc101() {
		System.out.println("test 3 "+Thread.currentThread().getId());
	}
	@Test
	private void tc102() {
		System.out.println("test 3 "+Thread.currentThread().getId());
	}
}
