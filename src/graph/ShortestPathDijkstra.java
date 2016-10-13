package graph;

import java.util.HashMap;
import java.util.Map;

public class ShortestPathDijkstra {

	static int max = Integer.MAX_VALUE;

	private static String[] vertexes = { "A", "C", "D", "T", "B", "E", "F" };

	private static int[][] edges = { 
			{ 0, 1, 5, max, max, max, max }, 
			{ 1, 0, max, max, 8, max, max },
			{ 5, max, 0, 2, max, max, max }, 
			{ max, max, 2, 0, 1, max, 4 }, 
			{ max, 8, max, 1, 0, 3, max },
			{ max, max, max, max, 3, 0, 2 }, 
			{ max, max, max, 4, max, 2, 0 } };

	public static int[] getShortestPath() {

		int[] calculatedShortestPath = new int[vertexes.length];

		int[] unCalculatedShortestPath = new int[vertexes.length];

		for (int i = 0; i < vertexes.length; i++) {
			unCalculatedShortestPath[i] = max;
		}

		for (int i = 0; i < vertexes.length; i++) {

			int temp = -1;

			unCalculatedShortestPath[i] = -1;
			
			for (int k = 0; k < unCalculatedShortestPath.length; k++) {
				
			}

			for (int j = 0; j < edges.length; j++) {
				if (edges[i][j] < max && edges[i][j] < temp) {
					temp = edges[i][j];
				}
			}

			calculatedShortestPath[i] = temp;

			unCalculatedShortestPath[i] = -1;

			for (int k = 0; k < unCalculatedShortestPath.length; k++) {
				if (unCalculatedShortestPath[k] == -1) {
					continue;
				} else if (edges[i][k] < max) {
					if (unCalculatedShortestPath[k] < edges[i][k]) {
						unCalculatedShortestPath[k] = temp + unCalculatedShortestPath[k];
					} else {
						unCalculatedShortestPath[k] = temp + edges[i][k];
					}

				}
			}

		}

		return calculatedShortestPath;

	}

	public static void main(String[] args) {

		int[] shortestPath = getShortestPath();

		for (int i = 0; i < shortestPath.length; i++) {
			System.out.println(shortestPath[i]);
		}

	}

}
