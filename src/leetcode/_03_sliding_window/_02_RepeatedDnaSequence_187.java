package leetcode._03_sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class _02_RepeatedDnaSequence_187 {
    // TODO - Given a string s, we have to find the DNA sequences in s that occur more than once
    // TODO - The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'
    // ! 1 <= s.length <= 105 & s[i] is either 'A', 'C', 'G', or 'T'.
    // ex. s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
    // "AAAAACCCCC"  ✅ (occurs twice)
    // "AAAACCCCCA"  ❌ (unique)
    // "AAACCCCCAA"  ❌ (unique)
    // "AACCCCCAAA"  ❌ (unique)
    // "ACCCCCAAAA"  ❌ (unique)
    // "CCCCCAAAAA"  ✅ (occurs twice)
    // "CCCCAAAAAC"  ❌ (unique)
    // "CCCAAAAACC"  ❌ (unique)
    // "CCAAAAACCC"  ❌ (unique)
    // "CAAAAACCCC"  ❌ (unique)
    // "AAAAACCCCC"  ✅ (again found)

    // ? Approach - We're only dealing with a fixed window size of 10
    // ? We'll form a window of size 10 (substring) we'll put this substring in the map if it doesn't exists, if it already exists in the map
    // ? then we'll put it in the results array

    // * Subproblem 1 - Create a hashmap and store the dna sequence's count
    public static List<String> repeatedDnaSequence(String s){
        ArrayList<String> res = new ArrayList<>();
        HashMap<String, Integer> countsMap = new HashMap<>();
        for (int i = 0; i<=s.length()-10; i++){
            String currString = s.substring(i, i+10);
            if (!countsMap.containsKey(currString)){
               countsMap.put(currString, 1);
            }
            else {
                countsMap.put(currString, countsMap.get(currString)+1);
            }
        }
        for (String seq: countsMap.keySet()){
            if (countsMap.get(seq)>1){
                res.add(seq);
            }
        }
        return res;
    }

    // ? Using a hashset, we'll keep 2 hashsets encounteredOnce and encounteredMoreThanOnce,
    // ? when we can add the sequence to the encounteredOnce we cannot add it to encounteredMoreThanOnce because hashset does not allow duplicate entries

    public static List<String> repeatedDnaSequenceOptimized(String s){
        HashSet<String> encounteredOnce = new HashSet<>();
        HashSet<String> encounteredMoreThanOnce = new HashSet<>();
        for (int i = 0; i<=s.length()-10; i++){
            String sub = s.substring(i, i+10);
            if (!encounteredOnce.add(sub)){
                encounteredMoreThanOnce.add(sub);
            }
        }
        return new ArrayList<>(encounteredMoreThanOnce);
    }

    public static void main(String[] args) {
        System.out.println((repeatedDnaSequence("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT")));
    }
}
