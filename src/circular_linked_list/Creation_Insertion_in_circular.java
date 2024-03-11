package circular_linked_list;

import java.util.Scanner;

public class Creation_Insertion_in_circular {

	static Node head,tail,temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			Node n=new Node();
			System.out.println("enter the data");
			n.data=s.nextInt();
			if(head==null)
			{
				head=n;
				tail=n;
				n.addofnextNode=head;
			}
			else
			{
				tail.addofnextNode=n;
				n.addofnextNode=head;
				tail=n;
			}
			System.out.println("do you want to create another node\n1.yes\n2.no");
			int choice=s.nextInt();
			if (choice==1)
			{
				flag=true;
			}
			else
			{
				break;
			}
		}
		System.out.println("elements in the list are: ");
		temp=head;
		do
		{
			System.out.println(temp.data);
			temp=temp.addofnextNode;
		}
		while(temp!=head);
	}

}
