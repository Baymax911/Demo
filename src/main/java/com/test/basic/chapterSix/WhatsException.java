package com.test.basic.chapterSix;

/*
 * 展示什么是异常
 * 介绍两个常用异常
 * 空指针异常
 * 数组下标越界异常
 */
public class WhatsException {
	
	public static void main(String[] args) {
		//nullPointerException;
		//arrayIndexOutOfBoundsException();
		
	}
	
	private static void arrayIndexOutOfBoundsException() {
		int[] a=new int[] {11,22,33};
		System.out.println(a[2]);
	}
	private static void nullPointerException() {
		String a=null;
		a.length();
	}
	
}
