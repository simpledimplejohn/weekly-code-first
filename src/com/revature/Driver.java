package com.revature;

public class Driver {

	public static void main(String[] args) {
		
//		System.out.println(concatProd(8));
		
		System.out.println(largestConcat());
		
		
		

	}

	private static StringBuilder largestConcat() {
		StringBuilder concat = new StringBuilder("");
		
		for(int i = 1; i <=10; i ++) {
			for(int j = 1; j <= 9; j ++) {
				int val = i * j;
				concat.append(val);
				if(concat.length() == 9) {
					return concat;
				}
			}
		}
		
		
		
		return concat;
	}

	private static StringBuilder concatProd(int num) {
		
		StringBuilder product = new StringBuilder("");
		
		for(int i = 1; i <= 9; i++ ) {
			int val = 0;
			val = num * i;

			product.append(val);
			System.out.println("length is " +product.length());
			
			
		}
		
		
		return product;
		
	}

}
