package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] Array = new int[5];
		
		int sum = 0;
		
		for(int i = 0; i<Array.length; i++) {
			Array[i] = input.nextInt();
			sum += Array[i];
		}
		System.out.println("평균은 " + (double)sum / Array.length + " 입니다.");
		input.close();

	}

}
