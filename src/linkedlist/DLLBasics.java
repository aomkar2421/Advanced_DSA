package linkedlist;

public class DLLBasics {
	public static void main(String[] args) {
		DLL list = new DLL();
		
		System.out.println("Add First & Last");
		list.addFirst(9);
		list.addFirst(19);
		list.addFirst(37);
		list.addFirst(23);
		list.addLast(67);
		list.addLast(7);
		list.display();
//		list.displayRev();
		
		System.out.println(list.getSize());
		list.deleteFirst();
		list.deleteFirst();
		list.deleteFirst();
		list.deleteFirst();
		list.deleteFirst();
		list.display();

	}
}
