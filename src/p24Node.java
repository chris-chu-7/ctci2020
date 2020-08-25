
public class p24Node {
	
	
	private p24Node[] adjacent;
	public int adjacentCount;
	private String vertex;
	public p24Question.State state;
	
	public p24Node(String vertex, int adjacentLength) {
		this.vertex = vertex;
		adjacentCount = 0;
		adjacent = new p24Node[adjacentLength];
	}
	
	public void addAdjacent(p24Node x) {
		if(adjacentCount < adjacent.length) {
			this.adjacent[adjacentCount] = x;
			adjacentCount++;
		} else {
			System.out.println("No more adjacent can be added");
		}
	}
	
	public p24Node[] getAdjacent(){
		return adjacent;
	}
	
	public String getVertex() {
		return vertex;
	}
	
	
}

