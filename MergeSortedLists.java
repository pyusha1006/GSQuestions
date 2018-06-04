package com.practice.pyusha.linkedlist;

import com.practice.pyusha.util.Node;

public class MergeSortedLists {
	public static void main(String[] args) {
		Node first = new Node(4);
		Node second = new Node(14);
		Node third = new Node(18);
		Node fourth = new Node(20);
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = null;
		Node n = first;
		System.out.print("first list:");
		while (n != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.print("Null");
		System.out.println();
		Node one = new Node(-2);
		Node two = new Node(1);
		Node three = new Node(8);
		Node four = new Node(101);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = null;
		Node n1 = one;
		System.out.print("Second list:");
		while (n1 != null) {
			System.out.print(n1.data + "->");
			n1 = n1.next;
		}
		System.out.print("Null");
		System.out.println();
		Node result = MergeSortedListsMethod(first, one);
		System.out.print("Merged list:");
		while (result != null) {
			System.out.print(result.data + "->");
			result = result.next;
		}
		System.out.print("Null");
		System.out.println();
	}

	public static Node MergeSortedListsMethod(Node node1,Node node2) {
		Node newNode = null;
		if(node1==null)
			return node2;
		else if(node2== null)
			return node1;
		
			if(node1.data >= node2.data){
				newNode = node2;
				newNode.next =MergeSortedListsMethod(node1,node2.next);
			}
			else {
				newNode = node1;
				newNode.next =MergeSortedListsMethod(node1.next,node2);
			}
			
		return newNode;
	}
}
