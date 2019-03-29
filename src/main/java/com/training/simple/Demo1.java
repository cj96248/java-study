package com.training.simple;

public class Demo1 {
	
	public static void main(String[] args) {
		System.out.println(test1(3));
		System.out.println(test1(4));
		System.out.println(test1(-1));
		System.out.println("---------");
		System.out.println(test2(3));
		System.out.println(test2(4));
		System.out.println(test2(-1));
		System.out.println("---------");
		System.out.println(test3(3));
		System.out.println(test3(4));
		System.out.println(test3(-1));
	}
	
	public static boolean test3(int i) {
		return (i & 1) == 0;
	}
	
	public static boolean test2(int i) {
		return (i % 2)== 0;
	}

	public static boolean test1(int i) {
		if((i % 2) == 0) {
			return true;
		}
		return false;
	}
}
