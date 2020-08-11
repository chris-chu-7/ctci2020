 

public class p6StringCompression {

	
	//implement a method to perform basic string comparison
	//using the counts of repeated characters. For example,
	//the string aabcccccaaa would become a2b1c5a3. If the
	//"compressed" strings would not become smaller than the 
	//original string. You can assume the string only has 
	//uppercase and lowercase letters.
	
	//method 1
	public static String compressBad_1(String str) {
		String compressedString = "";
		int countConsecutive = 0;
		for(int i = 0; i < str.length(); i++) {
			countConsecutive++;
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedString += "" + str.charAt(i) + countConsecutive;
				countConsecutive = 0;
			}
		}
		return compressedString.length() < str.length() ? compressedString : str;
	}
	
	//method 2
	public static String compress_2(String str) {
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for(int i = 0; i < str.length(); i++) {
			countConsecutive++;
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			} 
		}
		return compressed.length() < str.length() ? compressed.toString() : str;
	}
	
	//method3
	public static int countCompression_3(String str) {
		int compressedLength = 0;
		int countConsecutive  = 0;
		for(int i = 0; i < str.length(); i++) {
			countConsecutive++;
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedLength += 1 + String.valueOf(countConsecutive).length();
				countConsecutive = 0;
			}
		}
		return compressedLength;
	}
	
	public static String compress_3(String str) {
		int finalLength = countCompression_3(str);
		if(finalLength >= str.length()) return str;
		StringBuilder compressed = new StringBuilder(finalLength);
		int countConsecutive = 0; 
		for(int i = 0; i < str.length(); i++) {
			countConsecutive++;
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.toString();
	}
	
	
}
