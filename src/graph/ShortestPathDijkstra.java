package graph;

public class ShortestPathDijkstra {
	
	public static void initialGraph(){
		
		Vertex<String> a = new Vertex<String>("A");
		Vertex<String> c = new Vertex<String>("C");
		Vertex<String> d = new Vertex<String>("D");
		Vertex<String> f = new Vertex<String>("F");
		Vertex<String> k = new Vertex<String>("K");
		Vertex<String> y = new Vertex<String>("Y");
		Vertex<String> t = new Vertex<String>("T");
		Vertex<String> z = new Vertex<String>("Z");
		Vertex<String> q = new Vertex<String>("Q");
		
		a.addEdge(c, 2);
		a.addEdge(f, 8);
		a.addEdge(d, 4);
		
		c.addEdge(y, 1);
		
		y.addEdge(f, 3);
		
		f.addEdge(d, 5);
		
		d.addEdge(k, 6);
		
	}
	
}
