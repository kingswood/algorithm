package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
	
	T value;
	
	int shortestPath = Integer.MAX_VALUE;
	
	List<Edge> edges;
	
	boolean isVisited;
	
	public Vertex(T value){
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	
	
	
	public int getShortestPath() {
		return shortestPath;
	}

	public void setShortestPath(int shortestPath) {
		this.shortestPath = shortestPath;
	}
	
	public int toVertex(Vertex<?> v){
		int path = Integer.MAX_VALUE;
		
		if(null == this.getEdges() || this.getEdges().size() == 0){
			return path;
		}
		
		if(this.getValue().equals(v.getValue())){
			return 0;//same vertex
		}
		
		List<Edge> edges = this.getEdges();
		
		for(int i = 0;i<edges.size();i++){
			Edge e = edges.get(i);
			
			if(e.getEndPoint().getValue().equals(v.getValue())){
				return e.getWeight();
			}
					
		}
		
		return path;
	}

	public void addEdge(Vertex<?> endPoint){
		
		Edge edge = new Edge();
		edge.setEndPoint(endPoint);
		
		if(null == edges){
			edges = new ArrayList<>();
		}
		
		edges.add(edge);
		
	}
	
	public void addEdge(Vertex<?> endPoint, int weight){
		
		Edge edge = new Edge();
		edge.setEndPoint(endPoint);
		edge.setWeight(weight);
		
		if(null == edges){
			edges = new ArrayList<>();
		}
		
		edges.add(edge);
		
	}
	
	
}
