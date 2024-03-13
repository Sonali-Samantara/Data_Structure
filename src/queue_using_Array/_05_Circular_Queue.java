package queue_using_Array;

import java.util.Scanner;

public class _05_Circular_Queue {

	static int front=-1,rear=-1;
	static int size;
	static int circularqueue[];
	
	public static void enqueue(int data) {

		if(front==-1 && rear==-1)
		{
			front=rear=0;
			circularqueue[rear]=data;
		}
		else if((rear+1)%size==front)
		{
			System.out.println("queue is full");		
		}
		else
		{
			rear=(rear+1)%size;
			circularqueue[rear]=data;
		}
	}

	public static void dequeue()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("queue is empty");
		}
		else if(front== rear)
		{
			System.out.println("deleted data is: "+circularqueue[front]);		
		}
		else
		{
			System.out.println("deleted data is: "+circularqueue[front]);
			front=(front+1)%size;
		}		
	}
	public static void display()
	{
		int i=front;
		if(front==-1 && rear==-1)
		{
			System.out.println("queue is empty");
		}
		else
		{
			while(i!=rear)
			{
				System.out.println(circularqueue[i]);
				i=(i+1)%size;			
			}
			System.out.println(circularqueue[i]);
		}
	}

	public static void peek()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("queue is empty");
		}
		else
		{
			System.out.println(circularqueue[front]);
		}
	}

	public static void isEmpty()
	{
		if (front == -1 && rear == -1) { 

			System.out.println("queue is empty"); 

		} else { 

			System.out.println("queue is not empty, we can perform opeartions"); 

		} 

	} 

	public static void isFull() 
	{
		if (rear == size - 1) 
		{ 
			System.out.println("queue using array is full"); 
		} 
		else 
		{ 
			System.out.println("queue is not full we can perform operations"); 
		} 
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println("````````````````````````````````"); 
			System.out.println("1.creation_Of_Queue_using_Array.\n2.insert_the data into queue of array(enque())\n3.delete data from the Queue(deque())\n4.display_topmost_data\n5.isEmpty()\n6.isFull()\n7.exit"); 
			System.out.println("``````````````````````````````````"); 
			System.out.println("enter your choice"); 
			System.out.println("````````````````````````````````````"); 
			int choice=s.nextInt(); 

			switch(choice) 
			{
			case 1: if(circularqueue==null)
			{
				System.out.println("enter the size");
				circularqueue=new int[size];
			}
			else
			{
				boolean repeat=true;
				while(repeat)
				{
					System.out.println();
					int data=s.nextInt();
					enqueue[data];
					System.out.println("");
					int ch=s.nextInt();
					if(ch==1)
					{
						repeat=true;
					}
					else
						break;		
				}

			}
			break;
			case 2:if(circularqueue==null)
			{
				System.out.println("create the queue first");

			}
			else
			{
				display();
			}
			break;
			case 3:if(circularqueue==null)
			{
				System.out.println("create the queue first");

			}
			else
			{

			}

			}

		}
	}

}
