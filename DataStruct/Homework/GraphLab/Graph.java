package Homework.GraphLab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Graph {

	private List<GraphNode> nodeList = new ArrayList<>();

	public Boolean addNode(GraphNode node) {

		// check if the node already exists in the graph

		if (this.getNode(node.getValue()) != null) return false;
		
		// if it does not exist, add it to the list of nodes

		nodeList.add(node);

		return true;
			
	}

	public Boolean addEdge(GraphNode fromNode, GraphNode toNode, Integer weight) {

		//get the source and target nodes from the existing graph

		GraphNode sourceNode = this.getNode(fromNode.getValue());
		GraphNode targetNode = this.getNode(toNode.getValue());
		
		//if either dont exist, cant make the edge

		if (sourceNode == null || targetNode == null) return false;
		
		// otherwise ( they both exist ) add neighbor & weight 

		sourceNode.addNeighbor(targetNode, weight);

		return true;

	}

	/**
	 * In my implementation of isReachable I put a Set of nodes to represent places
	 * already reached. Modifying that algorithm to use a map, and keep an
	 * ever incrementing number along with the number that says how far away is an
	 * approach.
	 * 
	 * All the nodes I can get to from the start are 1 away. All the nodes I can get
	 * to from N away are N+1 away If I find a node the second time, I dont add it;
	 * once I get there, the shortest path to the destination has X hops; if I got
	 * there in N and N+1 hops, N + X will be the smallest number of hops
	 * 
	*/
	public int fewestHops(GraphNode fromNode, GraphNode toNode) {

		// we're given two arbitrary nodes (why). we must find them in the graph by value 

		fromNode = this.getNode(fromNode.getValue());
		toNode = this.getNode(toNode.getValue());
		
		// BFS with implementation of a count of hops

		Queue<GraphNode> queue = new LinkedList<>();
		Set<GraphNode> visited = new HashSet<>();
		Map<GraphNode, Integer> hops = new HashMap<>();

		// Init the collections/vars

		queue.add(fromNode); 
		visited.add(fromNode);
		hops.put(fromNode, 0); 

		while (!queue.isEmpty()) {

			GraphNode currentNode = queue.poll(); 

			if (currentNode.getValue().equals(toNode.getValue())) {

				return hops.get(currentNode);

			}

			for (GraphNode neighbor : currentNode.getNeighbors()) {

				if (!visited.contains(neighbor)) { 

					queue.add(neighbor);
					visited.add(neighbor);
					hops.put(neighbor, hops.get(currentNode) + 1); 

				}
				
			}
			
		}

		return hops.get(toNode) == null ? -1 : hops.get(toNode); 
				
	}

	public GraphNode getNode(String nodeValue) {

		for (GraphNode thisNode : nodeList) {

			if (thisNode.getValue().equals(nodeValue)) return thisNode;
			
		}
		
		return null;

	}

	public List<GraphNode> getNodes() {

		return nodeList;

	}

}
