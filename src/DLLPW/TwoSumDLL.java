package DLLPW;

public class TwoSumDLL {
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
		Node e = new Node(44, d);
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
		int num = 46;
		findTwoSum(a,num);

	}
	
	private static void findTwoSum(Node haed,int num) {
		Node h = haed;
		Node t = null;
		
		while (h.next != null) {
			h = h.next;
		}
		t = h;
		h = haed;
		
		while (h != t) {
			int sum = h.val + t.val;
			if (sum == num) {
				System.out.println("Numbers are "+h.val+" "+t.val);
				break;
			}
			else if (sum > num) {
				t= t.prev;
			}
			else {
				h = h.next;
			}
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
