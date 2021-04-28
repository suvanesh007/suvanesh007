package org.parallel.execution;

import org.testng.annotations.Test;

public class ParellelExecution1 {
	@Test
	private void tc10() {
		System.out.println("test 2 "+Thread.currentThread().getId());
	}
	@Test
	private void tc11() {
		System.out.println("test 2 "+Thread.currentThread().getId());
	}
	@Test
	private void tc12() {
		System.out.println("test 2 "+Thread.currentThread().getId());
	}
}
