package stack;

import java.util.Scanner;

public class _05_Stack_isEmpty2 {

	static int top=-1;
	static int size;
	static int stack[];


	public static boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of stack");
		int size=s.nextInt();
		stack=new int[size];
		if(isEmpty())
		{
			System.out.println("stack is empty");
		}

	}

}


