package com.test.basic;

import java.util.Arrays;

public class ArrayDemo {

	/*
	 * 数组
	 */
	public static void main(String[] args) {
		int[] arr=new int[]{1,2,9,5,3};
		System.out.println(Arrays.toString(arr)); 
		//toString更改数组，toString()方法可以把数组转化为字符串，并返回结果
		int sum=0;
		for( int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("数组的和为："+sum);
		
		Arrays.sort(arr);
		System.out.println("用工具类Arrays进行排序后的结果是：");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		
	}	

}
