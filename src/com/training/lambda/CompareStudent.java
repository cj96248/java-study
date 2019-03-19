package com.training.lambda;

public class CompareStudent implements Comparable<CompareStudent> {

	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(CompareStudent o) {
		int res = 0;
		if(this.age > o.getAge()) {
			res = 1;
		}else if(this.age < o.getAge()) {
			res = -1;
		}
		return res;
	}

}
