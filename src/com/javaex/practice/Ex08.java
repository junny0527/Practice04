package com.javaex.practice;

import java.util.Random;

public class Ex08 {

	public static void main(String[] args) {

		int lottoNum[] = new int[6]; //6개의 랜덤 숫자들을 담은 배열
		Random sum = new Random(); //랜덤생성함

		for (int i = 0; i < 6; i++) {//배열 추가 및 중복제거

			lottoNum[i] = sum.nextInt(45) + 1; //45까지 숫자 뽑음

			for (int j = 0; j < i; j++) { //i와 비교하면서 중복숫자뺌
				if (lottoNum[i] == lottoNum[j])
					i--; //이걸로 중복되는거 뺌
			}
		}

		for (int i = 0; i < 6; i++) //랜덤으로 번호 출력함
			System.out.print(lottoNum[i] + " ");
	}

}
