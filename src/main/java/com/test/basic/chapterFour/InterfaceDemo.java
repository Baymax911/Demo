package com.test.basic.chapterFour;

/*
 * 接口与抽象类的联系和区别
 */
public class InterfaceDemo {

	public static void main(String[] args) {
		Computer computer =new Computer();
		IUSB phone=new Phone();
		computer.useUSB(phone);
		
		//计算机连接照相机
		IUSB camera=new Camera();
		computer.useUSB(camera);
		
		//计算机连接风扇
		AbstractUSB fen=new Fen();
		computer.usbAb(fen);
	}

}
