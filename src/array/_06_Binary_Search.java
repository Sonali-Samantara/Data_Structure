package array;

import java.util.Scanner;

public class _06_Binary_Search {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int a[]=new int[size];
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("enter array elements");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("array elements are");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("enter the element to search");
		int ele=s.nextInt();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		int start_index=0;
		int end_index=size-1;
		int mid;
		boolean found=false;
		while(start_index<=end_index)
		{
			mid=(start_index+end_index)/2;
			
			//case=1
			if(ele==a[mid])
			{
				System.out.println("element found");
				found=true;
				break;
			}			
			//case=2
			else if(ele>a[mid])
			{
				start_index=mid+1;
			}
			//case=3
			else if(ele<a[mid])
			{
				end_index=mid-1;
			}
		}
		if(found==false)
		{
			System.out.println("element not found");
		}
		
		
	}
}
