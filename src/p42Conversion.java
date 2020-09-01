
public class p42Conversion {
	
	
	public int bitSwapRequired1(int a, int b) {
		int count = 0; 
		int c = a ^ b;
		while(c != 0) {
			count += c & 1;
			c >>= 1;
		}
		return count;
	}
	
	public int bitSwapRequired2(int a, int b) {
		int count = 0;
		int c = a ^ b;
		while(c != 0) {
			c = c & (c - 1);
			count++;
		}
		return count;
	}
	
	
}
