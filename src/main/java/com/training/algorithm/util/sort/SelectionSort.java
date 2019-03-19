package com.training.algorithm.util.sort;

import com.training.algorithm.util.Helper;
/**
 * 选择排序，复杂度 O(n平方)
 * @author Jiang, Chao
 *
 */
public class SelectionSort {
 
	public static int[] sort(int[] num) {
		// 遍历数据
		for(int i =0; i< num.length; i++) {
			// 寻找[i, length)最小值
			int minIndex = i;
			for(int j = i+1; j < num.length;j++) {
				 if(num[j] < num[minIndex]) {
					 minIndex = j;
				 }
			}
			// 将最小值放到未排序的第一个位置
			if(minIndex > i) {
				int tmp = num[i];
				num[i] = num[minIndex];
				num[minIndex] = tmp;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		int[] num = Helper.generateArray(10, 20);
		int[] after = sort(num);
		Helper.print(after);
	}
}
