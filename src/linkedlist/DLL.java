package linkedlist;
		
public class DLL {
		
	private Node head;
	private int size;
		
	private class Node{
		Node next;
		Node prev;
		int val;
		
		public Node(int val) {
			this.val = val;
		}
		
		public Node(Node next, Node prev, int val) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}
	}	
		
		
	void addFirst(int val) {
		Node node = new Node(val);
		node.prev = null;
		node.next = head;
		if (head != null) {
			head.prev = node;
		}
		head = node;
		size++;
	}	
		
		
	void addLast(int val) {
		Node node = new Node(val);
		Node last = get(size-1);
		if (head == null) {
			head = node;
		}
		else {
			last.next = node;
			node.prev = last;
			node.next = null;
			
		}
		
		size++;
	}
	
	
	
//	void addLast(int val) {
//	    Node node = new Node(val);
//	    if (head == null) {
//	        head = node;
//	    } else {
//	        Node last = get(size - 1);
//	        last.next = node;
//	        node.prev = last;
//	    }
//	    size++;
//	}

		
		
	void display(){
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.next;
		}
		System.out.print("END\n");
	}	
		
		
	void displayRev() {
		Node temp = get(size-1);
		while (temp != null) {
			System.out.print(temp.val+"->");
			temp = temp.prev;
		}
		System.out.println("START");
	}	
		
		
	int getSize() {
		return size;
	}	
		
		
	Node get(int index) {
		Node temp = head;
		if (index == 0) {
			return head;
		}
		
		for (int i = 0; i < index; i++) {
			temp =temp.next;
		}
		return temp;
	}


	public void deleteFirst() {
		head = head.next;
		head.prev = null;
	}	
		
		
}		
		