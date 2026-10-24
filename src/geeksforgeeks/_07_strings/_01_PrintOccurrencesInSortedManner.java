package geeksforgeeks._07_strings;

import java.util.*;
public class _01_PrintOccurrencesInSortedManner {
    // TODO - Given a string we have to print the count of occurrences of a character and the order must be in the increasing order.
    // ! All characters are lowercase
    // ex. geeksforgeeks should give me e first and s at the end.

    // ? Approach 1 - Lets use a hashmap to store the count.
    // * Time = O(nlogn) from sorting the arraylist & Space = O(n) from the hashmap or the array
    public static void printOccurrences(String str){
        HashMap<Character, Integer> countsMap = new HashMap<>();
        for (int i = 0; i< str.length(); i++){
            if (countsMap.containsKey(str.charAt(i))){
                countsMap.put(str.charAt(i), countsMap.get(str.charAt(i)) + 1);
            }
            else {
                countsMap.put(str.charAt(i), 1);
            }
        }
        ArrayList<Character> l1 = new ArrayList<>(countsMap.keySet());
        Collections.sort(l1);
        for (char k: l1){
            System.out.println(k + "->" + countsMap.get(k));
        }
    }

    // ? Approach 2 - Using the fact that characters have ascii values
    // Lets create an array of size 26 and we'll put the counts as the array entries and the ascii value as the index
    public static void printOccurrencesOptimized(String str){
        int[] arr = new int[26];
        for (int i = 0; i<str.length(); i++){
            int charPos = str.charAt(i) - 'a';
            arr[charPos]++;
        }
        for (int i = 0; i<26; i++){
            if (arr[i]!=0){
                int charAscii = i + 'a';
                System.out.println((char) charAscii + "->" + arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        printOccurrencesOptimized("abhishek");
    }
}
