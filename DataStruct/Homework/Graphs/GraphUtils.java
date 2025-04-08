package Homework.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class GraphUtils<T> {

	public Boolean pathExists(GraphNode<T> targetFromNode, GraphNode<T> targetToNode) {
 
		Queue<GraphNode<T>> graphNodeQueue = new LinkedList<>();
		

		// create queue to manage nodes
		// create set to manage visitedNodes

		//start from the targetFromNode
			
			//for all neighbors:
				//check if visited.  If not, add to the queue.  
				//if targetToNode has been visited, return true
			
			
		
		//if u get here
		return false;
	}

}
