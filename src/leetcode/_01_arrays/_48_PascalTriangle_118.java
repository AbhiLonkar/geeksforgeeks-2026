package leetcode._01_arrays;

import java.util.*;

public class _48_PascalTriangle_118 {
    // TODO - Given a number n we have to form a list of lists which has numbers filled using pascal triangle logic
    //  ex. numRows = 5
    //  Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
    //  See the logic here -> https://leetcode.com/problems/pascals-triangle/description/

    // ? Approach -
    public static boolean areNumbersAscending(String s) {
        List<Character> res = new ArrayList<>();
        for (char ch: s.toCharArray()){
            if (Character.isDigit(ch)){
                res.add(ch);
                if (res.size()>=2){
                    if (res.get(res.size()-1) <= res.get(res.size()-2)){
                        return false;
                    }
                }
            }
        }
        return true;
    }



    public static void main(String[] args) {
    }
}
