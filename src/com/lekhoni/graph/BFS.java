package com.lekhoni.graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Maruf Maniruzzaman on 1/19/15.
 */
public class BFS {
	
	public void traverseBFS(GraphNode startNode){
		Queue<GraphNode> q = new LinkedList<GraphNode>();
		
		if(startNode != null){
			q.add(startNode);
		}
		
		while(!q.isEmpty()){
			GraphNode node = q.remove();
			if(!node.isVisited)
			{
				visit(node);
				for(GraphNode adjNode: node.adjacentNodes){
					q.add(adjNode);
				}
			}
		}		
	}
	
	private void visit(GraphNode node) {
		System.out.print(node.data + " ");
		node.isVisited = true;
	}

	public static void main(String[] args){
		GraphNode node1 = new GraphNode(1);
		GraphNode node2 = new GraphNode(2);
		GraphNode node3 = new GraphNode(3);
		GraphNode node4 = new GraphNode(4);
		GraphNode node5 = new GraphNode(5);
		GraphNode node6 = new GraphNode(6);
		
		node1.adjacentNodes.add(node2);
		node1.adjacentNodes.add(node3);
		
		node2.adjacentNodes.add(node3);
		node2.adjacentNodes.add(node4);
		
		node3.adjacentNodes.add(node5);		
		
		node4.adjacentNodes.add(node6);
		node5.adjacentNodes.add(node4);
		node5.adjacentNodes.add(node6);
		
		BFS bfs = new BFS();
		bfs.traverseBFS(node1);
		
	}
}
