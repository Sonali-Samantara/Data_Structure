package practice_Array;

import java.util.Scanner;

public class _05_Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int a[]=new int[size];

		System.out.println("enter elements of array");
	
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
	
		System.out.println("elements of array are");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		boolean flag=false;
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true;
				}
				
			}
			if(flag==false)
			{
				break;
			}
		}
		System.out.println("after sorting array elements are");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}

	}

}
