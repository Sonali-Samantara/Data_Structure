package queue_using_Array;

import java.util.Scanner;

public class _04_Queue_Operations {

	static int front=-1,rear=-1;
	static int size;
	static int queue[];


	public static void enqueue(int ele)
	{
		if(rear==size-1)
		{
			System.out.println("queue is full");	
		}
		else if(front==-1 && rear==-1)
		{
			front=rear=0;
			queue[rear]=ele;
		}
		else
		{
			rear++;
			queue[rear]=ele;
			System.out.println("data inserted successfully");
		}
	}

	public static void display()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("queue using array is empty");
		}
		else
		{
			for(int i=front;i<=rear;i++)
			{
				System.out.println(queue[i]);
			}
		}
	}

	public static void dequeue()
	{
		if(front==-1 && rear==-1) 
		{
			System.out.println("queue using array is empty");
		}
		else if(front == rear)
		{
			System.out.println("deleted element is: "+queue[front]);
			front=rear=-1;
		}
		else
		{
			System.out.println("deleted element is: "+queue[front]);
			front++;
		}
	}
	public static void peek()
	{
		if(front==-1 && rear==-1) 
		{
			System.out.println("queue is empty insert the data first");
		}
		else
		{
			System.out.println(queue[front]);
		}
	}

	public static void isEmpty()
	{
		if(front==-1 && rear==-1)
		{
			System.out.println("queue using array is empty");
		}
		else
		{
			System.out.println("queue is not empty we can perform operations"); 
		}
	}

	public static void isFull()
	{
		if(rear==size-1)
		{
			System.out.println("queue using array is full");

		}
		else
		{
			System.out.println("queue is not full we can perform operations");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean flag=true;
		while(flag)
		{
			System.out.println("````````````````````````````````"); 
			System.out.println("1.Creation_And_Insertion\n2.Display\n3.Deletion\n4.top most element\n5.isEmpty\n6.is Full\n7.exit");
			System.out.println("``````````````````````````````````"); 
			System.out.println("enter your choice"); 
			System.out.println("````````````````````````````````````"); 
			int choice=s.nextInt(); 
			switch(choice) 
			{
			case 1:if(queue==null)
			{
				System.out.println("enter the size");
				size=s.nextInt();
				queue=new int[size];
			}
			else
			{
				boolean repeat=true;
				while(repeat)
				{
					System.out.println("enter the data to insert into queue");
					int data=s.nextInt();
					enqueue(data);
					System.out.println("do you want to insert more data\n1.yes\n2.no");
					int ch=s.nextInt();
					if(ch==1)
					{
						repeat=true;
					}
					else
					{
						repeat=false;
					}
				}
			}
			break; 
			case 2:if(queue==null)
			{
				System.out.println("create queue of array first");
			}
			else
			{
				display();
			}
			break;
			case 3:if(queue==null)
			{
				System.out.println("create queue of array first");
			}
			else
			{
				boolean repeat2=true;
				while(repeat2)
				{
					dequeue();
					System.out.println("do you want to delete another data\n1.yes\n2.no");
					int ch=s.nextInt();
					if(ch==1)
					{
						repeat2=true;
					}
					else
					{
						repeat2=false;
					}
				}
			}
				break;
			case 4: if(queue==null)
			{
				System.out.println("create queue of array first");
			}
			else
			{
				peek();
			}
			break;
			case 5:if(queue==null)
			{
				System.out.println("create queue of array first");
			}
			else
			{
				isEmpty();
			}
			break;
			case 6:if(queue==null)
			{
				System.out.println("create queue of array first");
			}
			else
			{
				isFull();
			}
			break;
			case 7: System.out.println("THANK YOU!!!!!!!!!!!!!");
			flag=false;
			break;
			
			default: System.out.println("please enter valid choioce");
			}
		}
	}
}
