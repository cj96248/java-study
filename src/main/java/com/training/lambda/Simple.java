package com.training.lambda;

import java.util.Comparator;

public class Simple {
	public void testComparator(){
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer x, Integer y) {
				return Integer.compare(x, y);
			}
		};
	}
	
	public void testComparatorLam(){
		Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
		
	}
	
}
