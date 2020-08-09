public class p2_is_permutation {
	/*
	 Problem: Given two strings, write a method to decide if one is a permutation of another
	
	 Hints: 
	 
	 Describe what it means for two strings to be permutations of each other. Now, look at the definition that 
	 you provided. Can you check the strings against that definition? 
	 
	 There is one solution that is O(N log N) time. Another solution uses some space, but is O(N) time. 
	 
	 Can a hash table be useful?
	 
	 Two strings with different permutations can should have the same characters but different orders. 
	 Can you make the orders the same? 
	  
	 BST can make this code O(N) space O(N log N) time BUT Arrays has O(N) space and O(2N) time > O(NlogN) 
	 less efficient N/logN, which isn't a significant enough difference to warrent the implementation time.
	 see: 
	 */
	
	public static boolean my_implementation(String str_1, String str_2) {
		int[] string_array_1 = new int[26];
		int[] string_array_2 = new int[26];
		if(str_1.length() != str_2.length()) {
			return false;
		}
		for(int character = 0; character < str_1.length(); character++) {
			int string_1_index = str_1.charAt(character) - 'a';
			int string_2_index = str_2.charAt(character) - 'a';
			string_array_1[string_1_index]++;
			string_array_2[string_2_index]++;
		}
		for(int compare_index = 0; compare_index < string_array_1.length; compare_index++) {
			boolean index_is_same = string_array_1[compare_index] == string_array_2[compare_index];
			if(!index_is_same) {
				return false;
			}
		}
		return true;
	}
	
	public static String sort(String str) {
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
		
	public static boolean gayle_implementation_1(String str_1, String str_2) {
		if(str_1.length() != str_2.length()) {
			return false;
		}
		return sort(str_1).equals(sort(str_2));
	}
	
	public static boolean gayle_implementation_2(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		int[] ascii_map = new int[128];
		for(int character_in_string = 0; character_in_string < str1.length(); character_in_string++) {
			ascii_map[str1.charAt(character_in_string)]++;
		}
		for(int character_in_string = 0; character_in_string < str1.length(); character_in_string++) {
			ascii_map[str2.charAt(character_in_string)]--;
			if(ascii_map[str2.charAt(character_in_string)] < 0) {
				return false;
			}
		}
		return true;
	}
	
}
