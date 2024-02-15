package LLQuestionsPW;


public class Palindrome {
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
		Node c1 = new Node(89);
		Node c2 = new Node(80);
		Node d = new Node(8);
		Node e = new Node(51);
		Node f = new Node(5);

		a.next = b;
		b.next = c;
		c.next = c1;
		c1.next = c2;
		c2.next = d;
		d.next = e;
		e.next = f;

		display(a);
		palindromeLL(a);
		display(a);

	}
	
	
	
	
	private static void palindromeLL(Node head) {       // in case of findLeft just return slow.next , but in case of findRight we need to return slow.next only when fast.next == null.
		
		Node slow = head;
		Node fast = head;
		
		while (fast.next!=null && fast.next.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		Node prev = null;
		Node curr = slow.next;
		Node newNext = curr.next;
		
		while (curr.next != null) {
			curr.next = prev;
			prev = curr;
			curr = newNext;
			newNext = newNext.next;
		}
		curr.next = prev;	
		
		slow.next = curr;
		Node p1 = head;
		Node p2 = slow.next;
		
		while (p2 != null) {
			if (p1.val != p2.val) {
				System.out.println("Not Palindrome");
				return;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		System.out.println("Palindrome");
		
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
