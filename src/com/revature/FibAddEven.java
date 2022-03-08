package com.revature;

public class FibAddEven {

	public static void main(String[] args) {
		
		// find the fibinacci number:
		
		fibNum(4000000);
		
	}

	private static void fibNum(long i) {
		
		long first = 0;
		long second = 1;
		
		long counter = 0;
		
		long answer = 0;
		
		while(counter<= i) {
			

			
			if(first %2==0 && first <= 4000000) {
//				System.out.println(first);
				answer += first;
			}
			
			long third = first + second;
			first = second;
			second = third;
			counter ++;
			
			
		}
		System.out.println("total is " + answer);
		

	}

}
