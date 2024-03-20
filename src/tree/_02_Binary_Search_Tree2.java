package tree;

import java.util.Scanner;

public class _02_Binary_Search_Tree2 {

	static Node root;
	static Scanner s=new Scanner(System.in);

	public static Node create(int data)
	{
		Node n=null;
		n=new Node();
		n.data=data;
		return n;
	}
	
	public static Node insert(Node root,int data)
	{
		if(root==null)
		{
			return create(data);
		}
		else if(data>root.data)
		{
			root.right=insert(root.right,data);
		}
		else
		{
			root.left=insert(root.left,data);
		}
		return root;
	}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		root=create(data);

		boolean repeat=true;
		while(repeat)
		{
			System.out.println();
			int ch=s.nextInt();
		}
		

	}

}
