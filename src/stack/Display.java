package stack;

import java.util.Stack;

public class Display {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);

		displayRev(st);
		System.out.println("\n"+st);
	}

	private static void displayRev(Stack<Integer> st) {
		if(st.size()==0) {
			return;
		}
		int a = st.pop();
		displayRev(st);
		
		System.out.print(a+" ");
		st.push(a);
	}
}
