package DLLPW;

public class MaximaMinima {
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
		Node b = new Node(2, a);
		Node c = new Node(5, b);
		Node d = new Node(3, c);
		Node e = new Node(2, d);
		Node f = new Node(7, e);
		Node g = new Node(8, f);
		Node h = new Node(9, f);
		Node i = new Node(1, f);
		Node j = new Node(10, f);
		
		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = g;
		g.next = h;
		h.next = i;
		i.next = j;
		j.next = null;
		
		display(a);
		int num = 46;
		findMaxMin(a);

	}
	
	private static void findMaxMin(Node haed) {
		Node temp = haed.next;
		int maxima;
		int minima;
		while (temp.next != null) {
			if (temp.val>temp.prev.val && temp.val>temp.next.val) {
				maxima = temp.val;
				System.out.println("MAXIMA "+maxima);
			}
			else if (temp.val<temp.prev.val && temp.val<temp.next.val) {
				minima = temp.val;
				System.out.println("MINIMA "+minima);
			}
			temp = temp.next;
		}
		
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
