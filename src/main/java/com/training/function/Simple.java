package com.training.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

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
	
	public void testConsumer(){
		study(6, (m -> System.out.println("�򹤾��黨��" + m + "Ԫ")));
		study(2, (m -> System.out.println("��Ǧ�ʻ���" + m + "Ԫ")));
	}
	
	public void study(double money, Consumer<Double> con){
		con.accept(money);
	}
	
	public void testSupplier(){
		List<Student> stuList = getStuList(3, () -> students.get((int)(Math.random()*4) + 1));
		System.out.println(stuList);
	}
	
	public List<Student> getStuList(int num, Supplier<Student> sup){
		List<Student> list = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			Student s = sup.get();
			list.add(s);
		}
		return list;
	}
	
	public void getNum(){
		System.out.println((int)(Math.random()*5) + 1);
	}
}
