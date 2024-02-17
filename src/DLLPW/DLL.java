package DLLPW;

import DLLPW.DLLTemplate.Node;

public class DLL {
	static class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val,Node prev) {
			this.val = val;
			this.prev = prev;
		}
		
	}
	
	public static void main(String[] args) {
		Node a = new Node(1, null);
		Node b = new Node(12, a);
		Node c = new Node(23, b);
		Node d = new Node(34, c);
		Node e = new Node(45, d);
		Node f = new Node(56, e);
		Node g = new Node(67, f);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = null;
		display(a);
		displayRev(g);
	}
	
	static void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	static void displayRev(Node tail) {
		Node temp = tail;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.prev;
		}
		System.out.println("START");
	}
	
	
	
}
