package linked_list;

import java.util.Scanner;

public class _05_insertion_at_End {

	static Node head,temp;
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
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
			}
			temp.addofnextNode=n;
			temp=n;
			System.out.println("do you want to create another node:\n1.Yes\n2.No");
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
		//to print data
		System.out.println("data present in the list are");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.addofnextNode;
		}
		System.out.println("==============================");
		//inserting node at the last
		Node n=new Node();
		System.out.println("enter data to insert at the end");
		n.data=s.nextInt();
		temp=head;
		while(temp.addofnextNode!=null)
		{
			temp=temp.addofnextNode;
		}
		temp.addofnextNode=n;
		System.out.println("================================");
		//printing data present in nodes after insertion
		System.out.println("after inserting data in the list are");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.addofnextNode;
		}

	}
}
