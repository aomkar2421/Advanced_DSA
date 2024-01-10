package linkedlist;

public class LL {

	private Node head;
	private Node tail;
	int size;

	public LL() {
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
	
	
	void displayRev(Node node) {
		Node temp = head;
		if (temp == null) {
			return;
		}
		displayRev(node.next);
		System.out.println(node.val);
	}
	

	public void addLast(int val) {
		Node node = new Node(val);
		tail.next = node;
		tail = 	node;
		if (tail == null) {
			addFirst(val);
			size++;
			return;
		}
		size++;
	}

	public void insertAtIndex(int index, int val) {
		if(index == 0) {
			addFirst(val);
			return;
		}
		if (index == size) {
			addLast(val);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(val, temp.next);
		temp.next = node;
		size++;
	}

	public int deleteFirst() {
		int val = head.val;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return val;
	}
	
	public Node get(int index) {
		Node temp = head;
		for (int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	int deleteLast(){
		if (size == 1) {
			return deleteFirst();
		}
		Node secondLast = get(size-2);
		int val = secondLast.next.val;
		tail = secondLast;
		tail.next = null;
		size--;
		return val;
	}

	public int deleteAtIndex(int index) {
		
		if (index == 0) {
			return deleteFirst();
		}
		if (index == size-1) {
			return deleteLast();
		}
		
		Node prevNode = get(index-1);
		Node nextNode = get(index+1);
		Node curNode = get(index);
		curNode.next = null;
		prevNode.next = nextNode;
		
		size--;
		return curNode.val;
	}

	public int getSize() {
		return size;
	}
	
}
