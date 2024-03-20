package doubly_Linked_List;

import java.util.Scanner;

public class _01_Creation_Insertion {
	static Node head,temp; 
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
		boolean flag=true; 
		while(flag) 
		{ 
			Node n = new Node(); 
			System.out.println(n.adprevnode); 
			System.out.println(n.data); 
			System.out.println(n.adprevnode);
			System.out.println("enter the data"); 
			n.data=s.nextInt(); 
			if(head==null) 
			{ 
				temp=head=n; 
			} 
			else 
			{ 
				temp.adnextnode=n; 
				n.adprevnode=temp; 
				temp=n; 
			} 
			System.out.println("Do you want to create another node:\n1.yes\n2.no"); 
			int choice=s.nextInt(); 
			if(choice==1) 
			{ 
				flag=true; 
			} 
			else 
				flag=false; 
		} 
		temp=head; 
		while(temp!=null) 
		{ 
			System.out.println(temp.data); 
			temp=temp.adnextnode; 
		} 
	}

}
