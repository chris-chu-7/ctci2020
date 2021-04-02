
public class test_p50EggDrop51 {
	
	public static boolean testEggDrop50Success() {
		EggDrop51 drop = new EggDrop51(0);
		return drop.findBreakingPoint(100, 100) == 14;
	}
	
	public static boolean testEggDrop50Failure() {
		EggDrop51 drop = new EggDrop51(0);
		return drop.findBreakingPoint(100, 100) == 15;
	}
	
	public static void main(String[] args) {
		int numPassed = 0;
		int numFailed = 0;
		
		if(testEggDrop50Success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		
		if(!testEggDrop50Failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");

	}

}
