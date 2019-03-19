package com.training.design.mode.singleton;

import static org.hamcrest.CoreMatchers.nullValue;

public class Example2 {

	private static final Example2  instance = null;
	
	private Example2() {
	}
	
	public static Example2 getInstance() {
		return InnorDemo.e;
	}
	
	static class InnorDemo{
		private static final Example2 e = new Example2();
		
	}
}
