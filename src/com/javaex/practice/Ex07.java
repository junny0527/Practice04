package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] Array = new int[] {50000,10000,5000,1000,500,100,50,10,5,1};
		
		int[] sum = new int[10]; 
		
		System.out.print("금액:");
		
		int num = input.nextInt(); 
		
		for (int i = 0; i < Array.length; i++) { 
			sum[i] = num / Array[i];	
			num = num % Array[i];	
		}
		
		for (int i = 0; i<sum.length; i++) {
			System.out.println(Array[i]+ "원:" + sum[i] + "개");
		}

			input.close();

	}

}
