package linkedlist;

public class CLL {

	Node head;
	Node tail;
	int size=0;

	class Node{
		Node next;
		int val;

		public Node(int val) {
			this.val = val;
		}
	}

	void insert(int val) {
		Node node = new Node(val);

		if (head == null) {
			head = node;
			tail = node;
			size++;
			return;
		}
		else {
			tail.next = node;
			node.next = head;
			tail = node;

		}		
		size++;
	}


	void display() {
		Node temp = head;
		do {
			System.out.print(temp.val+"->");
			temp = temp.next;
		} while (temp != head);
		System.out.print("HEAD\n");
	}


	int getSize() {
		return size;
	}


	int getValue(int index) {
		Node temp= head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp.val;
	}


	Node getNode(int index) {
		Node temp= head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}


	int getIndex(int val) {
		Node temp=head;

		for (int i = 0; i < size; i++) {
			if (temp.val == val) {
				return i;
			}
			temp = temp.next;
		}
		return -1;
	}


	public void insertAtIndex(int index, int value) {
		if (index == 0 || index == size-1) {
			insert(value);
			return;
		}
		
		Node node = new Node(value);
		Node prev = getNode(index-1);
		node.next = prev.next;
		prev.next = node;
		size++;
		
	}

}
