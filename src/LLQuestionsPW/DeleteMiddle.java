package LLQuestionsPW;

public class DeleteMiddle {
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
		deleteMiddleNode(a);
		display(a);

	}
	
	static void deleteMiddleNode(Node head) {
		Node slow = head;
		Node fast = head;
		
		while ( fast.next.next !=null && fast.next.next.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
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
