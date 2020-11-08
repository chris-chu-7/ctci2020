class Solution {
    public String countAndSay(int n) {

        //base cases is when n = 0 and n = 1. This indicates that 
        if (n <= 0) return null;
        if (n == 1) return "1";

        //initial return value
        String result = "1";

        //initialize the string pointer to 1. 
        int i = 1;

        //go accross all String Pointers, and then make the Result String different
        while (i < n) {

            //increment the number, which is given in the input. 
            i = i + 1;

            //something easy to use to concatenate to the string
            StringBuilder sb = new StringBuilder();

            //initialize the count variable, that counts the number of occurences of a specific number. 
            int count = 1;


            for (int j = 1; j < result.length(); j++) {

                //if there is a repeat character, then increment the number of occurrences. 

                if (result.charAt(j) == result.charAt(j - 1)) {
                    count = count + 1;
                }

                //else, append the count, and go to the next character. 
                else {
                    sb.append(count);
                    sb.append(result.charAt(j - 1));
                    count = 1;
                }
            }


            //append the last string in the result to the StringBuilder
            sb.append(count);
            sb.append(result.charAt(result.length() - 1));

            //convert the stringBuilder to the String. 
            result = sb.toString();
        }

        //return the following result string. 
        return result;
    }
}