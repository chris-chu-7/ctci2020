import java.util.EmptyStackException;


public class p18FixedDivision {
	
	
	class p18Solution1{
		private int numberOfStacks1 = 3;
		private int stackCapacity1; 
		private int[] values1;
		private int[] sizes1;
		
		public p18Solution1(int stackSize) {
			/*Constructor that initialize the stack values and sizes tracker of the stack.*/
			stackCapacity1 = stackSize;
			values1 = new int[numberOfStacks1 * stackCapacity1];
			sizes1 = new int[numberOfStacks1];
		}
			
		private int indexOfTop1(int stackNum) {
			/*Returns the index of the top stack */
			int offset = stackNum * stackCapacity1;
			int size = sizes1[stackNum];
			return offset + size - 1;
		}
		
		public void push1(int stackNum, int value) throws Exception {
			/*Pushes the latest element with value into stack with index StackNum in array*/
			if(isFull1(stackNum)) throw new Exception();
			sizes1[stackNum]++;
			values1[indexOfTop1(stackNum)] = value;
		}
		
		public int pop1(int stackNum) {
			/*Pops the latest element in the stack corresponding to the index StackNum.
			 * Returns the value that is popped.*/
			if(isEmpty1(stackNum)) throw new EmptyStackException();
			int topIndex = indexOfTop1(stackNum);
			int value = values1[topIndex];
			values1[topIndex] = 0;
			sizes1[stackNum]--;
			return value;
		}
		
		public int peek1(int stackNum) {
			/*
			 * Returns the top element of the stack corresponding to the index StackNum
			 */
			if(isEmpty1(stackNum)) throw new EmptyStackException();
			return values1[indexOfTop1(stackNum)];
		}
		
		public boolean isEmpty1(int stackNum) {
			/*
			 * Returns to see if a stack corresponding to index StackNum is empty
			 */
			return sizes1[stackNum] == 0;
		}
		
		public boolean isFull1(int stackNum) {
			/*
			 * Returns to see if a stack corresponding to index stackNum is Full with the capacity
			 */
			return sizes1[stackNum] == stackCapacity1;
		}
		
		
	}
	
	
	class p18Solution2{
		
		private int[] values2;
		private int[] sizes2;
		
		
		private class StackInfo_2{
			
			
			public int start2, size2, capacity2;
			private int stackCapacity2; 
			
			public StackInfo_2(int start2, int capacity2) {
				/*Constructor that initializes the start and capacity of the stacks.*/
				this.start2 = start2;
				this.capacity2 = capacity2;
			}
			
			public boolean isWithinStackCapacity_2(int index) {
				/*See if an index can fit in a particular stack.*/
				if(index < 0 || index >= values2.length) return false;
				int contiguousIndex = index < start2 ? index + values2.length : index;
				int end2 = start2 + capacity2;
				return start2 <= contiguousIndex && contiguousIndex < end2;
			}
			
			public int lastCapacityIndex_2() {
				/*Returns the Last Index of the Stack that is possible*/
				return adjustIndex_2(start2 - 1 + capacity2);
			}
			
			public int lastElementIndex_2() {
				/*Returns the last element of the stack that exists.*/
				return adjustIndex_2(start2 - 1 + size2);
			}
			
			public boolean isFull_2() {
				/*Returns if the stack is at capacity*/
				return size2 == capacity2;
			}
			
			public boolean isEmpty_2() {
				/*Returns if the stack is empty*/
				return size2 == 0;
			}
						
		}
		
		
		private StackInfo_2[] info2;
		
		public p18Solution2(int numberOfStacks, int defaultSize) {
			/*Constructor that initializes the values and the stack Elements containing
			 * stackinfo_2 objects.*/
			info2 = new StackInfo_2[numberOfStacks];
			for(int i = 0; i < numberOfStacks; i++) {
				info2[i] = new StackInfo_2(defaultSize * i, defaultSize);
			}
			values2 = new int[numberOfStacks * defaultSize];
		}
		
		public void push_2(int stackNum, int value) throws Exception {
			/*
			 * Adds an element to the top stack containing the value at
			 * the stack index stackNum.
			 */
			if(allStacksAreFull_2()) throw new Exception();
			StackInfo_2 stack = info2[stackNum];
			if(stack.isFull_2()) expand_2(stackNum);
			stack.size2++;
			values2[stack.lastElementIndex_2()] = value;
		}
		
		public int pop_2(int stackNum) throws Exception {
			/*Removes the top element of the stack with StackNum. 
			 * Returns the data in this top element.*/
			StackInfo_2 stack = info2[stackNum];
			if(stack.isEmpty_2()) throw new EmptyStackException();
			int value = values2[stack.lastElementIndex_2()];
			values2[stack.lastElementIndex_2()] = 0;
			stack.size2--;
			return value;
		}
		
		public int peek_2(int stackNum) {
			/*Returns the contents of the top of a particular stack at Index stackNum.*/
			StackInfo_2 stack = info2[stackNum];
			return values2[stack.lastElementIndex_2()];
		}
		
		private void shift_2(int stackNum) {
			/*
			 * This method Shifts all the stacks to the right to make room for elements of a new stack.
			 */
			StackInfo_2 stack = info2[stackNum];
			if(stack.size2 >= stack.capacity2) {
				int nextStack = (stackNum + 1) % info2.length;
				shift_2(nextStack);
				stack.capacity2++;
			}
			int index = stack.lastCapacityIndex_2();
			while(stack.isWithinStackCapacity_2(index)) {
				values2[index] = values2[previousIndex_2(index)];
				index = previousIndex_2(index);
			}
			values2[stack.start2] = 0;
			stack.start2 = nextIndex_2(stack.start2);
			stack.capacity2--;
		}
		
		private void expand_2(int StackNum) {
			/*
			 * Shifts the Stack to the right in order to make room
			 * for new stacks to the left, expands the stack 
			 */
			shift_2((StackNum + 1) % info2.length);
			info2[StackNum].capacity2++;
		}
		
		private int adjustIndex_2(int index) {
			/*
			 * Adjusts the index of the stack to fit with the size of corresponding array. 
			 */
			int max = values2.length;
			return ((index % max) + max) % max;
		}
		
		public int numberOfElements_2() {
			/*
			 * Counts the total number of elements in all 3 stacks
			 */
			int size = 0;
			for(StackInfo_2 sd: info2) {
				size += sd.size2;
			}
			return size;
		}
		
		public boolean allStacksAreFull_2() {
			/*
			 * checks to see if all the values inside of the array are filled. 
			 */
			return numberOfElements_2() >= values2.length;
		}
		
		private int previousIndex_2(int index) {
			/*Returns the previous Index from an index adjusted.*/
			return adjustIndex_2(index - 1);
		}
		
		private int nextIndex_2(int index) {
			/*Returns the next index from the index adjusted.*/
			return adjustIndex_2(index + 1);
		}
		
		
	}
	
	
}
