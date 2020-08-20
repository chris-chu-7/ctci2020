import java.util.EmptyStackException;


public class p18FixedDivision {
	
	class p18Solution1{
		private int numberOfStacks1 = 3;
		private int stackCapacity1; 
		private int[] values1;
		private int[] sizes1;
		
		public p18Solution1(int stackSize) {
			stackCapacity1 = stackSize;
			values1 = new int[numberOfStacks1 * stackCapacity1];
			sizes1 = new int[numberOfStacks1];
		}
			
		private int indexOfTop1(int stackNum) {
			int offset = stackNum * stackCapacity1;
			int size = sizes1[stackNum];
			return offset + size - 1;
		}
		
		public void push1(int stackNum, int value) throws Exception {
			if(isFull1(stackNum)) throw new Exception();
			sizes1[stackNum]++;
			values1[indexOfTop1(stackNum)] = value;
		}
		
		public int pop1(int stackNum) {
			if(isEmpty1(stackNum)) throw new EmptyStackException();
			int topIndex = indexOfTop1(stackNum);
			int value = values1[topIndex];
			values1[topIndex] = 0;
			sizes1[stackNum]--;
			return value;
		}
		
		public int peek1(int stackNum) {
			if(isEmpty1(stackNum)) throw new EmptyStackException();
			return values1[indexOfTop1(stackNum)];
		}
		
		public boolean isEmpty1(int stackNum) {return sizes1[stackNum] == 0;}
		
		public boolean isFull1(int stackNum) {return sizes1[stackNum] == stackCapacity1;}
	}
	
	class p18Solution2{
		private int[] values2;
		private int[] sizes2;
		
		private class StackInfo_2{
			
			
			public int start2, size2, capacity2;
			private int stackCapacity2; 
			
			public StackInfo_2(int start2, int capacity2) {
				this.start2 = start2;
				this.capacity2 = capacity2;
			}
			
			public boolean isWithinStackCapacity_2(int index) {
				if(index < 0 || index >= values2.length) return false;
				int contiguousIndex = index < start2 ? index + values2.length : index;
				int end2 = start2 + capacity2;
				return start2 <= contiguousIndex && contiguousIndex < end2;
			}
			
			public int lastCapacityIndex_2() {return adjustIndex_2(start2 - 1 + capacity2);}
			
			public int lastElementIndex_2() {return adjustIndex_2(start2 - 1 + size2);}
			
			public boolean isFull_2() {return size2 == capacity2;}
			
			public boolean isEmpty_2() {return size2 == 0;}
						
		}
		
		private StackInfo_2[] info2;
		
		public p18Solution2(int numberOfStacks, int defaultSize) {
			info2 = new StackInfo_2[numberOfStacks];
			for(int i = 0; i < numberOfStacks; i++) {
				info2[i] = new StackInfo_2(defaultSize * i, defaultSize);
			}
			values2 = new int[numberOfStacks * defaultSize];
		}
		
		public void push_2(int stackNum, int value) throws Exception {
			if(allStacksAreFull_2()) throw new Exception();
			StackInfo_2 stack = info2[stackNum];
			if(stack.isFull_2()) expand_2(stackNum);
			stack.size2++;
			values2[stack.lastElementIndex_2()] = value;
		}
		
		public int pop_2(int stackNum) throws Exception {
			StackInfo_2 stack = info2[stackNum];
			if(stack.isEmpty_2()) throw new EmptyStackException();
			int value = values2[stack.lastElementIndex_2()];
			values2[stack.lastElementIndex_2()] = 0;
			stack.size2--;
			return value;
		}
		
		public int peek_2(int stackNum) {
			StackInfo_2 stack = info2[stackNum];
			return values2[stack.lastElementIndex_2()];
		}
		
		private void shift_2(int stackNum) {
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
			shift_2((StackNum + 1) % info2.length);
			info2[StackNum].capacity2++;
		}
		
		private int adjustIndex_2(int index) {
			int max = values2.length;
			return ((index % max) + max) % max;
		}
		
		public int numberOfElements_2() {
			int size = 0;
			for(StackInfo_2 sd: info2) {
				size += sd.size2;
			}
			return size;
		}
		
		public boolean allStacksAreFull_2() {
			return numberOfElements_2() >= values2.length;
		}
		
		private int previousIndex_2(int index) {return adjustIndex_2(index - 1);}
		
		private int nextIndex_2(int index) {return adjustIndex_2(index + 1);}
		
		
	}
	
	
}
