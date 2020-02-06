package com.yedam.pgr.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime, endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++){
			list1.add(0, String.valueOf(i));
			
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간: " + (endTime - startTime));
		
		startTime = System.nanoTime();
		for(int i = 0; i < 1000; i++){
			list2.add(0, String.valueOf(i));
			
		}
		endTime = System.nanoTime();
		System.out.println("걸린시간: " + (endTime - startTime));
		
	}

}
