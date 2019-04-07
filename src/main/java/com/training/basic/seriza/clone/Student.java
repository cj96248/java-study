package com.training.basic.seriza.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	
	private Teacher teacher;
	
	// 代码实现深克隆
	public Object deepClone() throws Exception {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(this);
		
		ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(is);
		return ois.readObject();
	}
}
