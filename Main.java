package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scanner = new Scanner(System.in);
		
		
//		구구단 중에서 입력한 숫자의 단 출력
//		System.out.print("원하는 숫자를 입력하세요:");
//		int num = scanner.nextInt();
//		
//		System.out.println("* 구구단 *");
//		for (int i=1 ; i<=9 ; i++) {
//			System.out.println(num + " x " + i + " = " + (num*i));
//		}
//		
//		

		// 2단부터 9단까지
//		for (int dan=2 ; dan<=9 ; dan++) {
//			System.out.println("** " + dan + " 단 **");
//			for (int i=1 ;i<=9 ; i++) {
//				System.out.println(dan + " x " + i + " = " + (dan * i));
//			}
//			System.out.println("-----------");
//		
//	}

		
		
//	for (int i = 1 ; i<=9 ; i++) {
//		for(int dan = 2; dan <=9; dan++) {
//			System.out.print(dan + " X " + i + " = " + (dan * i) + "\t");
//		}
//		System.out.println();
//		}

		
		//짝수단에 곱하는 수가 짝수인 경우만 출력
//	for (int i = 1 ; i<=9 ; i++) {
//	
//		for(int dan = 2; dan <=9; dan++) {
//			if (i % 2 == 0 && dan % 2 == 0 ) {
//			System.out.print(dan + " X " + i + " = " + (dan * i) + "\t");
//		}
//		}
//		System.out.println();
//	}

		//답이 홀수인 경우 자리 비워놓기
//		for (int i = 1; i <= 9; i++) {
//
//			for (int dan = 2; dan <= 9; dan++) {
//				if ((dan * i) % 2 == 0) {
//					System.out.print(dan + " X " + i + " = " + (dan * i) + "\t");
//				} else {
//					System.out.print("\t\t");
//				}
//			}
//			System.out.println();
//
//		}
		
		
		//홀수가 답인 부분을 언더바로 표시
		
//		for (int i = 1; i <= 9; i++) {
//			
//			for (int dan = 2; dan <= 9; dan++) {
//				if ((dan * i) % 2 == 0) {
//					System.out.print(dan + " X " + i + " = " + (dan * i) + "\t");
//				} else {
//					System.out.print(dan + " X " + i + " = " + "__" + "\t");
//				}
//			}
//			System.out.println();
//			
//		}
		
		
		//곱하는 수가 홀수인 경우 *로 표시하기.
		for (int i = 1; i <= 9; i++) {
			
			for (int dan = 2; dan <= 9; dan++) {
				if (i % 2 == 0) {
					System.out.print(dan + " X " + i + " = " + (dan * i) + "\t");
				} else {
					System.out.print(dan + " X " + "*" + " = " + (dan * i) + "\t");
				}
			}
			System.out.println();
			
		}
	}

}
