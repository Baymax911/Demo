package com.test.basic.chapterFive;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Collection基本操作
 * 添加 add
 * 删除 remove
 * 遍历 增强for循环遍历、迭代器遍历
 * 判断
 * 查找
 */
public class CollectionDemo {

	public static void main(String[] args) {
		Collection<String> collection=new ArrayList<String>();
		System.out.println("元素个数："+collection.size());
		
		//添加元素
		collection.add("aaa");
		collection.add("bbb");
		collection.add("ccc");
		System.out.println("添加后元素的个数是："+collection.size());
		
		//删除元素
		collection.remove("bbb");
		System.out.println("删除后的元素个数是："+collection.size());
		
		//清空元素
		//collection.clear();
		//System.out.println("清空后的元素是："+collection.size());
		
		//增强for循环遍历
		/*System.out.println("增强for循环输出:");
		for(String object:collection) {
			System.out.println(object);
		}*/
		
		//迭代器循环
		String str=" ";
		Iterator<String> iterator=collection.iterator();
		while(iterator.hasNext()) {
			str=iterator.next();
			System.out.println(str);
		}
		
		//判断是否包含
		Boolean boolean1=collection.contains("aaa");
		System.out.println(boolean1);
		
		//判断是否为空
		Boolean boolean2=collection.isEmpty();
		System.out.println(boolean2);
	}

}
