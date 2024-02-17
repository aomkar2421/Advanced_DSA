package DLLPW;


public class CLLTemplate {
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
		Node a = new Node(50);
		Node b = new Node(51);
		Node c = new Node(88);
		Node d = new Node(59);
		Node e = new Node(17);
		Node f = new Node(26);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = a;

		display(a);

	}


	static void display(Node head){
		Node temp = head;

		do {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}while (temp != head);

		System.out.println("HEAD\n");
	}

}
