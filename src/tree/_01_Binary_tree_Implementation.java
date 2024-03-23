package tree;

import java.util.Scanner;

public class _01_Binary_tree_Implementation { 
	static Node root; 
	static Scanner s = new Scanner(System.in); 

	public static Node create()
	{ 
		Node n = new Node(); 
		System.out.println("enter the data:(-1 for no node)"); 
		int ele=s.nextInt(); 
		if(ele==-1) 
		{ 
			return null; 
		} 
		n.data=ele; 
		System.out.println("enter left side of:"+ele); 
		n.left=create(); 
		System.out.println("enter right side of:"+ele); 
		n.right=create(); 
		return n; 
	} 
	public static void inorder(Node root) 
	{ 
		if(root==null) 
		{ 
			return; 
		} 
		else 
		{  
			inorder(root.left); 
			System.out.println(root.data); 
			inorder(root.right);
		}
	} 
	public static void preorder(Node root) 
	{ 
		if(root==null) 
		{ 
			return; 
		} 
		else 
		{  
			System.out.println(root.data); 
			preorder(root.left); 
			preorder(root.right); 
		} 
	} 
	public static void postorder(Node root) 
	{ 
		if(root==null) 
		{ 
			return; 
		} 
		else 
		{  
			postorder(root.left); 
			postorder(root.right); 
			System.out.println(root.data); 
		} 
	} 
	public static void main(String[] args)
	{ 
		root=create(); 
		System.out.println("inorder is:"); 
		inorder(root); 
		System.out.println("preorder is:"); 
		System.out.println("```````````````"); 
		preorder(root); 
		System.out.println("postorder is:");
		System.out.println("````````````````"); 
		postorder(root); 
	} 
} 