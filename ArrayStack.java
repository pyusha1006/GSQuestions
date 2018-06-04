package com.practice.pyusha.stack;

public class ArrayStack {
	private int[] arrStack ;
	private int counter = -1;
	
ArrayStack(){
	arrStack = new int[16];
}

public void push(int elem){
	arrStack[++counter] = elem;
}

public int pop(){
	return arrStack[counter--];
}

public boolean isEmpty(){
	return (counter==-1);
}

public boolean isFull(){
	return (counter==arrStack.length);
}

}
