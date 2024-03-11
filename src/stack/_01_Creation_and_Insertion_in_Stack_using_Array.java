package stack;

import java.util.Scanner;

public class _01_Creation_and_Insertion_in_Stack_using_Array {

	//here top, size ,stack is global..if we declare in main method it will be local to only main()
	static int top=-1;//initially top value is -1
	static int size;
	static int stack[];//declaration of array (it's global)
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
			System.out.println("data inserted into the stacksuccessfully");
		}
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
		
	}

}
