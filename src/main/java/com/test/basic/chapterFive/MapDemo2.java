package com.test.basic.chapterFive;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * HasMap的使用
 * 向一个Map集合中插入元素并根据key的值打印集合的元素
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, String> dictionary=new HashMap<String, String>();
		dictionary.put("java", "java编程思想");
		dictionary.put("c", "c语言");
		dictionary.put("php","php语言");
		
		System.out.println(dictionary.get("java"));
		
		for(String value:dictionary.values()) {
			System.out.println("书籍为："+value);
		}
		
		Set<String> keys=dictionary.keySet();
		for(String key:keys) {
			System.out.println(key);
		}
	}
}
