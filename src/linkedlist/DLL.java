package linkedlist;

import java.text.BreakIterator;

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


	//	public void deleteFirst() {
	//		if(head.next != null) {
	//			head = head.next;
	//			head.prev = null;
	//		}
	//		else {
	//			head = null;
	//		}
	//		size--;
	//	}


	public void deleteFirst() {
		if (size == 0) {
			return;
		} else if (size == 1) {
			head = null;
		} else {
			head = head.next;
			head.prev = null;
		}
		size--;
	}


	//	public void deleteLast() {
	//		if (size == 0) {
	//			return;
	//		} else if (size == 1) {
	//			head = null;
	//		} else {
	//			Node secondLast = get(size - 2);
	//			secondLast.next = null;
	//		}
	//		size--;
	//	}	


	public void deleteLast() {
		if (head.next == null) {
			// Only one node in the list
			head = null;
		} else {
			Node secondLast = get(size - 2);
			secondLast.next = null;
		}
		size--;

	}


	public int getValue(int index) {
		Node node = get(index);
		return node.val;
	}


//	public void getIndex(int val) {
//		Node temp = head;
//
//		int counter = 0;
//		while (temp != null) {
//			
//			if (temp.val == val) {
//				System.out.println("element is present at index : "+counter);
//				return;
//			}
//			
//			counter++;
//			temp = temp.next;
//		}
//		System.out.println("Element is not present");
//	}


	public int getIndex(int val) {
		Node temp = head;

		int counter = 0;
		while (temp != null) {
			
			if (temp.val == val) {
				return counter;
			}
			
			counter++;
			temp = temp.next;
		}
		return -1;
	}


	public void insertAtIndex(int index, int value) {
		if (index == 0) {
			addFirst(value);
			return;
		}
		if (index == size-1) {
			addLast(value);
			return;
		}
		
		Node node = new Node(value);
		Node bef = get(index-1);
	
		node.next = bef.next;
		bef.next.prev = node;
		
		bef.next = node;
		node.prev = bef;
		size++;
	}


	public int removeFromIndex(int index) {
		if (index == 0) {
			Node temp=get(0);
			deleteFirst();
			return temp.val;
		}
		if (index == size-1) {
			Node temp=get(size-1);
			deleteLast();
			return temp.val;
		}
		
		Node bef = get(index-1);
		Node aft = get(index+1);
		Node node = get(index);
		
		bef.next = aft;
		aft.prev = bef;
		size --;
		
		return node.val;
	}



}		
