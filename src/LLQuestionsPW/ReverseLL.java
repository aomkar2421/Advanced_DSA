package LLQuestionsPW;

public class ReverseLL {
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
		Node f = new Node(7);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;

		display(a);
		reversedLinkedlist(a);

	}
	
	
	static void reversedLinkedlist(Node head) {
		Node curr = head;
		Node prev = null;
		Node newNext = curr.next; 
		
		while (curr.next != null) {
			curr.next = prev;
			prev = curr;
			curr = newNext;
			newNext = newNext.next;
		}
		curr.next = prev;
		head = curr;
		display(head);
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
