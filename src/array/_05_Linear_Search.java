package array;

import java.util.Scanner;

public class _05_Linear_Search {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("enter array elements");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");

		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("array elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("enter element to search");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
		int ele=s.nextInt();
		boolean flag=false;

		for(int i=0;i<=size-1;i++)
		{
			if(a[i]==ele)
			{
				System.out.println("element found");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("element not found");
		}
	}
}
