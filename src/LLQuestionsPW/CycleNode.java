package LLQuestionsPW;

public class CycleNode {
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
		Node g = new Node(88);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = f;
		f.next = c;
		g.next = null;

		int ans = findNode(a);
		System.out.println(ans);
	}

	static int findNode(Node head) {
		
		if(head == null || head.next == null) {
			return -1;
		}
		
		Node slow = head;
		Node fast = head;

		while ( fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				break;
			}
		}		
		
		
		if (slow != fast) {
			return -1;
		}
		
//		System.out.println(slow.val+" "+fast.val);
		slow = head;
//		System.out.println(slow.val+" "+fast.val);

		while (slow!=fast) {
			slow=slow.next;
			fast=fast.next;
			if (slow==fast) {
				return slow.val;
			}
		}

		return -1;
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
