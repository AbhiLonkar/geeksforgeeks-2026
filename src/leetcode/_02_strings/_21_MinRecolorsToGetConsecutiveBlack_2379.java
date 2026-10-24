package leetcode._02_strings;

public class _21_MinRecolorsToGetConsecutiveBlack_2379 {
    // TODO - Given a string and an integer k, here k denotes the length of the substring which contains only black letters
    //  So what we have to do is that we have to meet length k condition and within that length we have to flip letter W to B
    //  We have to form such a string that meets k size conditions but also minimum flips from W to B

    // ex. blocks = "WBBWWBBWBW", k = 7
    //               0123456789
    // Possible windows - 0 - 6 -> WBBWWBB, in this we need 3 flips
    // 1 - 7 -> BBWWBBW -> in this we need 3 flips
    // 2 - 8 -> BWWBBWB -> in this we need 3 flips
    // 3 - 9 -> WWBBWBW -> in this we need 4 flips
    // Output 3 since minimum is 3

    // ? The problem now just reduces to -
    // ? For a window of size k we simply have to find how many 'W' are present in it
    // ? We keep minimum count over here

    public static int minimumRecolors(String s, int k) {
        int res = 0;
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'W') {
                res++;
            }
        }
        int currRes = res;
        for (int i = k; i < s.length(); i++) {
            // If the character at the i - k pos ex. if at 0 position we have W we need to subtract it from the result
            if (s.charAt(i - k) == 'W') {
                currRes--;
            }
            // If the character at the i pos ex. if at 7 position we have W we need to add it from the result
            if (s.charAt(i) == 'W') {
                currRes++;
            }
            // We'll update the result
            res = Math.min(currRes, res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBBWWBBWBW", 7));
    }
}
