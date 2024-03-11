package stack;

import java.util.Scanner;

public class _02_Creation_Insertion_and_Deletion_using_Array {

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
		}
	}

	public static void pop()
	{
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			System.out.println("data deleetd sucessfully from yhe stack");
			System.out.println("deleted data from the stack is:" +stack[top]);
			top--;

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
			System.out.println("enter the data to insert into the stack");
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
		System.out.println("````````````````````````````````````");
		boolean flag2=true;
		while(flag2)
		{
			pop();
			System.out.println("do you want to delete another data\n1.yes\n2.no");
			int choice=s.nextInt();
			if(choice==1)
			{
				flag2=true;
			}
			else
			{
				break;
			}

	
		 } 

		 } 

		} 
		
