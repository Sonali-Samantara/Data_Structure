package array;

import java.util.Scanner;

public class _01_Creation {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of array:");
		int size=s.nextInt();
		int a[]=new int[size];
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("enter elements to the array: ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("elements of the array are:");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}
