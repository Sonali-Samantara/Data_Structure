package array;

import java.util.Scanner;

public class _11_Deletion_at_Position {

	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
		System.out.println("enter size"); 
		int size = s.nextInt(); 
		int a[] = new int[size]; 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
		System.out.println("enter the elements to insert in an array"); 
		for(int i=0;i<=size-1;i++) 
		{ 
			a[i]=s.nextInt();
		} 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
		System.out.println("entered array elements are: "); 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
		for(int i=0;i<=size-1;i++) 
		{ 
			System.out.println(a[i]); 
		} 
		System.out.println("enter the position to delete the data"); 
		int pos=s.nextInt(); 
		if(pos>0 && pos<=size) 
		{ 
			for(int i=pos-1;i<size-1;i++) 
			{ 
				a[i]=a[i+1]; 
			} 
			size--; 
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
			System.out.println("array elements after deletion is: "); 
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
			for(int i=0;i<=size-1;i++) 
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

