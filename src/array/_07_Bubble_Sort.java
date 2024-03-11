package array;

import java.util.Scanner;

public class _07_Bubble_Sort {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("enter elements of array");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("elements of array are");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		int temp;
		//Iteration
		for(int i=0;i<size-1;i++)
		{
			boolean flag=false;
			//Comparison
			for(int j=0;j<size-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
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
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("array elements after sorting are: "); 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
		for(int i=0;i<=size-1;i++) 
		{ 
			System.out.println(a[i]);
		} 
	}

}
