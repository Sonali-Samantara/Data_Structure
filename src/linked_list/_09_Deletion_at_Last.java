package linked_list;

import java.util.Scanner;

public class _09_Deletion_at_Last {

	static Node head,temp,prvNode;
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
		System.out.println("data in the node are:");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.addofnextNode;
		}
		//to delete at the end
		System.out.println("''''''''''''''''''''''''''");
		temp=head;
		while(temp.addofnextNode!=null)
		{
			prvNode=temp; //prvNode is previous node
			temp=temp.addofnextNode;
		}
		prvNode.addofnextNode=null;
		System.out.println("after deletion at the begining the data in the node are:");
		temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.addofnextNode;
		}

	}
}
