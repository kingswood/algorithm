package graph;

public class DFS {
	
	public static Vertex<String> initialGraph(){
		
		// vertexes
		Vertex<String> vA = new Vertex<String>("A");
		Vertex<String> vC = new Vertex<String>("C");
		Vertex<String> vY = new Vertex<String>("Y");
		Vertex<String> vF = new Vertex<String>("F");
		Vertex<String> vD = new Vertex<String>("D");
		Vertex<String> vK = new Vertex<String>("K");
		Vertex<String> vT = new Vertex<String>("T");
		Vertex<String> vZ = new Vertex<String>("Z");
		Vertex<String> vQ = new Vertex<String>("Q");
		
		//edges
		vA.addEdge(vC);
		vA.addEdge(vD);
		
		vC.addEdge(vA);
		vC.addEdge(vY);
		
		vY.addEdge(vC);
		vY.addEdge(vF);
		
		vF.addEdge(vY);
		vF.addEdge(vT);
		vF.addEdge(vK);
		vF.addEdge(vD);
		
		vD.addEdge(vA);
		vD.addEdge(vF);
		vD.addEdge(vK);
		
		vK.addEdge(vD);
		vK.addEdge(vF);
		
		vT.addEdge(vF);
		vT.addEdge(vZ);
		
		vZ.addEdge(vT);
		vZ.addEdge(vQ);
		
		vQ.addEdge(vZ);
		
		
		return vA;
	}
	
	public static void depthFirstSearch(Vertex<?> startPoint){
		
		if(startPoint.isVisited){
			return;
		}
		
		System.out.println(startPoint.getValue());
		startPoint.setVisited(true);
		
		if(null == startPoint.edges || startPoint.edges.size() == 0){
			return;
		}
		
		for(int i = 0;i<startPoint.edges.size(); i ++){
			depthFirstSearch(startPoint.edges.get(i).getEndPoint());
		}
		
	}
	
	
	public static void main(String[] args){
		
		Vertex<String> a = initialGraph();
		
		depthFirstSearch(a);
		
	}
	
}

