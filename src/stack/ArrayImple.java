package stack;

public class ArrayImple {
	
	static class Stack{
		int [] arr = new int[100];
		int idx = 0;
		
		
		void push(int val) {
			arr[idx] = val;
			idx++;
		}
		
		int peek() {
			if(idx == 0) {
				System.out.println("Stack Is Empty");
				return -1;
			}
			return arr[idx-1];
		}
		
		int pop() {
			if(idx == 0) {
				System.out.println("Stack Is Empty");
				return -1;
			}
			int a = arr[idx-1];
			arr[idx-1]=0;
			idx--;
			return a;
		}
		
		void display() {
			if(idx==0) {
				System.out.println("Stack Is Empty");
			}
			for (int i = 0; i < idx; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
		
		
		int size() {
			return idx;
		}
		
		int capacity() {
			return arr.length;
		}
		
	}
	
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.display();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st.capacity());
		System.out.println(st.size());
		st.display();
		System.out.println(st.peek());
		st.display();
		System.out.println(st.pop());
		st.display();
		System.out.println(st.pop());
		st.display();
		System.out.println(st.pop());
		st.display();
		System.out.println(st.size());

	}
	
}
