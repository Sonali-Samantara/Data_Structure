package array;

import java.util.Scanner;

public class _04_Creation_Insertion_Using_Switch {
	static int a[];

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();

		System.out.println(a);		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		while (true) {

			System.out.println("1.creation and Insertion\n2.display\n3.Insertion at beg\n4.Insertion at position\n5.Insertion at end\n6.exit\n");
			System.out.println("enter your choice"); 
			int choice=s.nextInt();
			switch (choice) 
			{
			case 1:
			{
				System.out.println("enter the size");
				size=s.nextInt();
				a=new int[size+10];
				System.out.println("enter array elements");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("enter the elements to insert in the array");
				for(int i=0;i<=size-1;i++)
				{
					a[i]=s.nextInt();
				}
			}
			break;
			case 2:
			{

			}
			}
		}

	}
}
