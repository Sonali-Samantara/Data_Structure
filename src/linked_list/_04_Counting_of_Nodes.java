package linked_list;

import java.util.Scanner;

public class _04_Counting_of_Nodes {

	static Node head,temp;
	public static void main(String[] args) {		
			Scanner s=new Scanner(System.in);
			boolean flag=true;
			while(flag)
			{
				Node n=new Node();//node creation
				System.out.println("enter the data");
				n.data=s.nextInt();//in data part of node entered data will be stored
				if(head==null)
				{
					head=n;
					temp=n;
				}
				else
				{
					temp.addofnextNode=n;
					temp=n;
				}
				System.out.println("Do you want to create another node:\n1.yes\n2.No");
				int choice=s.nextInt();
				if(choice==1)
				{
					flag=true;
				}
				else
				{
					flag=false;
				}
			}
			System.out.println("data in the list before inserting node at beginning");
			temp=head;
			int count=0;
			while(temp!=null)
			{
				count++;
				System.out.println(temp.data);
				temp=temp.addofnextNode;
			}
			System.out.println("===============================");
			System.out.println("counting of node");
//			Node i;
//			int count=0;
//			i=head;
//			while(i!=null)
//			{
//				count++;
//				i=i.addofnextNode;
//			}
			System.out.println("count of node in the list are: "+count);

	}

}
