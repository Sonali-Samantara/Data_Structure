package practice_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Creation {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter size");
		int size=s.nextInt();
		int a[]=new int[size];
		
		System.out.println("enter elements");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("array elements are");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		//System.out.println(Arrays.toString(a));
		

	}

}
