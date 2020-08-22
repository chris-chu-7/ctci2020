class Solution {
    
    
    public String convert(String s, int numRows) {
        boolean isDown = true;
        String[] list = new String[numRows];
        String finalString = "";
        int row = 0;
        for(int i = 0; i < s.length(); i++){ 
            if(i % numRows == 0) isDown = true; 
            if(i % numRows == numRows - 1) isDown = false;
            if(isDown){
                System.out.println("Down");
                System.out.println(row + " " + Character.toString(s.charAt(i)));
                list[row] += Character.toString(s.charAt(i));
                row++;
            } else {
                System.out.println("Up");
                System.out.println(row + " " + Character.toString(s.charAt(i)));
                list[row] += Character.toString(s.charAt(i));
                row--;
            }  
            
        }
        for(int i = 0; i < list.length; i++){
            finalString += list[i];
        }
        return finalString; 
    }
    
    
}