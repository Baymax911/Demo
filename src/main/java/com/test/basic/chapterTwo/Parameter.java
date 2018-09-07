package com.test.basic.chapterTwo;

/*
 * 算术运算符
 * 赋值操作和运算指令的顺序
 */

public class Parameter {
	public static void main(String[] args) {
		int a=1;
		System.out.println("a="+a);//1
		int b=a++;
		System.out.println("a="+a);//2
		System.out.println("b="+a);//2
		System.out.println("int b=a++");//b=a  a=a+1  
		
		System.out.println("*************************");
		int c=10;
		System.out.println("c="+c); //10
		
		int d=++c;
		System.out.println("c="+c); //11
		System.out.println("d="+d); //11
		System.out.println("int d=++c");//c=c+1  int d=c
		
		d--; //d=d-1
		System.out.println("d="+d);//d=10
		
		int e=100;
		int f=++e + --e;
		System.out.println("f="+f); //201
	}
	
	
}
