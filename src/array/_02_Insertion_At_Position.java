package array;

import java.util.Scanner;

public class _02_Insertion_At_Position {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter size: ");
		//step-2
		int size=s.nextInt();
		//step-3
		int a[]=new int[size+1];
		//step-4:-
		System.out.println("enter the elements to insert in an array");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}

		//step-5
		System.out.println("enter position to insert in an array");
		int pos=s.nextInt();

		//step-6->>chk the condition if position is >0 and <size+1
		if(pos>=0 && pos<=size+1)
		{
			System.out.println("enter the element to insert in the array");
			int ele=s.nextInt();
			System.out.println("elements after inserting the data is: ");
			System.out.println("");
			for(int i=size-1;i>=pos-1;i--)
			{
				a[i+1]=a[i];
			}
			a[pos-1]=ele;
			size++;
			
			for(int i=0;i<size;i++)
			{
				System.out.println(a[i]);
			}
		}
		else
		{
			System.out.println("Invalid position");
		}

	}
}
