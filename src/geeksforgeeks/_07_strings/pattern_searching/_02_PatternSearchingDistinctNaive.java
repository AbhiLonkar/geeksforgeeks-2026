package geeksforgeeks._07_strings.pattern_searching;

public class _02_PatternSearchingDistinctNaive {
    // TODO - Given a string and a target string with all distinct characters we have to find the occurence index of target in the string.
    // ex. s1 -> "ABCDAEW" target -> "AEW" o/p -> 4. Target string AEW starts at index 4 in s1.

    // ? Approach - We keep 2 pointers to iterate through s1 & target, we keep on increasing 2nd pointer till we find a target character that isn't present in s1
    // ? If we do break the 2 pointer loop and if the second pointer equals length of the target string we print i1 and move the starting point forward by i+j pos
    // ex. "ABCEABCD" target - "ABCD" -> char at s1(i1+i2) & target(i2) match move i2 forward, char at s1(i1+i2) & target(i2) match move i2 forward, char at s1(i1+i2) & target(i2) match move i2 forward,
    // ex. at i2 = 3 s1(i1+i2) and target(i2) don't match so move i1 to i1+i2
    // ex. same iteration and we find the target present in s1 so output i1.

    // * Time is Theta(l1) not O(l1*l2) because for every iteration through target we're moving i1 forward by i1+i2 position
    // Therefore we're negating the single single iteration in s1 by moving it i1 + i2 positions forward in one go itself.
    public static void patternSearch(String s1, String target) {
        int l1 = s1.length();
        int l2 = target.length();
        int i1 = 0;
        while (i1 <= l1 - l2) {
            int i2;
            for (i2 = 0; i2<l2; i2++){
                if (s1.charAt(i1+i2) != target.charAt(i2)){
                    break;
                }
            }
            if (i2==l2){
                System.out.println(i1);
                break;
            }
            if (i2==0){
                i1++;
            }
            else {
                i1 = i1+i2;
            }
        }
    }

    public static void main(String[] args) {
        patternSearch("mississippi", "issip");
    }
}
