package doubly_Linked_List;

import java.util.Scanner; 

	public class _03_InsertionAtEndInDoublyLinkedList { 

	 static Node head, temp; 

	 public static void main(String[] args) { 

	 Scanner s = new Scanner(System.in); 

	 boolean flag = true; 

	 while (flag) { 

	 Node n = new Node(); 

	 System.out.println("enter the data"); 

	 n.data = s.nextInt(); 

	 if (head == null) { 

	 temp = head = n; 

	 } else { 

	 temp.adnextnode = n; 

	 n.adprevnode = temp; 

	 temp = n; 

	 } 

	 System.out.println("do you want to create another node:\n1.yes\n2.no"); 

	 int choice = s.nextInt(); 

	 if (choice == 1) { 

	 flag = true; 

	 } else { 

	 flag = false; 

	 } 

	 } 

	 System.out.println("elements present in the list are:"); 

	 System.out.println("``````````````````````````````````"); 

	 temp = head; 

	 while (temp != null) { 

	 System.out.println(temp.data); 

	 temp = temp.adnextnode; 

	 } 

	 System.out.println("````````````````````````````````````"); 

	 Node n = new Node(); 

	 System.out.println("enter the data to insert at ending"); 

	 n.data = s.nextInt(); 

	 temp = head; 

	 while (temp.adnextnode != null) { 

	 temp = temp.adnextnode; 

	 } 

	 temp.adnextnode = n; 

	 n.adprevnode = temp; 

	 System.out.println("after inserting the node at end elements present in the list are:"); 

	 System.out.println("``````````````````````````````````"); 

	 temp=head; 

	 while(temp!=null) 

	 { 

	 System.out.println(temp.data); 

	 temp=temp.adnextnode; 

	 }
	 }
}
