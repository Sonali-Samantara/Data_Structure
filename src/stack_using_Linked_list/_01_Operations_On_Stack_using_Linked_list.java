package stack_using_Linked_list;

import java.util.Scanner;

public class _01_Operations_On_Stack_using_Linked_list {

	static Node top,temp;
	static Node n; //creating n which is node type
	
	public static void create()
	{
		n=new Node();//creating node 
		System.out.println("node in the stack created");	
		
	}
	
	public static void push(int ele)
	{
		n.data=ele;//storing user entered element in data
		if(top==null)
		{
			top=n;
		}
		else
		{
			n.addNextNode=n;
			top=n;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println("````````````````````````````````");
			System.out.println("1.creation\n2.insertion\n3.display\n4.deletion\n5.view top most data\n6.isEmpty\n7.Exit");
			System.out.println("`````````````````````````````````");
			System.out.println("enter your chioce");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:create();
			break;
			case 2:if(n==null)
			{
				System.out.println("create the stack using linked list");
			}
			else
			{
				boolean flag1=true;
				while(flag1)
				{
					System.out.println("enter data to insert");
					int data=s.nextInt();
					push(data);
					System.out.println("do you want to create another node:\n1.yes\n2.no");
					int ch=s.nextInt();
					if(ch==1)
					{
						create();
						flag1=true;
					}
					else
					{
						flag1=false;
					}
				}
			}
			break;
			case 3:Node temp;
			       temp=top;
			       System.out.println("elements present in the stack are");
			       while(temp!=null)
			       {
			    	   System.out.println(temp.data);
			    	   temp=temp.addNextNode;
			       }

			}
		}
	}
}
