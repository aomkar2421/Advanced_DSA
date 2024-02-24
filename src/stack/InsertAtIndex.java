package stack;

import java.util.Stack;

public class InsertAtIndex {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		int index = 1;
		int number = 17;
		
		st.push(5);
		st.push(9);
		st.push(18);
		st.push(51);
		System.out.println(st);
		
		Stack<Integer> dt = new Stack<Integer>();
		
		while (st.size()>index) {
			dt.push(st.pop());
		}
		
		System.out.println(dt);
		
		st.push(number);

		while (dt.size()>=1) {
			st.push(dt.pop());
		}
		
		System.out.println(st);

		
	}
}
