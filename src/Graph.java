import java.util.ArrayList;


public class Graph {
	
	
	class NodeAL {
		public int index;
		public ArrayList<NodeAL> children;
	}
	
	public ArrayList<NodeAL> nodes = new ArrayList<NodeAL>();
	
	public int[][] adjacencyMatrix;
	
	public void add(int parent, int data) {
		adjacencyMatrix[parent][data] = 1;

		if(nodes.size() <= parent) {
			NodeAL nodeList = new NodeAL();
			nodeList.index = parent;
			nodeList.children = new ArrayList<NodeAL>();
			NodeAL theNode = new NodeAL();
			theNode.index = data;
			nodeList.children.add(theNode);	
			nodes.add(parent, nodeList);
		} else {
			NodeAL nodeList = nodes.get(parent);
			NodeAL theNode = new NodeAL();
			theNode.index = data;
			nodeList.children.add(theNode);	
		}
			
	}
	
	public void printGraph() {
		System.out.println("Graph Printing...\n\n");
		System.out.println("Adjacency Matrix: ");
		for(int i = 0; i < adjacencyMatrix.length; i++) {
			for(int j = 0; j < adjacencyMatrix[0].length; j++) {
				System.out.print(adjacencyMatrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("\n\nAdjacency List: ");
		for(int i = 0; i < nodes.size(); i++) {
			System.out.print(nodes.get(i).index + ": ");
			for(int j = 0; j < nodes.get(i).children.size(); j++) {
				System.out.print(nodes.get(i).children.get(j).index + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.adjacencyMatrix = new int[6][6];
		graph.add(0, 5);
		graph.add(0, 1);
		graph.add(0, 4);
		graph.add(1, 4);
		graph.add(1, 3);
		graph.add(2, 1);
		graph.add(3, 2);
		graph.add(3, 4);
		graph.printGraph();
	}

	
}
