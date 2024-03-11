package linked_list;

import java.util.Scanner;

public class _12_Linear_Search {

	static Node head,temp;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			Node n=new Node();
			System.out.println("enter  data");
			n.data=s.nextInt();
			if(head==null)
			{
				temp=head=n;
			}
			else
			{
				temp.addofnextNode=n;
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
				flag=false; //or break;
			}
		}
		System.out.println("''''''''''''''''''''''''''''''''''''''");
		System.out.println("elements present in the list are:");
		System.out.println("''''''''''''''''''''''''''''''''''''''");
		temp=head;
		while(temp!=null)
		{

			System.out.println(temp.data);
			temp=temp.addofnextNode;
		}
		System.out.println("'''''''''''''''''''''''");
		System.out.println("enter the element to search");
		int ele=s.nextInt();
		boolean ele_found=false;
		
	}
}

