package doubly_Linked_List;

import java.util.Scanner;

public class _04_Deletion_at_Position {
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
			System.out.println("Do you want to create another node:\n1.yes\n2.no"); 
			int choice = s.nextInt(); 
			if (choice == 1) { 
				flag = true; 
			} else { 
				break; 
			} 
		} 
		System.out.println("elements present in the list are:"); 
		temp = head; 
		int count = 0; 
		while (temp != null) { 
			System.out.println(temp.data); 
			count++; 
			temp = temp.adnextnode; 
		} 
		System.out.println("```````````````````````````````````````````"); 
		System.out.println("enter the position to delete the data"); 
		int pos = s.nextInt(); 
		if (pos > 0 && pos <= count) { 
			Node temp = null, prevnode = null, nextnode = null; 
			temp = head; 
			int i = 1; 
			while (i < pos) { 
				prevnode = temp; 
				temp = temp.adnextnode; 
				nextnode = temp.adnextnode; 
				i++; 
			} 
			prevnode.adnextnode = nextnode; 
			nextnode.adprevnode = prevnode; 
			temp.adnextnode = null; 
			temp.adprevnode = null; 
			temp = head; 
			System.out.println("after deletion elements present in the node are:"); 
			System.out.println("```````````````````````````````````````````"); 
			while (temp != null) { 
				System.out.println(temp.data); 
				temp = temp.adnextnode; 
			} 
		} else { 
			System.out.println("invalid position"); 
		} 
	} 
}
