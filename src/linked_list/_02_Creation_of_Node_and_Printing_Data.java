package linked_list;

import java.util.Scanner;


public class _02_Creation_of_Node_and_Printing_Data {

	static Node head,temp;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			Node n=new Node();
			System.out.println("enter data");
			n.data=s.nextInt();
			if(head==null)
			{
				head=n;
				temp=n;
				System.out.println(temp.addofnextNode);//print address of head
			}
			else
			{
				//System.out.println(temp.addofnextNode);
				temp.addofnextNode=n;
				System.out.println(temp.addofnextNode);
				temp=n;
			}
			System.out.println("one node created successfully");
			System.out.println("do you want to create another node\n1.yes\n2.No");
			int choice=s.nextInt();
			if(choice==1)
			{
				flag=true;
			}
			else
			{
				break;
			}
			temp=head;
			System.out.println("elements present in the list are: ");
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.addofnextNode;
			}

			//		Scanner s = new Scanner(System.in); 
			//		boolean flag=true; 
			//		while(flag) 
			//		{ 
			//			Node n = new Node(); 
			//			System.out.println("Enter the data"); 
			//			n.data=s.nextInt(); 
			//			if(head==null) 
			//			{ 
			//				head=n; 
			//				temp=n; 
			//				System.out.println(temp.addofnextNode); 
			//			} 
			//			else 
			//			{ 
			//				//System.out.println(temp.adnextnode); 
			//				temp.addofnextNode=n; 
			//				System.out.println(temp.addofnextNode); 
			//				temp=n; 
			//			} 
			//			System.out.println("one node created successfully"); 
			//			System.out.println("Do you want to create another node:\n1.Yes\n2.No"); 
			//			int choice=s.nextInt(); 
			//			if(choice==1)
			//			{ 
			//				flag=true; 
			//			} 
			//			else
			//			{ 
			//				break; 
			//			} 
			//		} 
			//		temp=head; 
			//		System.out.println("elements present in the list are:"); 
			//		while(temp!=null) 
			//		{ 
			//			System.out.println(temp.data); 
			//			temp=temp.addofnextNode; 
		}
	}
}
