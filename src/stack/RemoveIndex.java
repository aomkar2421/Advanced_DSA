package stack;

import java.util.Stack;

public class RemoveIndex {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		System.out.println(st);
		removeFromIndex(st,2);
		System.out.println(st);
		
	}

	private static void removeFromIndex(Stack<Integer> st, int idx) {
		if(st.size()==idx) {
			st.pop();
			return;
		}
		int a = st.pop();
		removeFromIndex(st, idx);
		st.push(a);
	}
}
