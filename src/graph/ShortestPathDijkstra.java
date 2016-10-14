package graph;

import java.util.ArrayList;
import java.util.List;

public class ShortestPathDijkstra {

	static int max = Integer.MAX_VALUE;

	public static Vertex<String> initialGraph(){
		
		Vertex<String> a = new Vertex<String>("A");
		Vertex<String> y = new Vertex<String>("Y");
		Vertex<String> c = new Vertex<String>("C");
		Vertex<String> b = new Vertex<String>("B");
		Vertex<String> e = new Vertex<String>("E");
		Vertex<String> d = new Vertex<String>("D");
		Vertex<String> h = new Vertex<String>("H");
		
		a.addEdge(c, 1);
		a.addEdge(e, 3);
		a.addEdge(h, 10);
		
		y.addEdge(e, 1);
		y.addEdge(d, 1);
		
		c.addEdge(a, 1);
		c.addEdge(b, 6);
		
		b.addEdge(c, 6);
		b.addEdge(d, 2);
		
		e.addEdge(a, 3);
		e.addEdge(h, 2);
		e.addEdge(y, 1);
		e.addEdge(d, 5);
		
		d.addEdge(b, 2);
		d.addEdge(e, 5);
		d.addEdge(y, 1);
		
		h.addEdge(a, 10);
		h.addEdge(e, 2);
		
		return a;
	}
	
	static List<Vertex<?>> list = new ArrayList<>();
	
	public static void breadthFirstSort(List<Vertex<?>> vertexes){
		
		if(null == vertexes || vertexes.size() == 0){
			return;
		}
		
		List<Vertex<?>> nextLevelList = new ArrayList<>();
		
		for(int i = 0;i<vertexes.size();i++){
			
			Vertex<?> v = vertexes.get(i);
			
			if(!v.isVisited){
				list.add(v);
				v.setVisited(true);
				
				List<Edge> edges = v.getEdges();
				if(null != edges){
					for(int j = 0;j<edges.size();j++){
						Vertex<?> next = edges.get(j).getEndPoint();
						nextLevelList.add(next);
					}
				}
			}
			
		}
		
		breadthFirstSort(nextLevelList);
	}
	
	
	public static List<String> getShortestPath(){
		
		List<String> result = new ArrayList<>();
		
		for(int i = 0;i<list.size();i++){
			
			Vertex<?> v = list.get(i);
			
			for(int j = i; j<list.size();j++){
				Vertex<?> next = list.get(j);
				int tmp = Integer.MAX_VALUE;
				if(v.toVertex(next) < Integer.MAX_VALUE){
					// connected
					if(next.shortestPath == Integer.MAX_VALUE){
						next.shortestPath = 0;
					}
					if(v.shortestPath > v.toVertex(next)){
						next.shortestPath = v.toVertex(next) + v.toVertex(next);
					}else{
						next.shortestPath = v.toVertex(next) + v.shortestPath;
					}
					
					if(next.getShortestPath() < tmp){
						tmp = next.getShortestPath();
					}
				}
			}
			
			result.add(String.valueOf(v.getValue())+v.getShortestPath());
			
		}
		
		return result;
	}
	

	public static void main(String[] args) {

		Vertex<String> root = initialGraph();
		
		List<Vertex<?>> l = new ArrayList<>();
		l.add(root);
		
		// traverse the graph using BFS
		breadthFirstSort(l);
		
		List<String> shortestPaths = getShortestPath();
		
		for(int i = 0;i<shortestPaths.size();i++){
			//Vertex<?> v = shortestPaths.get(i);
			System.out.println(shortestPaths.get(i));
		}
		
	}
	
	
	/*private static String[] vertexes = { "A","Y", "C", "B","E","D","H" };

	private static int[][] edges = { 
			{ 0,max,1,max,3,max,10 }, 
			{ max,0,max,max,1,1,max },
			{ 1, max,0,6,max,max,max}, 
			{ max,max,6,0,max,2,max},
			{3,1,max,max,0,5,2},
			{max,1,max,2,5,0,max},
			{10,max,max,max,2,max,0}};*/
	

	
	

}
