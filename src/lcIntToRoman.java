class Solution {
    public String intToRoman(int num) {
        String[] ones = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] tens = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC", "C"};
        String[] hundreds = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM", "M"};
        String[] thousands = {"M", "MM", "MMM"};
        
        int divThousand = num / 1000;
        int divHundred = (num - (divThousand * 1000)) / 100;
        int divTens = (num - (divThousand * 1000) - (divHundred * 100)) / 10;
        int divOne = (num - (divThousand * 1000) - (divHundred * 100) - (divTens * 10));
        
        String finalString = "";
        String thousandsString = (divThousand == 0) ? "" : thousands[divThousand - 1];
        finalString += thousandsString; 
        String hundredsString = (divHundred == 0) ? "" : hundreds[divHundred - 1];
        finalString += hundredsString;
        String tensString = (divTens == 0) ? "" : tens[divTens - 1];
        finalString += tensString;
        String onesString = (divOne == 0) ? "" : ones[divOne - 1];
        finalString += onesString;
        return finalString;    
    }
}