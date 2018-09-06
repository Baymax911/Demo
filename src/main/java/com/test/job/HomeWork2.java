package com.test.job;

public class HomeWork2 {
	/*
	 * 給定一个数组62,53,41,84,77,55，输出平均值、最大值、最小值、中位数
	 */
	public static void main(String[] args) {
		int[] arr = { 62, 53, 41, 84, 77, 55 };
		int maxIndex = arr[0];
		int minIndex = arr[0];
		int sum=0;
		
		for (int i = 0; i < arr.length; i++) {						
			
			if (maxIndex < arr[i]) {
				maxIndex=arr[i];
			}
			if (minIndex>arr[i]) {
				minIndex=arr[i];
			}
			continue;
			
		}
		System.out.println("最大值是:"+maxIndex+"\t 最小值是："+minIndex);		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("数组的和是："+sum);

	}
	
}