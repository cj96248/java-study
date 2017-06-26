package com.training.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

import com.training.model.Student;

public class Simple {
	
	public static List<Student> students = Arrays.asList(
			new Student(1, "Aim", 12, 78),
			new Student(2, "Bob", 15, 45),
			new Student(3, "Cicy", 13, 89),
			new Student(4, "Deny", 11, 91),
			new Student(5, "Emiy", 14, 32)
	);
	
	public void testFunction(){
	}
	
	
	public Student studentUpdate(Student s, Function<Student,Student> fun){
		return fun.apply(s);
	}
	
	@Test
	public void testConsumer(){
		study(6, (m -> System.out.println("买工具书花费" + m + "元")));
		study(2, (m -> System.out.println("买铅笔花费" + m + "元")));
	}
	
	public void study(double money, Consumer<Double> con){
		con.accept(money);
	}
	
	@Test
	public void testSupplier(){
		List<Student> stuList = getStuList(3, () -> students.get((int)(Math.random()*4) + 1));
		System.out.println(stuList);
	}
	/**
	 * 
	 * @param num 需要多少学生信息
	 * @param sup 怎么去筛选需要的学生信息
	 * @return list 学生集合
	 */
	public List<Student> getStuList(int num, Supplier<Student> sup){
		List<Student> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			Student s = sup.get();
			list.add(s);
		}
		return list;
	}
	
	@Test
	public void getNum(){
		System.out.println((int)(Math.random()*5) + 1);
	}
}
