package com.test.basic.chapterFive;

import java.util.HashSet;
import java.util.Set;
/*
 * set集合，动态、值不能重复
 */
public class SetDemo {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("test");
		set.add("test");
		set.add("set");
		set.add("aaa");
		set.add("bbb");
		
		for(String item:set) {
			System.out.println(item);
		}
		
	}
}
