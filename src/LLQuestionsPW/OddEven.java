package LLQuestionsPW;

public class OddEven {
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
		Node a1 = new Node(3);
		Node b1 = new Node(32);
		Node c1 = new Node(44);
		Node d1 = new Node(57);
		Node e1 = new Node(63);
		Node f1 = new Node(61);
		Node g1 = new Node(72);
		Node h1 = new Node(78);
		Node i1 = new Node(79);
		Node j1 = new Node(83);
		Node k1 = new Node(85);

		a1.next = b1;
		b1.next = c1;
		c1.next = d1;
		d1.next = e1;
		e1.next = f1;
		f1.next = g1;
		g1.next = h1;
		h1.next = i1;
		i1.next = j1;
		j1.next = k1;
		
		
		display(a1);

		separeteLL(a1);
		
	}

	private static void separeteLL(Node head) {
        Node temp = head;
        Node e = new Node(2);
        Node head1 = e;
        Node o = new Node(1);
        Node head2 = o;
        
        while (temp != null) {
			if (temp.val%2 == 0) {
				e.next = temp;
				e = temp;
			}else {		 
				o.next = temp;
				o = temp; 
			}
			temp = temp.next;
		}

        display(head1.next);
        display(head2.next);
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
