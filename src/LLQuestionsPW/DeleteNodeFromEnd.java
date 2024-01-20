package LLQuestionsPW;

import LLQuestionsPW.FindNode2.Node;

public class DeleteNodeFromEnd {
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
	
		display(a);
		deleteNode(a , 3);
		display(a);
		
	}

	private static void deleteNode(Node head,int number) {
		Node fast = head;
		Node slow = head;

		for (int i = 0; i < number; i++) {
			fast = fast.next;
		}
		
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
				
	}

	static void display(Node head){
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println("END\n");
	}
	
}
