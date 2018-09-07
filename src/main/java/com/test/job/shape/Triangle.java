package com.test.job.shape;
/*
 * 三角形
 */
public class Triangle extends Shape{
	private int bottom;
	private int heigth;
	
	public Triangle(int bottom, int heigth) {
		this.bottom = bottom;
		this.heigth = heigth;
	}

	@Override
	public double getArea() {
		
		return (bottom*heigth)/2;
	}

}
