package LLQuestionsPW;

public class Intersection2 {
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
		Node a1 = new Node(39);
		Node b1 = new Node(46);
		Node c1 = new Node(61);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		a1.next = b1;
		b1.next = c1;
		c1.next = b;
		
		
		display(a);
		display(a1);

		int interNode = findIntersection(a , a1);
		System.out.println("Intersection at value "+interNode);
	}

	private static int findIntersection(Node head1, Node head2) {

		int size1 = getSize(head1);
		int size2 = getSize(head2);

		Node temp1 = head1;
		Node temp2 = head2;
		int def ;
		
		if (size1>size2) {
			def = size1-size2;
			for (int i = 0; i < def; i++) {
				temp1 = temp1.next;
			}
		} else {
			def = size2-size1;
			for (int i = 0; i < def; i++) {
				temp2 = temp2.next;
			}
		}
		
		

		while (temp1 != null || temp2!=null) {
			if (temp1 == temp2) {
				System.out.println(temp1.val);
				return temp1.val;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}

		return -1;
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
