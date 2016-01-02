package com.lekhoni.tree;

public class BinaryTreeNode {
	public BinaryTreeNode parent, leftChild, rightChild;
	public int data;
	
	public BinaryTreeNode(){
	}
	
	public BinaryTreeNode(int data){
		this.data = data;
	}

	public BinaryTreeNode(int data, BinaryTreeNode parent) {
		this.data = data;
		this.parent = parent;
	}
}
