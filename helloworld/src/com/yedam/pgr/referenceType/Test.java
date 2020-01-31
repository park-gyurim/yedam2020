package com.yedam.pgr.referenceType;

public class Test {
	public static void main(String[] args) {
		int[][] Ary = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;

		int cnt = 0;

		for (int i = 0; i < Ary.length; i++) {
			for (int j = 0; j < Ary[i].length; j++) {
				sum += Ary[i][j];
				cnt++;
			}

//			cnt += Ary[i].length;

		}

		avg = (double) sum / cnt;

		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
