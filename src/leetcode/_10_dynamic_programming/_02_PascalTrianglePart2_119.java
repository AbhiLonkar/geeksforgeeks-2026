package leetcode._10_dynamic_programming;

import java.util.ArrayList;
import java.util.List;

public class _02_PascalTrianglePart2_119 {
    // TODO Given a row number of a pascal triangle return a list of all the entries of that particular row
    public static List<Integer> pascalTriangle(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            // Add a placeholder at the end
            res.add(0);

            // Update in reverse to prevent overwriting
            for (int j = i; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
        }

        return res;
    }


    public static void main(String[] args) {
        System.out.println(pascalTriangle(5));
    }
}
