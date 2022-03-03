package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Addition;
import com.javalec.function.Calc;
import com.javalec.function.ConstCalc;
import com.javalec.function.MethodCalc;

public class Main {

	public static void main(String[] args) {
		//두 개의 정수를 입력 받아 덧셈 기능 구현하기
		
		Scanner scanner= new Scanner(System.in);
		int num1 =0; //첫번째 수 
		int num2 =0; //두번째 수
		
		System.out.println("첫 번째 수를 입력하세요.");
		num1 = scanner.nextInt();
		
		
		System.out.println("두 번째 수를 입력하세요.");
		num2 = scanner.nextInt();
		
		//Field 
		
		ConstCalc calc = new ConstCalc(num1, num2);
		System.out.println(num1 + "+" + num2 + "=" + calc.addition());
		
		System.out.println(num1 + "-" + num2 + "=" + calc.substraction());
	
		System.out.println(num1 + "*" + num2 + "=" + calc.multiplication());
		
		System.out.println(num1 + "/" + num2 + "=" + calc.division());
		
		
//		MethodCalc calc = new MethodCalc();
//		int addResult = calc.addition(num1,  num2);
//		System.out.println(num1 + "+" + num2 + "=" + addResult);
//		
//		int substractionResult = calc.substraction(num1,  num2);
//		System.out.println(num1 + "-" + num2 + "=" + substractionResult);
//		
//		int multiplicationResult = calc.multiplication(num1,  num2);
//		System.out.println(num1 + "*" + num2 + "=" + multiplicationResult);
//		
//		double divisionResult = calc.division(num1, num2);
//		System.out.println(num1 + "/" + num2 + "=" + divisionResult);
		
		
//		Calc calc = new Calc();
//		calc.num1 = num1;
//		calc.num2 = num2;
		
//		calc.addition();
//		calc.substraction();
//		calc.multiplication();
//		calc.division();
		
//		calc.calcAll();
//		System.out.println(calc.addition());
//	
//		System.out.println(calc.multiplication());
//	
		
		
				
		//덧셈 기능 구현하기
		//Case 1: Field 를 이용하여 계산하기
		
//		Addition addition = new Addition(); //Addtion 타이핑할 때, Ctrl +space
//		addition.num1 = num1;
//		addition.num2 = num2;
//		addition.addAction();
//		addition.subtractionAction();
//		addition.multiplicationAction();
//		addition.divisionAction();
//		
//		
//	
//		System.out.println(num1 + "+ " +num2 + "=" + addition.addReturn());
//		System.out.println(num1 + "- " +num2 + "=" + addition.subtractionReturn());
//		System.out.println(num1 + "* " +num2 + "=" + addition.multiplicationReturn());
//		System.out.println(num1 + "/ " +num2 + "=" + addition.divisionReturn());
//		
		
	}

}
