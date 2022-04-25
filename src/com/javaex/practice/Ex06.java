package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		char word[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l' };

		for (int i = 0; i < word.length; i++) { 
			System.out.print(word[i]); 
			if (word[i] == ' ') { 
				word[i] = ','; 
			} 
		} 

		System.out.println();

		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]);
		}

	}

}
