package com.training.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.lambda.CompareStudent;

public class CompStudent {

	public static void main(String[] args) {
		CompareStudent s = new CompareStudent();
		s.setAge(15);
		
		CompareStudent s2 = new CompareStudent();
		s2.setAge(12);
		List<CompareStudent> asList = Arrays.asList(s, s2);
		System.out.println(asList);
//		Collections.sort(asList);
		System.out.println(asList);
		
		Collections.sort(asList, (o1, o2) -> {
			if(o1.getAge() > o2.getAge()) {return 1;};
			if(o1.getAge() < o2.getAge()) {return -1;};
			return 0;
		});
		System.out.println(asList);
		
	}

}
