package com.practice.pyusha.linkedlist;

import com.practice.pyusha.util.Node;

/*
 * input : elements of the linked list(int)
 * 
 * output: even and odd linked list
 * 
 * complexity: O(n)
 * Space Complexity:O(1)
 */
public class SplitListOddEven {
	public static void main(String[] args) {
		Node first = new Node(-4);
		Node second = new Node(41);
		Node third = new Node(8);
		Node fourth = new Node(101);
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = null;
		Node n = first;
		System.out.print("list:");
		while (n != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.print("Null");
		System.out.println();
		SplitListOddEvenMethod(first);
	}

	public static void SplitListOddEvenMethod(Node newNode) {
		if (newNode == null)
			return;
		Node odd_head = null;
		Node even_head = null;
		Node odd_ptr = null;
		Node even_ptr =null;
		while (newNode != null) {
			if (newNode.data % 2 != 0) {
				if(odd_head == null)
					odd_head= newNode;
				if(odd_ptr!=null){
					odd_ptr.next = newNode;
				}
				odd_ptr = newNode;
				newNode = newNode.next;
			} else {
				if(even_head == null)
					even_head= newNode;
				if(even_ptr!=null){
					even_ptr.next = newNode;
				}
				even_ptr = newNode;
				newNode = newNode.next;
			}
		}
		if(even_ptr!=null)
		even_ptr.next = null;
		if(odd_ptr!=null)
		odd_ptr.next = null;
		System.out.print("Odd list:");
		while (odd_head != null) {
			System.out.print(odd_head.data+"->");
			odd_head = odd_head.next;
		}
		System.out.print("Null");
		System.out.println("");
		System.out.print("Even list:");
		while (even_head != null) {
			System.out.print(even_head.data+"->");
			even_head = even_head.next;
		}
		System.out.print("Null");
		System.out.println("");
	}
}
