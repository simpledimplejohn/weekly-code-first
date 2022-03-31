package com.revature;

import java.util.Arrays;

public class HundredLockers {

	public static void main(String[] args) {
		
		/*
		 * 100 Lockers: There are 100 closed lockers in a hallway. A man begins by opening all 100 lockers. Next, he closes every second locker. Then, on his
		 *  third pass, he toggles every third locker (closes it if it is open or opens it if it is closed). This process continues for 100 passes, such that
		 *   on each pass 'i', the man toggles every 'i'th locker. After his 100th pass in the hallway, in which he toggles only locker #100, how many lockers 
		 *   are open?
		 */
		
		int lockers[] = new int[100];
		
		// 0-99 100 lockers, closed = 0; open = 1
		
		// open all the lockers
		System.out.println("open all lockers");
		for(int i = 0; i < lockers.length; i++) {
			lockers[i] = 1;
		}
		
		printLocker(lockers);
		
		// % j == 0 
		for(int j = 2; j <= 100; j ++) {
			for(int k =0; k <= 99; k++) {
				if(k % j == 0) {
					if(lockers[k] == 1) {
						lockers[k] = 0;
					} else {
						lockers[k] = 1;
					}
				}
			}
			printLocker(lockers);
		}
		
		howManyOpen(lockers);
		
		
		
		// toggle lockers
		
		
		
		
	}
	
	private static void printLocker(int[] lockers) {
		System.out.println(Arrays.toString(lockers));
	}
	
	private static void printlnLockers(int[] lockers) {
		for(int i = 0; i < lockers.length; i ++) {
			System.out.println("locker " + i + " is " + lockers[i]);
		}
	}


	private static void howManyOpen(int[] lockers) {
		int count = 0;
		
		for(int i = 0; i < lockers.length; i ++) {
			if(lockers[i] == 1) {
				count ++;
			}
			
		}
		System.out.println("Total open = " + count);
		
	}
	
	

}
