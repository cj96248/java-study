package com.training.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.training.model.Student;

public class StudentService {
	
	public static List<Student> students = Arrays.asList(
			new Student(1, "Aim", 12, 78),
			new Student(2, "Bob", 15, 45),
			new Student(3, "Cicy", 13, 89),
			new Student(4, "Deny", 11, 91),
			new Student(5, "Emiy", 14, 32)
	);
	/**
	 * 年龄大于12的学生集合
	 * @param list
	 * @return
	 */
	public List<Student> filterStudnentByAge(List<Student> list){
		List<Student> l = new ArrayList<>();
		
		for(Student student : list){
			if (student.getAge() > 12) {
				l.add(student);
			}
		}
		return l;
	}
	
	/**
	 * 成绩大于60的学生集合
	 * @param list
	 * @return
	 */
	public List<Student> filterStudnentByScore(List<Student> list){
		List<Student> l = new ArrayList<>();
		
		for(Student student : list){
			if (student.getScore() > 60) {
				l.add(student);
			}
		}
		return l;
	}
}
