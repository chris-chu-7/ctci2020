class Solution {
    List<String> finalCombination = new ArrayList<String>();
    String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public void recurse(String combination, String digits){
        if(digits.length() == 0){
            finalCombination.add(combination);
        } else {
            String digit = map[digits.charAt(0) - '0'];
            for(int i = 0; i < digit.length(); i++){
                String theCombination = combination + digit.charAt(i);
                recurse(theCombination, digits.substring(1));
            }
        }  
    }
    public List<String> letterCombinations(String digits) {
        if(digits.length() != 0){
             recurse("", digits);   
        }
        return finalCombination; 
    } 
}