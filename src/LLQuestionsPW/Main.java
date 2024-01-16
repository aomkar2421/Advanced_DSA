package LLQuestionsPW;

public class Main {
	public static void main(String[] args) {
		LL list = new LL();
		System.out.println("Add First & Last");
		list.addFirst(9);
		list.addFirst(19);
		list.addFirst(37);
		list.addFirst(23);
		list.addLast(67);
		list.addLast(7);
		list.display();
		
		System.out.println("\nInsert At Index 2");
		list.insertAtIndex(2, 88);
		list.display();
		
		System.out.println("\nDelete First");
		int a= list.deleteFirst();
		System.out.println("First Value "+a);
		list.display();
		
		System.out.println("\nSize "+list.getSize());
		
		System.out.println("Delete Last");
		int b = list.deleteLast();
		System.out.println("Last Value"+b);
		list.display();

		System.out.println("\nDelete At Index 3");
		list.display();
		int c = list.deleteAtIndex(3);
		System.out.println(c);
		list.display();
		
		
	}
}
