
public class p24Graph {
	
	//https://www.futhead.com/20/squads/522881/

	//https://www.futhead.com/20/squads/522893/

	//https://www.futhead.com/20/squads/522903/
	
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


