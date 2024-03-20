package tree;

import java.util.Scanner;

public class _02_Binary_Search_Tree {

	static Node root;
	static Scanner s=new Scanner(System.in);
	
	public static Node create()
	{
		Node n=null;
		if(root==null)
		{
		    n=new Node();
			System.out.println("enter the data");
			n.data=s.nextInt();
			
		}
		return n;
	}
	public static void main(String[] args) {
		
		root=create(45);
		insert(root,21);
		insert(root,34);
		insert(root,19);
		insert(root,3);
		
		inorder(root);
		
	}

}
