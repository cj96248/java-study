package com.training.algorithm.util;

import java.util.Arrays;
import java.util.Random;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Helper {

	public static int[] generateArray(int n, int max) {
		int[] num = new Random().ints(n, 0, max).toArray();
		print(num);
		return num;
	}

	public static void print(int[] num) {
		log.info(Arrays.toString(num));
	}

}
