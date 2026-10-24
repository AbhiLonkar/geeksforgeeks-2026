package leetcode._02_strings;

public class _38_RegexMatching_10 {
    // TODO - Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*'
    //  where -
    //  '.' Matches any single character.
    //  '*' Matches zero or more of the preceding element.
    //  The matching should cover the entire input string (not partial).

    // ex. s = "aa" p = "a*" repeating a two times we get s so true
    // ex. s = "ab" p = ".*" means p = ".." and since . can be any character we return true

    // ? Approach - We'll create a matrix in which we'll store true if a match can be found else false

    public static boolean regexMatching(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean[][] table = new boolean[n+1][m+1];

        // Empty p can match with empty s
        table[0][0] = true;

        for (int j = 2; j<m; j+=2){
            if (p.charAt(j-1) == '*' && table[0][j-2]){
                table[0][j] = true;
            }
        }

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=m; j++){
                char currS = s.charAt(i-1);
                char currP = p.charAt(j-1);
                if (currP == '.' || currP == currS){
                    table[i][j] = table[i-1][j-1];
                }
                else if (currP == '*'){
                    char prev = p.charAt(j-2);
                    table[i][j] = table[i][j-2];
                    if (prev == '.' || prev == currS){
                        table[i][j] = table[i][j] || table[i-1][j];
                    }
                }
            }
        }

        return table[n][m];

    }

    public static void main(String[] args) {

    }

}
