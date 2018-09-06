package com.test.basic;

import java.util.Arrays;

public class GetSecondMaxNum {
	/*
	 * 给定一个数组，找出最大数
	 */
	public static void main(String[] args) {
		int[] arr = { 4, 3, 8, 10, 6 };
		int maxIndex = arr[0]; // 定义最大值为该数组的第一个数
		int minIndex = arr[0]; // 定义最小值为该数组的第一个数
		//遍历循环数组
		for (int i = 0; i < arr.length; i++) {
			if(maxIndex<arr[i]) {
				maxIndex=arr[i];
			}
			if(minIndex>arr[i]) {
				minIndex=arr[i];
			} 
		}
		   
		System.out.println(Arrays.toString(arr));	
		System.out.println();
		System.out.println("这个数组的最大值是:"+maxIndex+"\t 最小值是："+minIndex);
	}

}
