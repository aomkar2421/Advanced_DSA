package LLQuestionsPW;

public class Template {

	private Node head;
	private Node tail;
	int size;

	public Template() {
		this.size = 0;
	}

	public class Node {
		private int val;
		private Node next;

		public Node(int val) {
			this.val = val;
		}

		public Node(int val , Node next) {
			this.val = val;
			this.next = next;
		}
	}

	public void addFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;

		if (tail==null) {
			tail = node;
			size++;
			return;
		}
		size++;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.print("END");
	}

}
