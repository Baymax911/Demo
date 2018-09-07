package com.test.basic.chapteroneThree;

/*
 * 1到100的和
 */
public class ForDemo {

	public static void main(String[] args) {
		/*int sum=0;
		for(int i=0;i<101;i++) {
			sum+=i;
			
		}
		System.out.println("1+2+3……+100="+sum);		
		 * while实现1到100的和
		 */
		int sum=0;
		int i=0;
		//while(i<=100) {
			//sum+=i++; //sum
		//}
		//System.out.println("1+2+3……+100="+sum);
		
		
		/*
		 * do while实现1到100的和
		 */
		do {
			sum+=i++;
		} while (i<=100);
		System.out.println("1+2+3……+100="+sum);
		
	}	
	
}
