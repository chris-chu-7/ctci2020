class Solution {
    public int myAtoi(String str) {
        int i = 0;
        int result = 0;
        boolean isNegative = false;
        if(str == null || str.equals("")){
            return 0;
        } 
        while(i < str.length() && str.charAt(i) == ' '){
            i++;
        }
        if(i < str.length() && str.charAt(i) != '-' && (str.charAt(i) - '0' < 0) && (str.charAt(i) - '0' > 9)){
            return 0;
        }
        boolean hasSign = false;
        if(i < str.length() && str.charAt(i) == '-'){
            isNegative = true;
            hasSign = true;
            if(i < str.length() - 1) i++;
        }
        if(i < str.length() && str.charAt(i) == '+' && !hasSign){
            isNegative = false;
            if(i < str.length() - 1) i++;
        }
        while(i < str.length() && str.charAt(i) == '0' && i < str.length() - 1){
            if(i < str.length() - 1) i++;
        }
        int multiplier = 1;
        int numDigits = 0;
        while(i < str.length() && (str.charAt(i) - '0' >= 0) && (str.charAt(i) - '0' <= 9) ){
            result = result * 10 + (str.charAt(i) - '0');
            multiplier *= 10;
            i++;
            numDigits++;
        }
        if(isNegative) result *= -1;
        if((float)result < (float)-2147483648 || numDigits > 10) return -2147483648;
        if((float)result > (float)2147483647 || numDigits > 10) return 2147483647;
        return result;
    }
}