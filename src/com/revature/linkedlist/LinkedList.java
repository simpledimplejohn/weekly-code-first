package com.revature.linkedlist;

public class LinkedList {
	Node head1;
	Node head2;
	
	
	
	public int getIntersectionNode(int d, Node node1, Node node2) {
		Node current1 = node1;
		Node current2 = node2;
		for(int i = 0; i < d; i ++) {
			if(current1 == null) {
				return -1;
			}
			current1 = current1.next;
		}
		while (current1 != null && current2 != null) {
			if (current1.data == current2.data) {
				return current1.data;
			}
			current1 = current1.next;
			current2 = current2.next;
		}
		return -1;
	}
	
	public int getNode() {
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d;
		if(c1 > c2) {
			d = c1 - c2;
			return getIntersectionNode(d, head1, head2);
		} else {
			d = c2 - c1;
			return getIntersectionNode(d, head2, head1);
		}
	}
	
	public int getCount(Node node) {
		Node current = node;
		int count = 0;
		while(current != null) {
			count ++;
			current = current.next;
		}
		return count;
	}
	
	
	

}
