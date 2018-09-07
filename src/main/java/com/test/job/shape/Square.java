package com.test.job.shape;
/*
 * 矩形
 */
public class Square extends Shape{
	
	private int width;
	private int heigth;
	

	public Square(int width, int heigth) {		
		this.width = width;
		this.heigth = heigth;
	}

	@Override
	public double getArea() {
		
		return width*heigth;
	}

}
