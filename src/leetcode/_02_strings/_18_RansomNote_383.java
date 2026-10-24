package leetcode._02_strings;

public class _18_RansomNote_383 {
    // TODO - Given 2 strings ransom and magazine we have to return true if its possible to form ransom from magazine character to character
    //  ex. ransom = 'aa', magazine = 'ab' -> false we need 2 a's from magazine but it only has 1 so we return false
    //  ex. ransom = "aa", magazine = "aab" -> true, we only need 2 a's from magazine which are available so we return true

    // ? Approach - We'll create a counts array, we'll store all occurrences of characters of magazine in this array
    // ? We'll iterate through ransom decreasing the count for every occurrence of ransom char in counts array
    // ? If we encounter a 0 in the counts array for a particular ransom char then we cannot form ransom from magazine so we simply return false

    public static boolean ransomNote(String ransom, String magazine){
        int[] countsArray = new int[26];
        for (char ch: magazine.toCharArray()){
            int charPos = ch - 'a';
            countsArray[charPos]++;
        }
        for (char ch: ransom.toCharArray()){
            int charPos = ch - 'a';
            if (countsArray[charPos] == 0){
                return false;
            }
            else {
                countsArray[charPos]--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(ransomNote("aa", "aab"));
    }
}
