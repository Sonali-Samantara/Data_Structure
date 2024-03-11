package stack;

import java.util.Scanner;

public class _03_Creation_Insertion_Deletion_Display_using_Array {

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
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		size=s.nextInt();
		stack=new int[size];
		boolean flag=true;
		while(flag)
		{
			System.out.println("````````````````````````````````");
			System.err.println("enter the data to insert into the stack");
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
		System.out.println("```````````````````````````````");
		System.out.println("elements present in the stack are");
		for(int i=top;i>=0;i--)
		{
			System.out.println(stack[i]);
		}
	}

}
