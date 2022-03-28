package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HundredLockers {

	public static void main(String[] args) {
		
		/*
		 * 100 Lockers: There are 100 closed lockers in a hallway. A man begins by opening all 100 lockers. Next, he closes every second locker. Then, on his
		 *  third pass, he toggles every third locker (closes it if it is open or opens it if it is closed). This process continues for 100 passes, such that
		 *   on each pass 'i', the man toggles every 'i'th locker. After his 100th pass in the hallway, in which he toggles only locker #100, how many lockers 
		 *   are open?
		 */
		
		int lockers[] = new int[99];
		
		// 0-99 100 lockers, closed = 0; open = 1
		
		// open all the lockers
		System.out.println("open all lockers");
		for(int i = 0; i < lockers.length; i++) {
			lockers[i] = 1;
		}
		System.out.println(Arrays.toString(lockers));
		
		// close every second
		System.out.println("close every other one");
		for(int i = 0; i < lockers.length; i = i + 2) {
			lockers[i] = 0;
		}
		System.out.println(Arrays.toString(lockers));
		
		System.out.println("toggle every third");
		for(int i = 0; i <lockers.length; i = i + 3) {
			if(lockers[i] == 0) {
				lockers[i] = 1;
			} else {
				lockers[i] = 0;
			}
		}
		System.out.println(Arrays.toString(lockers));		
		
		processArrays(lockers,100);
	}

	private static void processArrays(int[] lockers, int amount) {
		for(int i = 4; i <= amount; i ++ ) {
			for(int j = 0; j < lockers.length; j = j + i) {
				if(lockers[j] == 0) {
					lockers[j] = 1;
				} else {
					lockers[j] = 0;
				}
			}
		}
		System.out.println("final locker");
		System.out.println(Arrays.toString(lockers));			
		howManyOpen(lockers);
		
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
