package com.test.job;

import java.util.Scanner;

/*
 * 编写一个程序，接收用户输入的三个数，
 * 判断是否可以组成三角形（两条边相加大于第三条）
 */
public class HomeWork {
public static void main(String[] args) {
	int a,b,c;	
	System.out.println("请输入三个整数：");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a<=0 || b<=0 || c<=0) {
		System.out.println("请输入正整数");
	}
	if((a+b)>c && (a+c)>b && (b+c)>a) {
		System.out.println("能够构成三角形");
	}else {
		System.out.println("不能构成三角形");
	}
	
}


}
