package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TriangleNumbers {
	
	/*
	The sequence of triangle numbers is generated by adding the natural numbers. So the7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28.The first ten terms would be:
	1, 3, 6, 10, 15, 21, 28,36, 45, 55, ...
	Let us list the factors of the first seven triangle numbers:
	1: 1
	3: 1,3
	6: 1,2,3,6
	10: 1,2,5,10
	15: 1,3,5,15
	21: 1,3,7,21
	28: 1,2,4,7,14,28
	We can see that 28 is the first triangle number to have over five divisors.
	What is the value of the first triangle number to have over five hundred divisors?
	*/
	
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 1+2;
		int c = 1+2+3;
		int d = 1+2+3+4;
		int e = 1+2+3+4+5;
		
		
//		int times = 7;
//		int sum = 0;
//		for(int i = 1; i <= times; i ++) {
//			sum += i;
//			System.out.println(sum);
//		}
		

		
		// tasks:
		// algorithm to calculate triangle numbers
		// algorithm to find number of divisors		
//		System.out.println("First 7 triangle Numbers");
//		System.out.println(Arrays.toString(listTriangleNumbers(7)));
		int testAnswer = 346500;
		
//		triangleNumberFactor(100000);
		
//		System.out.println("answer is " +countFactors(100));
		
		countFactors(testAnswer);

	}

	private static void triangleNumberFactor(int times) {
		int sum = 0;
		for(int i = 1; i <= times; i ++) {
			sum +=i;
//			System.out.println(sum);
			int answer = countFactors(sum);
			if(answer > 0) {
				System.out.println("10 factors is " + answer);
				break;
			}
		}
		
	}

	private static int countFactors(int num) {
		int count = 0;
		
		for(int i = 1; i <= num; i ++) {
			if(num % i == 0) {
//				System.out.println("factor is " + i);
				count ++;

				if(count == 500) {
//					System.out.println("Number " + i + " Has 6 factors");
					return count;

				} 
			}
		}
		System.out.println("Number " + num +" has " + count + " factors");
		return 0;
		

		
	}


}
