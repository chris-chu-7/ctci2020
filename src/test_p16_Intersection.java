
public class test_p16_Intersection {

	public static boolean test_findIntersection_success() {
		LinkedList.Node first = new LinkedList.Node(3);
		first.appendToTail(1);
		first.appendToTail(5);
		first.appendToTail(9);
		LinkedList.Node intersect = new LinkedList.Node(7);
		intersect.appendToTail(2);
		intersect.appendToTail(1);
		first.next = intersect;
		LinkedList.Node second = new LinkedList.Node(4);
		second.appendToTail(6);
		second.next = intersect;
		return p16_Intersection.findIntersection(first, second).data == 7;
	}
	
	public static boolean test_findIntersection_failure() {
		LinkedList.Node first = new LinkedList.Node(3);
		first.appendToTail(1);
		first.appendToTail(5);
		first.appendToTail(9);
		LinkedList.Node intersect = new LinkedList.Node(7);
		intersect.appendToTail(2);
		intersect.appendToTail(1);
		first.next = intersect;
		LinkedList.Node second = new LinkedList.Node(4);
		second.appendToTail(6);
		second.next = intersect;
		return p16_Intersection.findIntersection(first, second).data == 6;
	}
	
	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_findIntersection_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_findIntersection_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}

}
