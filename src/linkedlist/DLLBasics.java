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
		System.out.println(list.getSize());
//		list.displayRev();
		
//		list.deleteFirst();
//		list.deleteFirst();
//		list.deleteFirst();
//		list.display();
//		
//		list.deleteLast();
//		list.deleteLast();
//		list.deleteLast();		
//		list.display();

//		int a = list.getValue(5);
//		System.out.println(a);
//		
//		System.out.println(list.getIndex(9));
		
//		list.insertAtIndex(5 ,14);
//		list.insertAtIndex(0 ,1);
//		list.insertAtIndex(3 ,45);
//		list.display();
//		
//		System.out.println(list.removeFromIndex(8));
//		list.display();
	}
}
