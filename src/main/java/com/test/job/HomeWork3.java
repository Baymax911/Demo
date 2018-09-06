package com.test.job;

import java.util.Scanner;

public class HomeWork3 {

	/*
	 * 把字符串倒序输出
	 * abcdefg
	 * gfedcba
	 */
	/*public static String arr(String s) {
		//数组循环
		int length=s.length();
		char[] arr=s.toCharArray();
		for(int i=0;i<length/2;i++) {
			arr[i]=s.charAt(length-1-i);
			arr[length-1-i]=s.charAt(i);
		}
		return new String(arr);*/
		
		//2.StringBuffer的reverse方法
	/*	public static StringBuffer arr(String s) {
			
			StringBuffer sb=new StringBuffer();
			sb.append(s);
			return sb.reverse();
			
			
		}
		
		*/
		/*String str="";
		for(int i=str.length()-1;i>-1;i--) {
			str+=String.valueOf(str.charAt(i));
		}
		return str;*/
	
	public static void main(String[] args) {		
		/*String str2="abcdefg";
		StringBuffer sortedStr=arr(str2);
		System.out.println(sortedStr);		
*/	
		
		StringBuffer sb=new StringBuffer("abcdefg");		
		sb.reverse();
		System.out.println(sb);
		}


	
}
