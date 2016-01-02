package com.lekhoni.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kuasha on 1/19/15.
 */
public class Tree {	
	
	public static void traversePreorder(BinaryTreeNode node){
		if(node != null){
			visit(node);
			traversePreorder(node.leftChild);
			traversePreorder(node.rightChild);
		}
	}
		
	public static void traverseInorder(BinaryTreeNode node){
		if(node != null){
			traversePreorder(node.leftChild);
			visit(node);
			traversePreorder(node.rightChild);
		}		
	}
	
	public static void traversePostorder(BinaryTreeNode node){
		if(node != null){
			traversePreorder(node.leftChild);
			traversePreorder(node.rightChild);
			visit(node);
		}				
	}
	
	public static void traverseBFS(BinaryTreeNode root){		
		if(root != null){
			Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();			
			queue.add(root);
			while(!queue.isEmpty()){
				BinaryTreeNode node = queue.remove();
				visit(node);
				if(node.leftChild != null){
					queue.add(node.leftChild);
				}
				if(node.rightChild != null){
					queue.add(node.rightChild);					
				}
			}
		}
	}
	
	private static void visit(BinaryTreeNode node) {
		System.out.print(node.data + " ");
	}

	public static void main(String[] args){
		BinaryTreeNode rootNode = new BinaryTreeNode(1);		
		rootNode.leftChild  = new BinaryTreeNode(5);
		rootNode.rightChild = new BinaryTreeNode(7);
	
		rootNode.rightChild.leftChild = new BinaryTreeNode(9);
		
		traversePreorder(rootNode);
		System.out.println();
		traverseInorder(rootNode);
		System.out.println();
		traversePostorder(rootNode);
		System.out.println();
		
		traverseBFS(rootNode);
	}
}
