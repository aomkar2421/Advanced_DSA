package stack;

import java.util.Stack;

public class Reverse {
	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<Integer>();
		
		st.push(5);
		st.push(9);
		st.push(18);
		st.push(51);
		
		System.out.println(st);
		
		
		Stack<Integer> dt = new Stack<Integer>();
		while (st.size()>=1) {
			dt.push(st.pop());
		}
		System.out.println(dt);
		
		
		Stack<Integer> rt = new Stack<Integer>();
		while (dt.size()>=1) {
			rt.push(dt.pop());
		}
		System.out.println(rt);
		
		while (rt.size()>=1) {
			st.push(rt.pop());
		}
		System.out.println(st);
	
	}
}
