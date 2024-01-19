package LLQuestionsPW;

import LLQuestionsPW.FindNode.Node;

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
		
		a.next = b; //a->b
		b.next = c;
		c.next = d;
		d.next = e;
		
		Node temp = a;
		for (int i = 0; i < 5; i++) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println();
		
		getNodeFromEnd(2);
		
		
	}

	private static void getNodeFromEnd(int index) {
		int size = 0;
		Node temp = 
		while (temp != null) {
			temp = temp.next;
		}
		
	}

	
}
