package com.test.basic.chapterFive;

import java.util.ArrayList;
import java.util.List;

/*
 * 简单演示ArrayList
 */
public class ListDemo {
	public static void main(String[] args) {
		String a="a";
		String b="b";
		String c="c";
		String d="d";
		String apple="apple";
		List<String> list=new ArrayList<String>();
		list.add(a);
		list.add(apple);
		list.add(b);
		list.add(apple);
		list.add(c);
		list.add(apple);
		list.add(d);
		System.out.println(list);//输出列表的全部元素
		System.out.println("apple 第一次出现的索引位置是："+list.indexOf(apple));
		System.out.println("apple 最后一次出现的索引位置是："+list.lastIndexOf(apple));
	}
}
