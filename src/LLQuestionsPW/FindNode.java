package LLQuestionsPW;

public class FindNode {
	Node head;
	static class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
		}
		
		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
		
	}
	
	public static void main(String[] args) {
		Node a = new Node(5);
		Node b = new Node(51);
		Node c = new Node(8);
		Node d = new Node(59);
		Node e = new Node(17);
		
		a.next = b; 
		b.next = c;
		c.next = d;
		d.next = e;
		
		Node temp = a;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println();
		
		getNodeFromEnd(a , 3);
		
		
	}

	private static void getNodeFromEnd(Node head , int index) {
		int size = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			size++;
		}

		int m = size-index+1;
		
		Node temp1 = head;
		
		for (int i = 1; i < m; i++) {
			temp1 = temp1.next;
		}
		
		System.out.println(temp1.val);
	}

	
}
