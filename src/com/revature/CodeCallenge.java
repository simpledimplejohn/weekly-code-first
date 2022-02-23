package com.revature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CodeCallenge {

	public static void main(String[] args) {
		/*
		 * Weekly Code Challenge 
		 * John Blalock 
		 */
		
		/*
		 * Take the number 192 and multiply it by each of 1, 2, and 3: 192 × 1 = 192 192
		 * × 2 = 384 192 × 3 = 576 By concatenating each product, we get the 1 to 9
		 * pandigital, 192384576. We will call 192384576 the concatenated product of 192
		 * and (1,2,3) The same can be achieved by starting with 9 and multiplying by 1,
		 * 2, 3, 4, and 5,giving the pandigital, 918273645, which is the concatenated
		 * product of 9 and(1,2,3,4,5). What is the largest 1 to 9 pandigital 9-digit
		 * number that can be formed as the concatenated product of an integer with
		 * (1,2, ... , n) where n >1?
		 */
		
		List<Integer> sortList = new ArrayList<>();
		
		for(int i = 1; i < 1000; i ++) {
			StringBuilder str = new StringBuilder();			
			for(int j = 1; j <= 9; j ++ ) {
				str.append(i*j);

				if(str.length() == 9) {
					int num = checkString(str);
					if(num > 0) {
						sortList.add(num);
					}
				}		
			}
		}
		

		Collections.sort(sortList);
		int answer = sortList.get(sortList.size() - 1);
		
		System.out.println("The answer is: " + answer);
		
		

	}

	private static int checkString(StringBuilder str) {
//		System.out.println(str);
		int num = 0;
		List<Character> charList = new ArrayList<>();
		for(int i = 0; i < str.length(); i++) {
			charList.add(str.charAt(i));
		}
//		System.out.println(charList);
		charList = (ArrayList<Character>) charList.stream()
				.filter(e -> e != '0')
				.distinct()
				.collect(Collectors.toList());
		if(charList.size() == 9) {
//			System.out.println(charList);
			String numString = charList.stream()
					.map(e -> e.toString())
					.collect(Collectors.joining());
			num = Integer.parseInt(numString);
			
		} 
		return num;
		
		
		
	}




}
