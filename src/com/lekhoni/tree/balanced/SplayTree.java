package com.lekhoni.tree.balanced;

import com.lekhoni.tree.BinaryTreeNode;
import com.lekhoni.tree.Tree;

/**
 * Created by kuasha on 1/19/15.
 */
public class SplayTree {
	
	public static boolean rotateLeft(BinaryTreeNode X){
				
		BinaryTreeNode Y = X.rightChild;
		
		if(Y == null){
			// X must have right child to rotate left
			return false;
		}
		
		BinaryTreeNode A = X.leftChild;
		BinaryTreeNode B =Y.leftChild;
		BinaryTreeNode C = Y.rightChild;
		
		Y.parent = X.parent;
		X.parent = Y;
		Y.leftChild = X;
		X.rightChild = B;
		B.parent = X;
		
		return true;		
	}
	
	public static boolean rotateRight(BinaryTreeNode X){
		BinaryTreeNode Y = X.parent;
				
		if(Y.rightChild == X){
			// X must be left child of its parent to rotate right
			return false;
		}
		
		BinaryTreeNode A = X.leftChild;
		BinaryTreeNode B = X.rightChild;
		BinaryTreeNode C = Y.rightChild;
		
		X.parent = Y.parent;
		X.rightChild = Y;
		Y.leftChild = B;
		B.parent = Y;
		
		return true;
	}
	
	// Splay to root
	// 1. zig-zag
	// X is left child of a right child
	// rotate X left then rotate X right
	// X is right child of a left child
	// rotate X right then rotate X left

	// 2. zig-zig
	// X is left child of a left child
	// rotate X.parent right and then rotate X right
	// X is right child of a right child
	// rotate X.parent left and then rotate X left
	
	// 3. zig
	// X is child of root
	// Rotate X left if X is right child of root 
	// or rotate right if X is left child of root	
		
	public static BinaryTreeNode search(BinaryTreeNode root, int key){
		// 1. search for item like binary search tree
		// 2. splay the entry to top
		return null;	
	}
	
	public static void insert(BinaryTreeNode root, BinaryTreeNode nodeToInsert){
		// 1. insert the entry like binary search tree
		// 2. splay the entry to top
	}

	public static void delete(BinaryTreeNode root, int key){
		// 1. search and delete the entry X like binary search tree where X's key = key
		// 2. splay the X.parent to top
	}

	public static void main(String[] args){
		BinaryTreeNode Y = new BinaryTreeNode(0);
		BinaryTreeNode X = new BinaryTreeNode(4, Y);		
		Y.leftChild = X;
		Y.rightChild = new BinaryTreeNode(3, Y);
		X.leftChild = new BinaryTreeNode(1, X);
		X.rightChild = new BinaryTreeNode(2, X);
		
		Tree.traverseBFS(Y);
		System.out.println();
		rotateRight(X);
		Tree.traverseBFS(X);
		System.out.println();
		rotateLeft(X);
		Tree.traverseBFS(Y);
	}
}
