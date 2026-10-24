package leetcode._02_strings;

public class _16_SmallestLetterGreaterThanTarget_744 {
    // TODO - Given a letter array and a target character we have to find the letter which is the closest to the target excluding the target itself
    // TODO - if its present in the letter array
    // ex. letters = ["c","f","j"], target = "c" o/p -> f since its closest to target c
    // ex. letters = ["x","x","y","y"], target = "z" o/p - x, we have to return the first element in letters

    // ? Approach - We'll use a count array to store counts of letters
    // ? then we'll use the target element's ascii value to start iteration from val + 1 position and when we encounter
    // ? the first element with non-zero value in our count array we return that position's element

    public static char smallestLetter(char[] letters, char target){
        int[] countArray = new int[26];
        for (char ch: letters){
            int charPos = ch - 'a';
            countArray[charPos]++;
        }
        int targetPos = target - 'a';
        for (int i = targetPos+1; i<countArray.length; i++){
            if (countArray[i] > 0){
                return (char) (i+'a');
            }
        }
        return letters[0];
    }
    public static void main(String[] args) {
        System.out.println(smallestLetter(new char[] {'c', 'f', 'x'}, 'c'));
    }

}
