package stack;

import java.util.Scanner;

public class _04_Stack_Creation_Insertion_and_Peek_using_Arry {

	static int top=-1;
	static int size;
	static int stack[];

	public static void push(int data)
	{
		if(top==size-1)
		{
			System.out.println("stack is full");
		}
		else
		{
			top++;
			stack[top]=data;
			System.out.println(data+"is inserted successfully into the stack");
		}
	}
	public static int peek()
	{
		return stack[top];
	}
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the size ");
		size=s.nextInt();
		stack=new int[size]; //creation of array (it's local)
		boolean flag=true;
		while(flag)
		{
			//int Stack[]=new int[size];
			System.out.println("enter the data to insert into tha stack");
			int data=s.nextInt();
			push(data);
			System.out.println("do you want to insert another data\n1.yes\n2.no");
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
		System.out.println("top most element in the top is: "+peek());

	}
}