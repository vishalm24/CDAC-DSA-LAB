package com.inorder.main;

import com.TreeTraversal.entity.Node;
import com.TreeTraversal.entity.TreeTraversal;

public class Inorder {

	public static void main(String[] args) {
		TreeTraversal IT = new TreeTraversal();
		
		IT.root = new Node(8);
		IT.root.left = new Node(6);
		IT.root.right = new Node(10);
		IT.root.left.left = new Node(5);
		IT.root.left.right = new Node(7);
		IT.root.right.left = new Node(9);
		IT.root.right.right = new Node(11);
		
		System.out.println("Inorder traversal: ");
		IT.printInorder();
	}

}