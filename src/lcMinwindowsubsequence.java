class Solution {

    public String minWindow(String S, String T){

        if(S == null || T == null) return "";

        int n = S.length();

        int m = T.length();

        int[][] f = new int[n + 1, m + 1];

        for(int j = 1; j <= m; j++) {

            f[0][j] = Integer.MAX_VALUE/2;

        }

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= m; j++) {

                if(S.charAt(i - 1) == T.charAt(j - 1)){

                    f[i][j] = f[i - 1][j - 1] + 1;

                } else {

                    f[i][j] = f[i  - 1][j] + 1;

                }   

            }

        }

        int minLen = Integer.MAX_VALUE;

        int idx = Integer.MAX_VALUE;

        for(int i = 1; i <= n; i++){

            if(f[i][m] < minLen){

                minLen = f[i][m];

                idx = i;      

            }

        }

        return minLen > n ? "" : S.substring(idx - minLen, idx);

    }

}

