
public class p40NextNumber3 {

	
	public static int getNextArith(int n) {
		int c = n;
		int c0 = 0;
		int c1 = 0;
		while(((c & 1) == 0) && (c != 0)) {
			c0++;
			c >>= 1;
		}
		while((c & 1) == 1) {
			c1++;
			c >>= 1;	
		}
		if(c0 + c1 == 31 || c0 + c1 == 0) {
			return -1;
		}
		return n + (1 << c0) + (1 << (c1 - 1)) - 1;
	}
	
	public static int getPrevArith(int n) {
		int temp = n;
		int c0 = 0;
		int c1 = 0;
		while((temp & 1) == 1 && (temp != 0)) {
			c1++;
			temp >>= 1;
		}
		if(temp == 0) {
			return -1;
		}
		while((temp & 1) == 0 && (temp != 0)) {
			c0++;
			temp >>= 1;
		}
		return n - (1 << c1) - (1 << (c0 - 1)) + 1;
	}
	
	
}
