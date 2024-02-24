package stack;

import java.util.Stack;

public class Basic {
	public static void main(String[] args) {
		
		Stack <Integer> st = new Stack<Integer>();
		
		st.push(5);
		st.push(9);
		st.push(18);
		st.push(51);
		System.out.println(st);
		st.pop();
		st.pop();
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());
		
	}
}
