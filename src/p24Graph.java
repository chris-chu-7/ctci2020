
public class p24Graph {
	
	
	public static int MAX_VERTICES = 6;
	private p24Node vertices[];
	public int count;
	
	public p24Graph() {
		vertices = new p24Node[MAX_VERTICES];
		count = 0;
	}
	
	public void addNode(p24Node x) {
		if(count < vertices.length) {
			vertices[count] = x;
			count++;
		} else {
			System.out.println("Graph Full.");
		}
	}
	
	public p24Node[] getNodes(){
		return vertices;
	}

	
}
