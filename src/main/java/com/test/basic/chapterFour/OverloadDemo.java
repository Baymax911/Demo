package com.test.basic.chapterFour;

public class OverloadDemo {
	/*
	 * 方法重载：在类中可以创建多个方法
	 * 方法名相同，但是具有不同的参数和不同的定义
	 */
	public static void main(String[] args) {
		int a=5;
		int b=10;
		getMax(a,b);
		
		
		float c = 5f;
		float d = 10f;
		getMax(c, d);

	}

	private static void getMax(int firstNum, int lastNum) {
		 if (firstNum > lastNum) {
	            System.out.println("较大的数是" + firstNum);
	        } else if (firstNum < lastNum) {
	            System.out.println("较大的数是" + lastNum);
	        } else {
	            System.out.println("两个数相等");
	        }
	    }

	private static void getMax(float firstNum, float lastNum) {
		if (firstNum > lastNum) {
            System.out.println("较大的数是" + firstNum);
        } else if (firstNum < lastNum) {
            System.out.println("较大的数是" + lastNum);
        } else {
            System.out.println("两个数相等");
        }
    }
	
	//Cat cat=new Cat();
	//Cat.cry();     猫类的cry方法覆盖了父类动物的cry方法
	
	
	
	/*Master master=new Master();
	Dog dog=new Dog;
	Bone bone=new Bone();
	master.feed(dog,bone);
	master.feed(new Cat(),new Fish())
	*/
	
}
