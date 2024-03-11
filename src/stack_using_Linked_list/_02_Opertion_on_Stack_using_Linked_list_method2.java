package stack_using_Linked_list;

import java.util.Scanner;

public class _02_Opertion_on_Stack_using_Linked_list_method2 {

	static Node top,temp;
	static Node n; //creating n which is node type

	public static void push(int ele)
	{
		n=new Node();
		n.data=ele;//storing user entered element in data
		if(top==null)
		{
			top=n;
		}
		else
		{
			n.addNextNode=top;
			top=n;
		}
	}
	public static void pop()
	{
		System.out.println("deleted data from the stack is: "+top.data);
		top=top.addNextNode;
	}

	public static void display()
	{
		Node temp;
		temp=top;
		System.out.println("elements present in the stack are");
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.addNextNode;
		}
	}

	public static void peek()
	{
		System.out.println(top.data);
	}

	public static void isEmpty()
	{
		if(top==null)
		{
			System.out.println("stack is empty");
		}
		else
		{
			System.out.println("stack is not empty..you can perform the operations");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println("````````````````````````````````");
			System.out.println("1.creation and insertion\n2.display\n3.deletion\n4.view top most data\n5.isEmpty\n6.Exit");
			System.out.println("`````````````````````````````````");
			System.out.println("enter your chioce");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:boolean repeat=true;
			while(repeat)
			{
				System.out.println("enter data to insert into the stack");
				int data=s.nextInt();
				push(data);
				System.out.println("do you want to create another node:\n1.yes\n2.no");
				int ch=s.nextInt();
				if(ch==1)
				{
					repeat=true;
				}
				else
				{
					break;
				}
			}
			break;
			case 2:if(top==null)
			{
				System.out.println("stack is empty...create the stack using linked list");
			}
			else
				display();
			break;
			//			{
			//			Node temp;
			//			temp=top;
			//			System.out.println("elements present in the stack are");
			//			while(temp!=null)
			//			{
			//				System.out.println(temp.data);
			//				temp=temp.addNextNode;
			//			}
			//			}		

			case 3:if(top==null)
			{
				System.out.println("stack is empty...create the stack using linked list");
			}
			else
				pop();
			break;
			//			{
			//				System.out.println("deleted data from the stack is: "+top.data);
			//				top=top.addNextNode;
			//			}
			case 4:if(top==null)
			{
				System.out.println("stack is empty");
			}
			else
				peek();
			break;
			case 5:isEmpty();
			break;
			case 6: System.out.println("THANK YOU");
			flag=false;
			break;

			default:System.out.println("Invalid Choice");
				break;//in default break is not mandatory
			}
		}

	}

}
