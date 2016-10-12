package graph;

public class Edge {
	
	Vertex<?> endPoint;
	
	int weight;
	
	public Edge(){
		System.out.println("Creating new edge.");
	}

	public Vertex<?> getEndPoint() {
		return endPoint;
	} 

	public void setEndPoint(Vertex<?> endPoint) {
		this.endPoint = endPoint;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
