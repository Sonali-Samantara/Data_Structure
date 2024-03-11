package queue_using_Array;

import java.util.Scanner;

public class _01_Queue_Creation_Insertion_using_Array {

	static int front=-1,rear=-1;
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int size=s.nextInt();
		int queue[]=new int[size];//creation of array
		boolean flag=true;
		while(flag)
		{
			System.out.println("enter the data to insert into the queue using array");
			int data=s.nextInt();
			if(rear==size-1)
			{
				System.out.println("queue is full");
			}
			else if(front==-1 && rear==-1)
			{
				front=rear=0;
				queue[rear]=data;
				System.out.println("data inserted at index "+rear+ "successfully");
			}
			else
			{
				rear++;
				queue[rear]=data;
				System.out.println("data inserted at index "+rear+ "successfully");
			}
			System.out.println("do you want to enter another data in queue\n1.yes\n2.no");
			int choice=s.nextInt();
			if(choice==1)
			{
				flag=true;
			}
			else
			{
				break;
			}
		}
















	}
}
