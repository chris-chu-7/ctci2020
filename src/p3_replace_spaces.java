public class p3_replace_spaces {
	
	
	/*
	 * Problem Statement: Write a method to replace all spaces in a string with %20. 
	 * You may assume that the string has sufficient space to hold the additional characters,
	 * and you are given the "true" length of the string. If implementing in Java, please use a 
	 * character array.
	 */
	
	//Here is my implementation
	//Let's say that I am give the string "chris chu owns this channel"
	//The following array will look like this:
	// |c| |h| |r| |i| |s| | - | |c| |h| |u| | - | |o| |w| |n| |s| | - | |t| |h| |i| |s| | - | |c| |h| |a| |n| |n| |e| |l|
	//My method is as follows
	// 1. count the number of spaces in the array 
	// 2.If a space is going to be replaced by %20, this means the space has to be 2 more
	// 3. Count the total number of characters
	// 4. Make an array of total characters + 2 * the number of spaces in the array 
	// 5. Iterate through string, keep a pointer for the array, and put the corresponding spaces in there. 
	// 6. convert each character array to a string 
	// The results should be chris%20chu%20owns%20this%20channel
	public static String my_implementation(String str_to_convert) {
		int num_spaces = 0;
		for(int character = 0; character < str_to_convert.length(); character++) {
			if (str_to_convert.charAt(character) == ' ') {
				num_spaces++;
			}
		}
		int extra_indices = 2 * num_spaces;
		int new_array_size = str_to_convert.length() + extra_indices;
		char[] new_string_array = new char[new_array_size];
		int new_array_pointer = 0;
		for(int character = 0; character < str_to_convert.length(); character++) {
			if (str_to_convert.charAt(character) == ' ') {
				new_string_array[new_array_pointer] = '%';
				new_string_array[new_array_pointer + 1] = '2';
				new_string_array[new_array_pointer + 2] = '0';
				new_array_pointer += 3;
			} else {
				new_string_array[new_array_pointer] = str_to_convert.charAt(character);
				new_array_pointer++;
			}
		}
		StringBuilder final_string_builder = new StringBuilder();
		for(int character = 0; character < new_string_array.length; character++) {
			final_string_builder.append(new_string_array[character]);
		}
		return final_string_builder.toString();
	}
	
	public static int count_of_char(char[] str, int start, int end, int target) {
		int count = 0;
		for(int index = start; index < end; index++) {
			if(str[index] == target) {
				count++;
			}
		}
		return count;
	}
	
	public static String gayle_implementation(char[] str, int true_length) {
		int number_of_spaces = count_of_char(str, 0, true_length, ' ');
		int new_index = true_length - 1 + number_of_spaces * 2;
		if(new_index + 1 < str.length) str[new_index + 1] = '\0';
		new_index--;
		for(int old_index = true_length - 1; old_index >= 0; old_index--) {
			if(str[old_index] == ' ') {
				str[new_index] = '0';
				str[new_index - 1] = '2';
				str[new_index - 2] = '%';
				new_index -= 3;
			} else {
				str[new_index] = str[old_index];
				new_index -= 1;
			}
		}
		StringBuilder final_string_builder = new StringBuilder();
		for(int character = 0; character < str.length; character++) {
			final_string_builder.append(str[character]);
		}
		return final_string_builder.toString();
	}

	
}
