package com.zfw.service;

import org.junit.Test;

public class MyTest {
	@Test
	public void test() {
		ISomeService service = new SomeServiceImp();
		service.doSome();
		service.doSecond();

	}
}
