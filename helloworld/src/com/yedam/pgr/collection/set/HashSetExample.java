package com.yedam.pgr.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		
	Set<String> strSet = new HashSet<>();
	strSet.add("java");
	strSet.add("java1");
	strSet.add("java3");
	strSet.add("java2");
	
	for(String str : strSet) {
		System.out.println(str);
	}
	}

}
