package stack;

import java.util.Stack;

public class BottomPush {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.println(st);
		pushBottom(st,99);
		System.out.println(st);
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
