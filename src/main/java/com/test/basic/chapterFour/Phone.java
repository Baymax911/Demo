package com.test.basic.chapterFour;
/*
 * 手机实现USB接口
 */
public class Phone implements IUSB{

	public void start() {
		System.out.println("我是手机，开始工作了");
		
	}

	public void stop() {
		System.out.println("我是手机，停止工作了");
		
	}

}
