
public class test_p10RemoveDups {
	
	
	public static boolean test_deleteDups_1_success() {
		LinkedList.Node list = new LinkedList.Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(1);
		list.appendToTail(5);
		p10RemoveDups.deleteDups_1(list);
		int[] checkList = {1, 2, 3, 5};
		LinkedList.Node iterator = list;
		int index = 0;
		while(index < checkList.length) {
			if(iterator.data != checkList[index]) {
				return false;
			}
			iterator = iterator.next;
			index++;
		}
		return true;
	}
	
	public static boolean test_deleteDups_1_failure() {
		LinkedList.Node list = new LinkedList.Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(1);
		list.appendToTail(5);
		p10RemoveDups.deleteDups_1(list);
		int[] checkList = {1, 2, 3, 1, 5};
		LinkedList.Node iterator = list;
		int index = 0;
		while(index < checkList.length) {
			if(iterator.data != checkList[index]) {
				return false;
			}
			iterator = iterator.next;
			index++;
		}
		return true;
	}
	
	public static boolean test_deleteDups_2_success() {
		LinkedList.Node list = new LinkedList.Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(1);
		list.appendToTail(5);
		p10RemoveDups.deleteDups_2(list);
		int[] checkList = {1, 2, 3, 5};
		LinkedList.Node iterator = list;
		int index = 0;
		while(index < checkList.length) {
			if(iterator.data != checkList[index] || index < checkList.length) {
				return false;
			}
			iterator = iterator.next;
			index++;
		}
		return true;
	}
	
	public static boolean test_deleteDups_2_failure() {
		LinkedList.Node list = new LinkedList.Node(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(1);
		list.appendToTail(5);
		p10RemoveDups.deleteDups_2(list);
		LinkedList.Node iterator = list;
		int[] checkList = {1, 2, 3, 1, 5};
		int index = 0;
		while(index < checkList.length) {
			if(iterator.data != checkList[index] || index < checkList.length) {
				return false;
			}
			iterator = iterator.next;
			index++;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int numPassed = 0, numFailed = 0;
		if(test_deleteDups_1_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_deleteDups_1_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(test_deleteDups_2_success()) {
			numPassed++;
		} else {
			numFailed++;
		}
		if(!test_deleteDups_2_failure()) {
			numPassed++;
		} else {
			numFailed++;
		}
		System.out.println("TEST RESULTS: " + numPassed + " TESTS PASSED, " + numFailed + " TESTS FAILED.");
	}

	
}
