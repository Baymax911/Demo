package com.test.job.shape;

/*
 * 定义一个图形父类abstract Shape，包含求面积的方法getArea()，扩展子类：圆Circle、矩形Square、三角形Triangle，分别重写求面积方法。
*用户可以选择输入某一个多边形(圆、矩形、三角形)，输入数据后，求出这个多边形的面积
*注意：因为不同的多边形求面积所用的参数不一样，所以当用户选择一个多边形时，用户需要输入的参数个数也不一样
 */
public abstract class Shape {
	
	public abstract double getArea();	
	
}
