package array;

import java.util.Scanner;

public class _03_Creation_Insertion {

	public static void main(String[] args) {

		Scanner s=new  Scanner(System.in);
		System.out.println("enter size:");
		int size=s.nextInt();

		//to create object of array
		int a[]=new int[size+1];
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("enter the elements to insert in an array:");

		//to read the elements
		for(int i=0;i<=size-1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("entered array elements are:");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		for(int i=0;i<=size-1;i++)
		{
			System.out.println(a[i]);
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Do you want to insert the data at position: \n1.yes\n 2.no");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		int choice=s.nextInt();
		if(choice==1)
		{
			System.out.println("enter the position");
			int pos=s.nextInt();
			if(pos>0 && pos<=size+1)
			{
				if(pos==1)
				{
					System.out.println("enter the element to insert the data at the begining");
					int ele=s.nextInt();
					a[size]=a[0];
					a[0]=ele;
					size++;
					System.out.println("after entering the data the array elements are:");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

					for(int i=0;i<=size+1;i++)
					{
						System.out.println(a[i]);
					}
				}
				else if(pos==size+1)
				{
					System.out.println("enter the element to insert at the last");
					int ele=s.nextInt();
					a[size]=ele;
					size++;
					System.out.println("after entering the data the array elements are:");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

					for(int i=0;i<=size+1;i++)
					{
						System.out.println(a[i]);
					}
				}
				else
				{
					System.out.println("enter the element to insert at last");
					int ele=s.nextInt();
					a[size]=ele;
					for(int i=size-1;i>=pos-1;i--)
					{
						a[i+1]=a[i];
					}
					a[pos-1]=ele;
					size++;
					System.out.println("after entering the data the array elements are:");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					for(int i=0;i<=size-1;i++)
					{
						System.out.println(a[i]);
					}
				}

			}
//			else
//			{
//				System.out.println("Invalid Position");
//			}
		}
		else
		{
			System.out.println("Array created and data inserted successfully");
		}
	}

}
