package com.Cathy.hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//�ѦҺ��}
//https://www.w3schools.com/java/java_hashmap.asp
//https://ithelp.ithome.com.tw/articles/10234424
public class HomeWork1 {
	public static void main(String[] args) {
		
		ArrayList<String> inner1 = new ArrayList<>();
		inner1.add("�ﶵ1-1-1");
		inner1.add("�ﶵ1-1-2");
		ArrayList<String> inner2 = new ArrayList<>();
		inner2.add("�ﶵ1-2-1");
		inner2.add("�ﶵ1-2-2");
		
		System.out.println(inner1);
		System.out.println(inner2);
		
		Map<String,ArrayList<String>> middle = new HashMap<>();
		
		middle.put("�ﶵ1-1",inner1);
		middle.put("�ﶵ1-2",inner2);
		
		System.out.println(middle);
		
		Map<String,Map<String,ArrayList<String>>> outside = new HashMap<>();
		
		outside.put("�ﶵ 1", middle);
		
		System.out.println(outside);		
		
		
	}
}
