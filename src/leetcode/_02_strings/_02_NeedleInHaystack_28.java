package leetcode._02_strings;

public class _02_NeedleInHaystack_28 {
    // TODO - Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
    //  TODO or -1 if needle is not part of haystack.

    // ? Approach - This is a pattern searching problem
    // ? We'll keep 2 pointers i1 & i2, we'll iterate through i2 check presence of charAt(i2) at pos i1, we'll move i1 if not present and i2 if char present
    // ? By how much should we move - if i2 is not zero then we move forward in haystack by i1+i2 positions

    public static int patternSearch(String haystack, String needle){
        int h = haystack.length();
        int n = needle.length();
        int i1 = 0;
        while (i1<=h-n){
            int i2;
            for (i2=0; i2<n; i2++){
                if (haystack.charAt(i1+i2)!=needle.charAt(i2)){
                    break;
                }
            }
            if (i2==n){
                return i1;
            }
            if (i2==0){
                i1++;
            }
            else {
                i1 = i1+i2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(patternSearch("mississippi", "issip"));
    }
}
