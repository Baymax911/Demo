package com.test.basic.chapteroneThree;


public class SkipDemo {
/*
 * break/continue/return跳转语句
 */
	public static void main(String[] args) {
		int a=0;
		while(true) {
			a++;
			if (a>3) {
				break; //当a大于3的时候，跳出循环				
			}			
		}
		
		System.out.println(a);
		
		//当a的值能被2整除，表示该数不是奇数
		/*while(a<100) {
			a++;
			if(a%2==0) {
				continue;
			}
			//System.out.println(a+" ");
		}*/
		return;
		//System.out.println("sss");
	}

}
