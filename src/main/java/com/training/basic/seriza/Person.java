package com.training.basic.seriza;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7034465362536365946L;
//	private static final long serialVersionUID = 1L;
	private int age;
	private String name;
	
}
