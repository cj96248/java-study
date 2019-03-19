package com.training.lambda;

import java.util.Comparator;
import java.util.function.Consumer;

public class Grammar {
	public void testGrammar1_1(){
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello");
			}
		};
	}
	
	public void testGrammar1_2(){
		Runnable r = () -> System.out.println("World");
	}
	
	public void testGrammar2() {
		Consumer con = (x) -> System.out.println(x);
		con.accept("һ���������޷���ֵ");
	}
	
	public void testGrammar3() {
		Consumer con = x -> System.out.println(x);
		con.accept("һ���������޷���ֵ��С���ſ���ʡ��");
	}
	
	public void testGrammar4(){
		Comparator<Integer> com = (x, y) -> {
			System.out.println("�����������������");
			System.out.println("�ô����Ű�����");
			return Integer.compare(x, y);
		};
	}
	
	public void testGrammar5(){
		Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
	}
	
	public void testGrammar6(){
		Comparator<Integer> com = (Integer x, Integer y) -> Integer.compare(x, y);
	}
}
