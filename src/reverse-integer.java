class Solution {
    public int reverse(int x) {
        if(x / 10 == 0) return x;
        boolean isNegative = false;
        if(x < 0){
            isNegative = true;
            x = x * -1;
        }
        int solution = 0;
        Stack<Integer> stack = new Stack<Integer>();
        int result = 1;
        int number = x;
        while(x /(result * 10) != 0){
            result *= 10;
        }
        int marker = result;
        while(result > 0){
            stack.push(number / result);
            number -= (number/result) * result;
            result /= 10;
        }
      
        while(!stack.empty()){
            solution += stack.pop() * marker;
            marker /= 10;
        }
        if(isNegative){
            solution *= -1;
        }
        return solution;
    }
}