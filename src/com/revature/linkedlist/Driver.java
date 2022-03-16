package com.revature.linkedlist;



public class Driver {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.head1 = new Node(3);
		list.head1.next = new Node(7);
		list.head1.next.next = new Node(8);
		list.head1.next.next.next = new Node(10);
		
		list.head2 = new Node(99);
		list.head2.next = new Node(1);
		list.head2.next.next = new Node(8);
		list.head2.next.next.next = new Node(10);
		
		System.out.println("Intersection is at " + list.getNode());
		
	}
	
	

}
