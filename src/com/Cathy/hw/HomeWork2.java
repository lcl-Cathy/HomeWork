package com.Cathy.hw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//請依 name 將 userList 作排序
//參考 ChatGPT https://chatgpt.com/share/67cd80d2-b644-8009-9524-9500899351c4
public class HomeWork2 {

	public static void main(String[] args) {

		User user1 = new User("Simon", "Simon@hw.com", System.currentTimeMillis());
		User user2 = new User("Zora", "Zora@hw.com", System.currentTimeMillis());
		User user3 = new User("Cathy", "Cathy@hw.com", System.currentTimeMillis());

		List<User> userList1 = new ArrayList<User>();
		userList1.add(user1);
		userList1.add(user2);
		userList1.add(user3);
	
	    userList1.sort(Comparator.comparing(User::getName));
	    
		System.out.println(" List 01");
		System.out.println(userList1.toString());
		System.out.println("--------------------");

		// User 類別內部 implements Comparator<User>
		List<User> userList2 = new ArrayList<>();
		userList2.add(user1);
		userList2.add(user2);
		userList2.add(user3);
		
		userList2.sort(new User());
		
		System.out.println(" List 02");
		System.out.println(userList2.toString());
		System.out.println("--------------------");


	}

}
