package stack;

import java.util.Scanner;

public class _06_Stack_IsFull {

	static int top=-1;
	static int size;
	static int stack[];
	
	public static boolean isFull()
	{
		if(top==size-1)
		{
	         return true;
		}
		else
		{
			return false;
		}
	}
	public static void push(int data)
	{
		if(isFull())
		{
			System.out.println("stack is full");
		}
		else
		{
			top++;
			stack[top]=data;
		}
	}
//	public static void push(int data)
//	{
//		if(top==size-1)
//		{
//			System.out.println("stack is full");
//		}
//		else
//		{
//			top++;
//			stack[top]=data;
//		}
//	}
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter size of stack");
		size=s.nextInt();
		stack=new int[size];
		boolean flag=true;
		while(flag)
		{
			System.out.println("enter data to insert into stack");
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
	}
}


