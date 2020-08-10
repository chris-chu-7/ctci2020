//main
public class p4_permutation {
	
	
	/*
	 * Given a string, write a function to check if
	 *  it is a permutation of a palindrome. 
	 */

	//Solution #1 
	public static int getCharNumber1(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if(a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}
	
	public static int[] buildCharFrequencyTable1(String phrase) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for(char c: phrase.toCharArray()) {
			int x = getCharNumber1(c);
			if(x != -1) table[x]++;
		}
		return table;
	}
	
	public static boolean checkMaxOneOdd1(int[] table) {
		boolean foundOdd = false;
		for(int count : table) {
			if(count % 2 == 1) {
				if(foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}
	
	public static boolean isPermutationOfPalindrome1(String phrase) {
		int[] table = buildCharFrequencyTable1(phrase);
		return checkMaxOneOdd1(table);
	}
	
	//Solution #2
	public static boolean isPermutationOfPalindrome2(String phrase) {
		int countOdd = 0;
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		for(char c : phrase.toCharArray()) {
			int x = getCharNumber1(c);
			if(x != 1) {
				if(table[x] % 2 == 1) {
					countOdd++;
				}
			} else {
				countOdd--;
			}
		}
		return countOdd <= 1;
	}
	
	//Solution #3
	public static int toggle3(int bitVector, int index) {
		if(index < 0) return bitVector;
		int mask = 1 << index;
		bitVector ^= mask;
		return bitVector;
	}
	
	public static int createBitVector3(String phrase) {
		int bitVector = 0;
		for(char c: phrase.toCharArray()) {
			int x = getCharNumber1(c);
			bitVector = toggle3(bitVector, x);
		}
		return bitVector;
	}
	
	public static boolean checkAtMostOneBitSet3(int bitVector) {
		return (bitVector & (bitVector - 1)) == 0;
	}
	
	public static boolean isPermutationOfPalindrome3(String phrase) {
		int bitVector = createBitVector3(phrase);
		return checkAtMostOneBitSet3(bitVector);
	}
	

}
