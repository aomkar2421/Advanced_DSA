package DLLPW;


public class PalindromeDLL {
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
		Node e = new Node(23, d);
		Node f = new Node(12, e);
		Node g = new Node(1, f);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = null;
		
		display(a);
		checkPalindrome(a);

	}
	
	private static void checkPalindrome(Node haed) {
		Node h = haed;
		Node t = null;
		
		while (h.next != null) {
			h = h.next;
		}
		t = h;
		h = haed;
		
		while (h != t) {

			if (h.val != t.val) {
				System.out.println("List is Not Palindrome");
				break;
			}
			h = h.next;
			t = t.prev;
		}
		System.out.println("List Is Palindrome");
	}

	static void display(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.println("END");
	}
}
