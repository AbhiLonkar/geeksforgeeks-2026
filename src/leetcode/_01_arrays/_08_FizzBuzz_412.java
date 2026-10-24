package leetcode._01_arrays;

import java.util.ArrayList;
import java.util.List;

public class _08_FizzBuzz_412 {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();

        for (int num = 1; num <= n; ++num) {
            String current = "";

            if (num % 3 == 0) {
                current += "Fizz";
            }

            if (num % 5 == 0) {
                current += "Buzz";
            }


            if (current.isEmpty()) {
                current += Integer.toString(num);
            }

            answer.add(current);
        }

        return answer;
    }
}
