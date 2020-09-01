
public class p41Debugger {
	
	public static boolean isPowerOf2(int n) {
		return ((n & (n - 1)) == 0);
	}

	public static void main(String[] args) {
		for(int i = 0; i < 1000000000; i++) {
			if(isPowerOf2(i)) System.out.println(i + " is a power of 2.");
		}
	}

}
