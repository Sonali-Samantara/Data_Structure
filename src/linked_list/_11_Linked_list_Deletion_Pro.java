package linked_list;

import java.util.Scanner;

public class _11_Linked_list_Deletion_Pro {
	static Node head,temp; 
	//creation 
	public static void creationAndInsertion() {

		Scanner s = new Scanner(System.in); 
		boolean flag = true; 
		while (flag) { 
			Node n = new Node(); 
			System.out.println("Enter the data"); 
			n.data = s.nextInt(); 
			if(head == null)
			{
				head = n; 
				temp = n; 
				System.out.println(temp.addofnextNode); 
			} 
			else { 
				// System.out.println(temp.adnextnode); 
				temp.addofnextNode = n; 
				System.out.println(temp.addofnextNode); 
				temp = n; 
			} 
			System.out.println("one node created successfully"); 
			System.out.println("Do you want to create another node:\n1.Yes\n2.No"); 
			int choice = s.nextInt(); 
			if (choice == 1) { 
				flag = true; 
			} else {
				break; 
			} 
		} 
	} 
	//display 
	public static void display() { 
		Node temp1; 
		if(head==null) 
		{ 
			System.out.println("create the node first"); 
		} 
		else 
		{ 
			temp1 = head; 
			System.out.println("elements present in the list are:"); 
			while (temp1 != null) { 
				System.out.println(temp1.data); 
				temp1 = temp1.addofnextNode; 
			} 
		} 
	} 
	//count num of nodes 
	public static int countNumNodes() 
	{ 
		int count=0; 
		if(head==null) 
		{ 
			System.out.println("create the node first"); 
		} 
		else 
		{ 
			Node temp; 
			temp=head; 
			while(temp!=null) 
			{
				count++; 
				temp=temp.addofnextNode; 
			} 
			System.out.println("Number of nodes in the list are: "+count); 
		} 
		return count; 
	} 
	//insertion at beg 
	public static void insertionAtBeg() 
	{ 
		Node n = new Node(); 
		System.out.println("enter the data to insert at beg"); 
		n.data=s.nextInt(); 
		n.addofnextNode
		head=n; 
		System.out.println("Node inserted at beg successfully"); 
	} 

	//insertion at end 

	public static void insertionAtEnd() 

	{ 

		Node temp; 

		temp=head; 

		while(temp.addofnextNode!=null) 

		{ 

			temp=temp.addofnextNode; 

		} 

		Node n = new Node(); 

		System.out.println("enter the data to insert at last"); 

		n.data=s.nextInt(); 

		temp.addofnextNode=n; 

		System.out.println("Node inserted at end successfully"); 



	} 

	//insertion at position 

	public static void insertionAtPos() 

	{ 

		if(head==null) 

		{ 

			System.out.println("create the node first"); 

		} 

		else 

		{ 

			int pos=0; 

			System.out.println("Enter position"); 

			pos = s.nextInt(); 

			int count = countNumNodes(); 

			if(pos>=1 && pos<=count+1) 

			{ 

				if(pos==1) 

				{ 

					insertionAtBeg(); 

				} 

				else if(pos==count+1) 

				{ 

					insertionAtEnd(); 

				} 

				else 

				{ 

					int i=1; 

					Node n = new Node(); 

					System.out.println("Enter the daat to be inserted at pos"); 

					n.data=s.nextInt(); 

					Node temp; 

					temp=head; 

					while(i<pos-1) 

					{ 

						temp=temp.addofnextNode; 

						i++; 

					} 

					n.addofnextNode=temp.addofnextNode; 

					temp.addofnextNode=n; 

					System.out.println("data inserted at pos successfully"); 



				} 

			} 

			else 

			{ 

				System.out.println("invalid position"); 

			} 

		} 

	} 



	public static void deletionAtBeg() 

	{ 

		Node temp; 

		temp=head; 

		head=head.addofnextNode; 

		temp.addofnextNode=null; 

		System.out.println("node deleted at beg successfully"); 

	} 

	public static void deletionAtEnd() 

	{ 

		Node temp,prevnode=null; 

		temp=head; 

		while(temp.addofnextNode!=null) 

		{ 

			prevnode=temp; 

			temp=temp.addofnextNode;
		} 

		prevnode.addofnextNode=null; 

		System.out.println("node deleted at end successfully"); 

	} 



	public static void deletionAtPos() 

	{ 

		if(head==null) 

		{ 

			System.out.println("create the node first"); 

		} 

		else 

		{ 

			System.out.println("enter position to delete the data"); 

			int pos=s.nextInt(); 

			System.out.println("````````````````````````````````````"); 

			int count=countNumNodes(); 

			if(pos>0 && pos<=count) 

			{ 

				if(pos==1) 

				{ 

					deletionAtBeg(); 

				} 

				else if(pos==count) 

				{ 

					deletionAtEnd(); 

				} 

				else 

				{ 

					Node temp,prevnode=null; 

					temp=head; 

					int i=1; 

					while(i<pos) 

					{ 

						prevnode=temp; 

						temp=temp.addofnextNode; 

						i++; 

					} 

					prevnode.addofnextNode=temp.addofnextNode; 

					temp.adnextnode=null; 

					System.out.println("node deleted at position successfully"); 

				} 

			} 

			else 

			{ 

				System.out.println("invalid position"); 

			} 

		} 

	}
	public static void main(String[] args) { 
		boolean flag=true; 
		while(true)
		{ 
			System.out.println("```````````````````````````````````````````"); 
			System.out.println("1.creation and insertion\n2.display\n3.countNumNodes\n4.insertionAtPos\n5.DeletionAtPos\n6.exit"); 
			System.out.println("```````````````````````````````````````````"); 
			System.out.println("enter your choice:"); 
			System.out.println("```````````````````````````````````````````"); 
			int ch = s.nextInt(); 
			switch (ch) { 
			case 1: 
				creationAndInsertion(); 
				break; 
			case 2:
				display(); 
				break;
			case 3:countNumNodes(); 
			break; 
			case 4:insertionAtPos(); 
			break; 
			case 5:deletionAtPos(); 
			break; 
			case 6:flag=false; 
			break; 
			} 
		} 
	} 
} 
S