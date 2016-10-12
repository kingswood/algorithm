package graph;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
	
	T value;
	
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
