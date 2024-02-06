package LLQuestionsPW;

public class MergeLL1 {
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
		Node a1 = new Node(50);
		Node b1 = new Node(51);
		Node c1 = new Node(59);
		Node d1 = new Node(88);
		Node e1 = new Node(97);
		Node f1 = new Node(98);
		Node g1 = new Node(99);
		Node a2 = new Node(26);
		Node b2 = new Node(39);
		Node c2 = new Node(46);
		Node d2 = new Node(61);

		a1.next = b1;
		b1.next = c1;
		c1.next = d1;
		d1.next = e1;
		e1.next = f1;
		f1.next = g1;
		a2.next = b2;
		b2.next = c2;
		c2.next = d2;
		
		
		display(a1);
		display(a2);

		mergeLinkedLists(a1 , a2);
		
	}

	private static void mergeLinkedLists(Node head1, Node head2) {

		Node temp1 = head1;
		Node temp2 = head2;
		
		Node head = new Node(100);
		Node temp = head;
		
		while (temp1!=null && temp2!=null) {
			if (temp1.val < temp2.val) {
				Node a = new Node(temp1.val);
				temp.next = a;
				temp = a;
				temp1 = temp1.next;
			} else {
				Node b = new Node(temp2.val);
				temp.next = b;
				temp = b;
				temp2 = temp2.next;
			}
		}
		
		if (temp1 != null) {
			temp.next = temp1;
		}
		else if(temp2 != null) {
			temp.next = temp2;
		}
		
		display(head.next);
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
