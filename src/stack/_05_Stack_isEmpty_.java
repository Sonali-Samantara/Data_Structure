package stack;

import java.util.Scanner;

public class _05_Stack_isEmpty_ {

	static int top=-1;
	static int size;
	static int stack[];
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of stack");
		int size=s.nextInt();
		stack=new int[size];
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		
	}
	
	
}

//i/p=6 o/p-stack full
