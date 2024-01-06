package linkedlist;
	
public class Basics {
	
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
//		Node a = new Node(5);
//		Node b = new Node(51);
//		Node c = new Node(8);
//		Node d = new Node(59);
//		Node e = new Node(17);
//		
//		a.next = b; //a->b
//		b.next = c;
//		c.next = d;
//		d.next = e;
//		
//		System.out.println(a);
//		System.out.println(a.next);
//		System.out.println(b);
//		System.out.println(b.next);
//		System.out.println(c);
//		System.out.println(d);
		
		Node d1 = new Node(31);
		Node c1 = new Node(31, d1);
		Node b1 = new Node(31, c1);
		Node a1 = new Node(31, b1);
		
		System.out.println(a1);
		System.out.println(a1.next);
		System.out.println(b1);
		System.out.println(b1.next);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(d1.next);
	}
}
