package com.test.basic;

import java.util.Scanner;

/*
 * 根据年龄阶段数值判断给出所在阶段定义
 */
public class SwitchDemo {

	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		System.out.println("你输入的年龄段是："+age);
		System.out.println("你是:");
		switch (age) {
		case 1:
			System.out.println("儿童");
			break;
		case 2:
			System.out.println("小学生");
			break;
		case 3:
			System.out.println("中学生");
			break;
		case 4:
			System.out.println("大学生");
			break;
		default:
			System.out.println("职场人");
		}
	}

}
