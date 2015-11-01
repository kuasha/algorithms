package com.lekhoni.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kuasha on 1/19/15.
 */
public class Tree {
	
	public BinaryTreeNode root;
	
	public Tree(){		
	}	
	
	public void traversePreorder(BinaryTreeNode node){
		if(node != null){
			visit(node);
			traversePreorder(node.leftChild);
			traversePreorder(node.rightChild);
		}
	}
		
	public void traverseInorder(BinaryTreeNode node){
		if(node != null){
			traversePreorder(node.leftChild);
			visit(node);
			traversePreorder(node.rightChild);
		}		
	}
	
	public void traversePostorder(BinaryTreeNode node){
		if(node != null){
			traversePreorder(node.leftChild);
			traversePreorder(node.rightChild);
			visit(node);
		}				
	}
	
	public void traverseBFS(BinaryTreeNode root){		
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
	
	private void visit(BinaryTreeNode node) {
		System.out.print(node.data + " ");
	}

	public static void main(String[] args){
		Tree tree = new Tree();
		BinaryTreeNode rootNode = new BinaryTreeNode(1);
		tree.root = rootNode;
		rootNode.leftChild  = new BinaryTreeNode(5);
		rootNode.rightChild = new BinaryTreeNode(7);
	
		rootNode.rightChild.leftChild = new BinaryTreeNode(9);
		
		tree.traversePreorder(tree.root);
		System.out.println();
		tree.traverseInorder(tree.root);
		System.out.println();
		tree.traversePostorder(tree.root);
		System.out.println();
		
		tree.traverseBFS(tree.root);
	}
}
