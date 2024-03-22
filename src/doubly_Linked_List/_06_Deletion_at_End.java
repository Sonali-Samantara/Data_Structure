package doubly_Linked_List;

import java.util.Scanner;

public class _06_Deletion_at_End {
	static Node head, temp,prevnode; 
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
		temp=head; 
		while(temp.adnextnode!=null) 
		{ 	
			prevnode=temp; 
			temp=temp.adnextnode; 
		} 
		prevnode.adnextnode=null; 
		temp.adnextnode=null; 
		temp.adprevnode=null; 
		System.out.println("```````````````````````````````````````````"); 
		System.out.println("after deletion at last elements present in the list are:"); 
		temp = head; 
		while (temp != null) { 
			System.out.println(temp.data); 
			count++; 
			temp = temp.adnextnode; 
		} 
	} 

}
	//Task: 
	//Perform sorting in doubly linked list 



