
public class p9StringRotation {

	
	public static boolean isRotation_1(String s1, String s2) {
		int len = s1.length();
		if(len == s2.length() && len > 0) {
			String combined = s1 + s1;
			return combined.contains(s2);
		}
		return false;
	}
	
	
}
