package com.test.job.shape;

/*
 * 求多边形面积
 */
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请选择图形：\t1圆形\t2矩形\t3三角形");
		int choose = sc.nextInt();
		Shape shape=null;
		switch (choose) {
		case 1:
			System.out.println("请输入半径：");
			shape=new Circle(sc.nextInt());
			System.out.println("圆的面积是："+shape.getArea());
			break;
		case 2:
			System.out.println("请输入长和宽：");
			shape=new Square(sc.nextInt(),sc.nextInt());
			System.out.println("矩形的面积是："+shape.getArea());
			break;
		case 3:
			System.out.println("请输入底和高：");
			shape=new Triangle(sc.nextInt(),sc.nextInt());
			System.out.println("三角形的面积是："+shape.getArea());
			break;
		default:
			System.out.println("图形选择错误！！！");
		}
	}

}
