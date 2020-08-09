public class p1isUnique {
	
	
	public static boolean is_unique_chars_complex(String str) {
		int string_length = str.length();
		int num_ascii_letters = 128; 
		if(string_length > num_ascii_letters) {
			return false;
		}
		boolean[] char_exists_in_array = new boolean[num_ascii_letters];
		for(int stringChar = 0; stringChar < string_length; stringChar++) {
			int char_in_string_position = str.charAt(stringChar) - 'a';
			boolean str_index_char_exists = char_exists_in_array[char_in_string_position];
			if(str_index_char_exists == true) {
				return false;
			}
			char_exists_in_array[char_in_string_position] = true;
		}
		return true;
	}
	
	public static boolean is_unique_chars_simple(String str) {
		int character_checker = 0;
		for(int character = 0; character < str.length(); character++) {
			int position_in_bitmap = str.charAt(character) - 'a';
			boolean position_taken = (character_checker & (1 << position_in_bitmap)) == 1;
			if(position_taken) {
				return false;
			}
			character_checker |= 1 << position_in_bitmap;
		}
		return true;
	}
	
	
}
