package Homework.Graphs;

import java.util.Queue;
import java.util.Set;

import java.util.HashSet;
import java.util.LinkedList;

public class GraphUtils<T> {

	public Boolean pathExists(GraphNode<T> targetFromNode, GraphNode<T> targetToNode) {
 
		Queue<GraphNode<T>> graphNodeQueue = new LinkedList<>();
		Set<GraphNode<T>> visitedNodes = new HashSet<>();
		
		//start from the targetFromNode

		graphNodeQueue.add(targetFromNode);
		visitedNodes.add(targetFromNode);

		while (!graphNodeQueue.isEmpty()) {

			GraphNode<T> currentNode = graphNodeQueue.poll();

			if (currentNode == targetToNode) {

				return true;

			}

			// Get all neighbors and enqueue if not already seen

			for (GraphNode<T> neighbor : currentNode.getNeighbours()) {

				if (!visitedNodes.contains(neighbor)) {

					graphNodeQueue.add(neighbor);
					visitedNodes.add(neighbor);

				}

			}

		}
		
		return false; // Not found

	}

}
