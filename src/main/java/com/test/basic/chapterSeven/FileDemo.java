package com.test.basic.chapterSeven;

import java.io.File;
import java.io.IOException;

/*
 * File类的基本应用
 */
public class FileDemo {

	public static void main(String[] args) {
		File file=new File("D:/","test.txt");
		if(file.exists()){
			//file.delete();
			//System.out.println("文件已删除");
		}else {
			try {
				file.createNewFile();
				System.out.println("文件已创建");
				System.out.println("文件长度:"+file.length());
				System.out.println("文件名："+file.getName());
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
