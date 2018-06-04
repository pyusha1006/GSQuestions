package com.practice.pyusha.linkedlist;


import com.practice.pyusha.util.Node;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Node first = new Node(2);
		Node second = new Node(4);
		Node third = new Node(4);
		Node fourth = new Node(45);
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = null;
		Node n1 = first;
		System.out.print("With Duplicates:");
		while (n1 != null) {
			System.out.print(n1.data + "->");
			n1 = n1.next;
		}
		System.out.print("Null");
		System.out.println();
		Node node = RemoveDuplicatesMethod(first);
		System.out.print("Without Duplicates:");
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
			
		}
		System.out.print("Null");
		System.out.println();

		
	}

	public static Node RemoveDuplicatesMethod(Node head) {
		Node node = head;
		if(node == null)
			return null;
		
		while(node!=null && node.next!=null){
			if(node.data == node.next.data){
				node.next = node.next.next;
			}else{
				node = node.next;
			}
		}
		return head;
	}
}
