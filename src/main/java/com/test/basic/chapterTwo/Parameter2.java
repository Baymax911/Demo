package com.test.basic.chapterTwo;

public class Parameter2 {
	
	/*
	 * 关系运算符
	 */
	public static void main(String[] args) {
		/*int a=90;
		int b=90;
		if(a==b) {
			System.out.println("a equals b"); //a equals b
		}
		b--; //b=90-1
		if(a>b) {
			System.out.println("a>b"); //a>b
		}
		if(a<b) {
			System.out.println("a<b"); //不显示
		}
		*/
		
		
		/*
		 * 判断逻辑关系的运算符
		 */
		int a=100;
		int b=100;
		System.out.println(a>b && a>99); //false
		
		if(a>b && a>99) {
			System.out.println("a>99 and a>b"); //无输出
		}
		
		System.out.println(a>b || a>99); //true
		if(a>b || a>99) {
			System.out.println("a>99 but not a>b"); //a>99 but not a>b
		}
		
		System.out.println((a>b)); //fals
		System.out.println(!(a>b)); //a<=b true
		if(!(a>b)) {
		System.out.println("not a >b"); //not a >b
		}
	}

}
