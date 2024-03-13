package queue_using_LinkedList;

import java.util.Scanner;

public class _01_Queue_in_LinkedList {

	static Node front=null,rear=null;
	static Node n;
	static Scanner s=new Scanner(System.in);
	public static void enqueue()
	{
		if(front==null && rear==null)
		{
			rear=front=n;
		}
		else
		{
			rear.addofNextNode=n;
			rear=n;
			System.out.println("data inserted into the successfully"); 
		}
	}

	public static void dequeue()
	{
		if(front==null && rear==null)
		{
			System.out.println("queue is empty");
		}
		else if(front==rear)
		{
			System.out.println("deleted data is "+front.data);
			front=rear=null;
		}
		else
		{
			System.out.println("deleted data is: "+front.data);
			front=front.addofNextNode;
		}
	}
	
	public static void display()
	{
		Node temp;
		temp=front;
		System.out.println("data in th queue using linked list are: ");
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.addofNextNode;
		}
	}
	
	public static void peek()
	{
		System.out.println(front.data);
		
	}
	
	public static void isEmpty()
	{
		if(front==null && rear==null)
		{
			System.out.println("queue using linked list is empty");
		}
		else
		{
			System.out.println("queue is not empty.you can perform operations");
		}
		
	}
	public static void main(String[] args) {
	
		boolean flag=true;
		while(flag)
		{
			System.out.println("``````````````````````````````````````````````````");
			System.out.println("\n1.creation and insertion\n2.display\n3.deletion\n4.top most data\n5.isEmpty\n6.exit");	
			System.out.println("enter your choice");
			int choice=s.nextInt();
			System.out.println("``````````````````````````````");
			switch(choice)
			{
			case 1:boolean repeat=true;
			while(repeat)
			{
				n=new Node();
				System.out.println("node created and data inserted successfully");
				System.out.println("`````````````````````````````````````");
				System.out.println("enter the data to insert into node");
				n.data=s.nextInt();
				enqueue();
				System.out.println("do you want to create another node\n1.yes\n2.no");
				int ch=s.nextInt();
				if(ch==1)
				{
					repeat=true;
				}
				else
				{
					repeat=false;
				}
			}
			break;
			case 2:	if(n==null)
			{
				System.out.println("create the node first");
			}
			else if(front==null && rear==null)
			{
				System.out.println("queue is empty");
			}
			else
			{
				display();
			}
			break;
			case 3:if(n==null)
			{
				System.out.println("create the node first");
			}
			else 
			{
				boolean rept=true;
				while(rept)
				{
					dequeue();
					System.out.println("do you want to delete another node\n1.yes\n2.no");
					int ch=s.nextInt();
					if(ch==1)
					{
						rept=true;
					}
					else
						break;
				}
			}
			break;
			case 4:if(n==null)
			{
				System.out.println("create the node first");
			}
			else if(front==null && rear==null)
			{
				System.out.println("queue is empty");
			}
			else
			{
				peek();
			}
			break;
			case 5: if(n==null)
			{
				System.out.println("create the node first");
			}
			else
			{
				isEmpty();
			}
			break;
			case 6: System.out.println("THANK YOU!!!!!!!!!!");
			flag=false;
			break;
			default:System.out.println("invalid chioce");

			}
		}



	}

}
