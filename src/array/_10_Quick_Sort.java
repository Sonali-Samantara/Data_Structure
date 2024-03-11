package array;

import java.util.Scanner;

public class _10_Quick_Sort {
	//rule1 
	//rule2 
	public static int partition(int a[],int li,int hi) 
	{ 
		int start,end,pivot,temp; 
		start=li; 
		end=hi; 
		pivot=a[li]; 		  
		while(start<end) 
		{ 
			while(a[start]<=pivot && start<a.length-1) 
			{ 
				start++; 
			} 
			while(a[end]>pivot && end>=0) 
			{ 
				end--; 
			} 
			if(start<end) 
			{ 
				temp=a[start]; 
				a[start]=a[end]; 
				a[end]=temp;	  
			} 
		} 
		temp=a[end]; 
		a[end]=a[li]; 
		a[li]=temp;
		return end; 
	} 
	public static void quicksort(int a[],int li,int hi) 
	{ 
		if(li<hi) 
		{ 
			int end=partition(a,li,hi); 
			quicksort(a,li,end-1); 
			quicksort(a,end+1,hi); 
		} 
	} 
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
		quicksort(a,0,size-1); 
		System.out.println("array elements after sorting are: "); 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
		for(int i=0;i<=size-1;i++) 
		{ 
			System.out.println(a[i]); 			  
		} 
	}  
}

