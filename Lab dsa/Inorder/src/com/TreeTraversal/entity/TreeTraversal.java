package com.TreeTraversal.entity;

public class TreeTraversal {
	public Node root;
	
	public TreeTraversal() {
		this.root = null;
	}
	
	public void printInorder(Node node) {
		if(node == null) {
			return;
		}
		
		printInorder(node.left);
		System.out.print(node.key + " ");
		printInorder(node.right);
	}
	
	public void printInorder() {
		
		printInorder(root);
	}
}
