package practice_Array;

import java.util.Scanner;

public class _03_Linear {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int a[]=new int[size];
		
		System.out.println("enter array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("array elements are");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("enter ele to search");
		int ele=s.nextInt();
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			if(a[i]==ele)
			{
				System.out.println("element found at "+i+ " postion");
				flag=true;
			}
			
		}
		if(flag==false)
		{
			System.out.println("element not found");
		}

	}

}
