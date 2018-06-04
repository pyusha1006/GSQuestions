package com.practice.pyusha.stack;

/*
 * input : element in stack(hardcoded here)
 * 
 * output: cloned stack
 * 
 * complexity: O(n)
 * space complexity: O(n)
 */

public class CloneStack {
	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack();
		stack.push(2);
		stack.push(3);
		stack.push(6);
		stack.push(-4);
		ArrayStack st = CloneStackMethod(stack);
		while(!st.isEmpty()){
			System.out.println(st.pop());
			}
	}
	
	public static ArrayStack CloneStackMethod(ArrayStack stack){
		ArrayStack aux_stack = new ArrayStack();
		ArrayStack dup_stack = new ArrayStack();
		while(!stack.isEmpty()){
			aux_stack.push(stack.pop());
		}
		while(!aux_stack.isEmpty()){
		dup_stack.push(aux_stack.pop());
		}
		return dup_stack;
	}

}
