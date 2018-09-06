package com.test.basic;

import java.util.Arrays;
/*
 * 冒泡排序
 */
public class BubbleSort1{
	public static void main(String[] args) {
		int[] arr= {33,23,53,10,22};
		
		// i是循环的趟数
		for (int i = 1; i < arr.length; i++) {
			// j是每一趟中循环的次数
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}


