package practice_Array;

import java.util.Scanner;

public class _04_Binary {

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
		int st=0;;
		int lt=size-1;
		boolean flag=false;
		while(st<=lt)
		{
			int mid=(st+lt)/2;
			if(a[mid]==ele)
			{
				System.out.println("ele found");
				flag=true;
				break;
			}
			else if(ele>a[mid])
			{
				st=mid+1;
			}
			else if(ele<a[mid])
			{
				lt=mid-1;
			}
		}
		if(flag==false)
		{
			System.out.println("element not found");
		}

	}

}
