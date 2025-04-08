package Homework.Graphs;

public class Driver {

	public static void main(String args[]) {

		TEST_CITIES();

	}

	public static void TEST_CITIES() {
	
		//Create Vertices

		GraphNode<String> Austin = new GraphNode<String>("Austin");
		GraphNode<String> Atlanta = new GraphNode<String>("Atlanta");
		GraphNode<String> Chicago = new GraphNode<String>("Chicago");
		GraphNode<String> Dallas = new GraphNode<String>("Dallas");
		GraphNode<String> Denver = new GraphNode<String>("Denver");
		GraphNode<String> Houston = new GraphNode<String>("Houston");
		GraphNode<String> Washington = new GraphNode<String>("Washington");
			
		//Create Edges

		// Expected Routes:
		// Dallas -> Denver
		// Dallas -> Chicago 
		// Dallas -> Austin 
		// Austin -> Dallas
		// Austin -> Houston 
		// Denver -> Chicago 
		// Denver -> Atlanta 
		// Chicago -> Denver 
		// Houston -> Atlanta 
		// Atlanta -> Houston 
		// Washington -> Atlanta
		// Washington -> Dallas 

		Dallas.addneighbours(Denver);
		Dallas.addneighbours(Chicago);
		Dallas.addneighbours(Austin);

		Austin.addneighbours(Dallas);
		Austin.addneighbours(Houston);
		
		Denver.addneighbours(Chicago);
		Denver.addneighbours(Atlanta);

		Chicago.addneighbours(Denver);

		Houston.addneighbours(Atlanta);

		Atlanta.addneighbours(Houston);

		Washington.addneighbours(Atlanta);
		Washington.addneighbours(Dallas);

		// Graph 


	}
	
	/** Expected results:
	 
	 	Routes Available: 
		 -------------------------------- 
		 Austin -> Chicago:	 true
		 Denver -> Austin:	 false
		 Houston -> Dallas:	 false
		 Austin -> Atlanta:	 true
		 Denver -> Dallas:	 false
		 Washington -> Houston:	 true

	 */

}
