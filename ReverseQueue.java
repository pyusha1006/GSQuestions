package com.practice.pyusha.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * input : input stack(hardcoded)
 * 
 * output:reversed stack
 * 
 * complexity: O(n)
 * Space Complexity: O(n)
 */
public class ReverseQueue {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(3);
		q.add(5);
		q.add(17);
		Queue<Integer> out = reverseQueue(q);
		while(!out.isEmpty()){
			System.out.print(out.poll()+" ");
		}
		
	}

	public static Queue<Integer> reverseQueue(Queue<Integer> queue){
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> result = new LinkedList<>();
		while(!queue.isEmpty()){
		stack.push(queue.poll());
		}
		while(!stack.isEmpty()){
		result.add(stack.pop());
		}
		return result;
	}
	
}
