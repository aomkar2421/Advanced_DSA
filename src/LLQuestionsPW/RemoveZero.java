package LLQuestionsPW;

import LLQuestionsPW.RemoveZero.Node;

public class RemoveZero {
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
		Node a = new Node(1);
		Node b = new Node(2);
		Node c = new Node(3);
		Node d = new Node(-3);
		Node e = new Node(-2);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		
		display(a);
		System.out.println(getSize(a));
		function(a);
		
	}


	private static void function(Node head) {
		Node temp = head;
		while (temp.next != null && temp.next.next!=null) {
			if(temp.next.val+temp.next.next.val == 0) {
				temp.next = temp.next.next.next;
			}
			temp = temp.next;
		}
		display(head);
	}


	static int getSize(Node head) {
		Node temp=head;
		int size = 0;
		while (temp!=null) {
			size++;
			temp = temp.next;
		}
		return size;
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
