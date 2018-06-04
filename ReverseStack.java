package com.practice.pyusha.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/*
 * input : element in stack(hardcoded here)
 * 
 * output: reversed stack
 * 
 * complexity: O(n)
 * space complexity: O(n)
 */
public class ReverseStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(2);
		st.push(5);
		st.push(10);
		st.push(21);
		System.out.println();
		Stack<Integer> out_res = reverseStack(st);
		while(!out_res.isEmpty()){
			System.out.println(out_res.pop()+" ");
		}
		
	}

	public static Stack<Integer> reverseStack(Stack<Integer> st){
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> q = new LinkedList<>();
		while(!st.isEmpty()){
		q.add(st.pop());
		}
		while(!q.isEmpty()){
			stack.push(q.poll());
		}
		return stack;
	}

}
