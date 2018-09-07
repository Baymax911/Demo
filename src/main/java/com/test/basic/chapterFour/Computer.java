package com.test.basic.chapterFour;

import javax.swing.AbstractAction;

/*
 * 计算机类，使用usb接口
 */
public class Computer {
	public Computer() {
		System.out.println("计算机启动了");
	}
	public void useUSB(IUSB usb) {
		usb.start();
		usb.stop();
	}
	public void usbAb(AbstractUSB ausb) {
		ausb.start();
	}
}
