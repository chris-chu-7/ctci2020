class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String shortestString = "";
        String longestSubstring = "";
        int longestSubstringLength = 0; 
        int shortestIndex = 0;
        int shortestLength = Integer.MAX_VALUE; 
        for(int i = 0; i < strs.length; i++){
            if(strs[i].length() < shortestLength){
                shortestLength = strs[i].length();
                shortestIndex = i;
            } 
        }
        shortestString = strs[shortestIndex];
            for(int j = 0; j <= shortestString.length(); j++){
                String subString = shortestString.substring(0, j);
                boolean containsAll = true;
                for(int k = 0; k < strs.length; k++){
                    if(!strs[k].substring(0, j).equals(subString)){
                        containsAll = false;
                    }
                }
                if(containsAll){
                    if(subString.length() > longestSubstringLength){
                        longestSubstringLength = subString.length();
                        longestSubstring = subString;
                    }
                }
            }
        return longestSubstring;
    }
}