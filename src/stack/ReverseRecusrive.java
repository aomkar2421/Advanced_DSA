package stack;

import java.util.Stack;

public class ReverseRecusrive {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.println(st);
		reverse(st);
		System.out.println(st);
		
	}

	private static void reverse(Stack<Integer> st) {
		if(st.size()==1) {
			return;
		}
		int a = st.pop();
		reverse(st);
		pushBottom(st, a);
	}
	
	private static void pushBottom(Stack<Integer> st, int i) {
		if(st.size()==0) {
			st.push(i);
			return;
		}
		
		int a = st.pop();
		pushBottom(st, i);
		st.push(a);
		
	}
	
}
