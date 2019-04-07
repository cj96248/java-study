package com.training.basic.seriza;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
	
	public static void main(String[] args) {
		testSerialize();
	}

	private static void testSerialize() {
		try {
			ObjectOutputStream stream = new ObjectOutputStream(
					new FileOutputStream(new File("person")));
			Person p = new Person();
			p.setAge(22).setName("test");
			stream.writeObject(p);
			System.out.println("Success");
			stream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
