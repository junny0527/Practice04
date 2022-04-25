package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {
		int[] Array = new int[] { 1, 3, 5, 7, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int sum = 0;
		int count = 0;
		for (int i = 0; i < Array.length; i++) {
			if (Array[i] % 3 == 0) {
				sum += Array[i];
				count++;

			}

		}
		System.out.println("3의배수 개수=" + count);
		System.out.println("3의 배수 합 = " + sum);

	}

}
