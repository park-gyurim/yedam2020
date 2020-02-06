package com.yedam.pgr.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		strList.add("하준원");
		strList.add("박규림");
		strList.add("홍성우");
		System.out.println(strList.get(0));
		
		strList.add(1, "배진");
		System.out.println(strList.get(1));
		for(int i = 0; i <strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		strList.remove(3);
		System.out.println("remove(3) 이후");
		for(String str : strList) {
			System.out.println(str);
		}
				
		List<Integer> intList = new LinkedList<>();
	}

}
