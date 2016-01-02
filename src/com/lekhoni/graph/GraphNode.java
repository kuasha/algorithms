package com.lekhoni.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
	public int data;
	public boolean isVisited;
	
	public GraphNode(){	
		adjacentNodes = new ArrayList<GraphNode>();
	}
	
	public GraphNode(int data) {
		this.data = data;
		adjacentNodes = new ArrayList<GraphNode>();
	}

	public List<GraphNode> adjacentNodes;
}
