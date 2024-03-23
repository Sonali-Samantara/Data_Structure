package tree;

import java.util.Scanner;

public class _02_Binary_Search_Tree {

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
		
		root=create(45);
		insert(root,21);
		insert(root,34);
		insert(root,19);
		insert(root,3);
		
	}

}
