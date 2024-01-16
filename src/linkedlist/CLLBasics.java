package linkedlist;

public class CLLBasics {
	public static void main(String[] args) {
		
		CLL list = new CLL();
		list.insert(13);
		list.insert(1);
		list.insert(43);
		list.insert(36);
		list.insert(56);
		list.display();
		list.insertAtIndex(2 , 23);
		list.display();
		list.insertAtIndex(0 , 3);
		list.display();
		list.insertAtIndex(list.getSize()-1 , 99);
		list.display();
		list.insertAtIndex(5 , 83);
		list.display();
		
//		System.out.println(list.getSize());
//		System.out.println(list.getValue(2));
//		System.out.println(list.getValue(0));
//		System.out.println(list.getValue(list.getSize()-1));

//		System.out.println(list.getIndex(13));
//		System.out.println(list.getIndex(56));
//		System.out.println(list.getIndex(43));
//		System.out.println(list.getIndex(3));

		
	}
}
