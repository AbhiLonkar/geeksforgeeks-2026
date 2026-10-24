package leetcode._12_math;

public class _33_NumberOfDigitOne_233 {
    // TODO - Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
    // ex. 13 -> 1,2,3,4,5,6,7,8,9,10,11,12,13 -> 1,10,11,12,13 -> 6

    // ? Approach - Lets run a loop from 1 to n, for each i we'll calculate how many ones are present, we'll add this count to the global count and return the global count
    // ! TLE
    public static int totalOnes(int k) {
        int totalCount = 0;
        for (int i = 1; i <= k; i++) {
            totalCount += oneCounter(i);
        }
        return totalCount;
    }

    public static int oneCounter(int n) {
        int oneCount = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit == 1) {
                oneCount++;
            }
            n = n / 10;
        }
        return oneCount;
    }

    // ? Approach 2 - Using digitsOnRight & digitsOnLeft logic.
    public static int totalOneCount(int k) {
        int totalCount = 0;
        int remainingNum = k;
        int eachFullBlockOneContribution = 1;
        while (eachFullBlockOneContribution <= k) {
            int numberOfFullBlocks = k / (eachFullBlockOneContribution * 10);
            int lastDigit = remainingNum % 10;
            int lowerDigits = k % eachFullBlockOneContribution;

            // ? ex. 515 - So 51 blocks 0-9,10-11..19,20-21...29,..., 500-501...509,
            // ? Each block contributes single 1 so, 51 ones contributed

            // ? For hundreds place, get 0 blocks but what about 100-199 contributing 100 hundred place 1's.
            // ? Check the below condition
            totalCount += eachFullBlockOneContribution * numberOfFullBlocks;

            if (lastDigit == 1) {
                // ? Consider ex - 515, so for tens place there will be 5 full blocks 0-99, 100-199, 200-299, 300-399, 400-499, and partial block of 500-515
                // ! See only the tens place in above block, we're taking 3 digit nums because they too have tens place
                // ? Now the first 5 full blocks will contribute 50 ones in the tens place
                // ? Now the partial block currDigit = 1, lowerDigit = 5, the partial block contributes 510,511,512,513,514,515
                // ? We observe that the count is sum of currentDigit ie 1 & all the numbers that are formed with digits less than lowerDigit
                totalCount += lowerDigits + 1;
            } else if (lastDigit > 1) {
                // ? Consider ex. 515, for units place we calculated for up to 51 blocks 509, but what about 511 which has 1 at units place and is less than 515
                // ? So that's where this is added

                // ? Consider for hundreds place, 100-199 this block contributes 100 ones which was stored in eachFullBlockContribution
                // ? This is where we add that count
                totalCount += eachFullBlockOneContribution;
            }
            // Easier to calculate remainder
            remainingNum /= 10;

            // Each iteration we increase fullBlockCount - for units block each solo block contributes single 1
            // each solo Tens block contributes 10 ones
            // each solo hundred block contributes 100 ones and so on
            eachFullBlockOneContribution *= 10;
        }
        return totalCount;
    }


    public static void main(String[] args) {
        System.out.println(totalOnes(824883294));
    }
}