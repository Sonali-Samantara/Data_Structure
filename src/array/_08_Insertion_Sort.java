package array;

import java.util.Scanner;

public class _08_Insertion_Sort {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		System.out.println("enter size");
		int size= s.nextInt();
		int a[]=new int[size];

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("enter array elements");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("array elements are");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		int temp,j; 
		for(int i=1;i<=size-1;i++)//unsorted array 
		{ 
			temp=a[i];//storing first ele in unsorted array in temp 
			j=i-1;//sorted array 
			while(j>=0 && a[j]>temp)//comparing ele present in sorted array with ele present in temp 
			{ 
				a[j+1]=a[j];//if ele is greater than temp then shifting 
				j--; 
			} 
			a[j+1]=temp;
		} 
		System.out.println("after sorting array elements are: "); 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
		for(int i=0;i<=size-1;i++)
		{ 
			System.out.println(a[i]);  
		} 
	}
}
