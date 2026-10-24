package leetcode._02_strings;

public class _31_ZigzagCoversion_6 {
    // TODO - Given a string and number of rows we have to convert the string in the zigzag pattern and then return the string formed by the rows
    // ex. PAYPALISHIRING, rows = 4
    // P        I      N
    // A     L  S    I G
    // Y  A     H  R
    // p        I
    // o.p -> PINALSIGYAHRPI

    // ? Approach - Form numberofrows - 1 number of stringbuilders
    // ? Put all these stringbuilders in an array, think each of these sbs as a row
    // ? Now to add elements at the 0th index, we'll keep a boolean to show whether we're going up or down
    // ? When we're at the top (go down) we'll set this boolean true and when we're at bottom we'll set this boolean false (go up)
    // ? We'll add the corresponding letter to its also corresponding string builder

    public static String zigzagConversion(String s, int rows) {
        StringBuilder[] sbArray = new StringBuilder[rows];
        for (int i = 0; i < rows; i++) {
            // Adding empty string builders to the array
            // Each array element represents a stringbuilder row
            sbArray[i] = new StringBuilder();
        }
        int currSbIdx = 0;
        boolean goingDown = false;
        for (char ch : s.toCharArray()) {
            sbArray[currSbIdx].append(ch);
            if (currSbIdx == 0 || currSbIdx == rows - 1) {
                goingDown = !goingDown;
            }
            if (goingDown){
                // means we need to move down in the sbArray
                currSbIdx++;
            }
            else {
                // means we need to move up in the sbArray
                currSbIdx--;
            }

        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb: sbArray){
            res.append(sb);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(zigzagConversion("PAYPALISHIRING", 3));
    }

}
