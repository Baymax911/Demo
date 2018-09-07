package com.test.job.shape;

/*
 * 子类已经继承了父类的getArea方法
 * 圆
 */
public class Circle extends Shape{
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		
		return Math.PI*this.radius*this.radius;
	}

}
