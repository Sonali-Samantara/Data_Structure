package linked_list_sorting;

import java.util.Scanner;

public class _13_Sorting_using_Bubble_Sort {

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
				temp=head=n;
			}
			else
			{
				temp.addnextNode=n;
				temp=n;
			}
			System.out.println("do you want to create another node\n1.yes\n2.no");
			int choice=s.nextInt();
			if(choice==1)
			{
				flag=true;
			}
			else
			{
				break;
			}
		}
		System.out.println("elements present the list are:");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.addnextNode;
		}
		System.out.println("'''''''''''''''''''''''''''");
		temp=head;
		Node nextnode=null;
		int temp1;
		while(temp!=null)
		{
			nextnode=temp.addnextNode;
			while(nextnode!=null)
			{
				if(temp.data>nextnode.data)
				{
					temp1=temp.data;
					temp.data=nextnode.data;
					nextnode.data=temp1;
				}
				nextnode=nextnode.addnextNode;
			}
			temp=temp.addnextNode;
		}
		System.out.println("'''''''''''''''''''''''''''''''");
		System.out.println("data after sorting in the list are");
		System.out.println("''''''''''''''''''''''''''''");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.addnextNode;
		}
	}
}

