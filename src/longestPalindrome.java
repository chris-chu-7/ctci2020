class Solution {
    public String longestPalindrome(String s) {
        String finalSolution = "";
        for(int i = 0; i < s.length(); i++){
            int beginIndex = i;
            int endIndex = i;
            while(endIndex < s.length() - 1 && s.charAt(endIndex + 1) == s.charAt(i)) {
                endIndex++;
            }
            while(beginIndex > 0 && s.charAt(beginIndex - 1) == s.charAt(i)){
                beginIndex--;
            } 
            while(beginIndex > 0 && endIndex < s.length() - 1 && s.charAt(beginIndex - 1) == s.charAt(endIndex + 1)){
                beginIndex--;
                endIndex++;
            }
            String ss = s.substring(beginIndex, endIndex + 1);
            System.out.println(ss);
            if(ss.length() >= finalSolution.length()){
                finalSolution = ss;
            }
            if(finalSolution.length() == s.length()) return s;
        }
        return finalSolution;
    }
}