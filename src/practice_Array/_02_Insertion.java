package practice_Array;

import java.util.Scanner;

public class _02_Insertion {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int a[]=new int[size+1];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("enter position to insert the element");
		int pos=s.nextInt();
		if(pos>=0 && pos<=size+1)
		{
			System.out.println("enter the ele to insert");
			int ele=s.nextInt();
			for(int i=size-1;i>=pos-1;i--)
			{
				a[i+1]=a[i];
			}
			a[pos-1]=ele;
			size++;
			System.out.println("array elements are");
			for(int i=0;i<size;i++)
			{
				System.out.println(a[i]);
			}
		}
		else
		{
			System.out.println("invalid position");
		}
	}

}
