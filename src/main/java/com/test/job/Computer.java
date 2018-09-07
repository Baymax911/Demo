package com.test.job;

public class Computer {
	
	/*
	 * 设计一个计算机类，要求如下： - 属性：品 牌、颜色、cpu、内存容量、价格、
	 * 工作状态 - 方法：打开、关闭、休眠 - 创建一个计算机对象，调用打开、关闭方法。
	 *  -- 打开时显示品牌、颜色、cpu、内存容量、价格、工作状态为正常；
	 *   -- 关闭时，显示工作状态为停止； -- 休眠时，显示工作状态为睡眠。
	 */
	
	private String  brand; //品 牌
	private String color; //颜色
	private String cpu;  //cpu
	private Integer memory;	//内存容量
	private Double price; //价格
	private Integer state; //工作状态0关闭，1休眠，2工作
	
	
	

	public Computer(String brand, String color, String cpu, Integer memory, Double price, Integer state) {
		this.brand = brand;
		this.color = color;
		this.cpu = cpu;
		this.memory = memory;
		this.price = price;
		this.state = state;
	}

	public void open(){
	this.state=2;
	//System.out.println("计算机正在打开...\n品牌:" + this.brand + "\t颜色:" + this.color + "\tcpu:" + this.cpu 
						//+ "\t内存容量:" + this.memory + "G\t价格:" + this.price);
	System.out.println("计算机正在打开...\n品牌:" + this.brand + "\t颜色:" + this.color + "\tcpu:" + this.cpu 
						+ "\t内存容量:" + this.memory + "G\t价格:" + this.price + "\t工作状态:" + (this.state == 0 ? "关闭" : (this.state == 1 ? "休眠" : "工作")));
}
	
	public void close() {
		this.state=0;
		//System.out.println("计算机工作状态:关闭");
	System.out.println("计算机工作状态:" + (this.state == 0 ? "关闭" : (this.state == 1 ? "休眠" : "工作")));
	}
	

	public void dormancy() {
		this.state=1;
		//System.out.println("计算机工作状态:休眠");
		System.out.println("计算机工作状态:" + (this.state == 0 ? "关闭" : (this.state == 1 ? "休眠" : "工作")));
	}
		
	public static void main(String[] args) {
		Computer com = new Computer("惠普", "黑色", "intel", 8, 6999.0,1);
		com.open();
		com.close();
		com.dormancy();
	}
}
