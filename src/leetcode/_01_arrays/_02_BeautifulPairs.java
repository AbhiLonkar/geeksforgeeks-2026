package leetcode._01_arrays;

public class _02_BeautifulPairs {
    // Problem Statement - Given an integer array return the total number of beautiful pairs present in the array.
    // A beautiful pair is a pair of 2 numbers in which the first digit of the first number & the last digit of the second number are co-prime.
    // Meaning that they only have 1 as their greatest common divisor

    // * Constraints -
    // 2 <= nums.length <= 100
    // 1 <= nums[i] <= 9999
    // nums[i] % 10 != 0

    // Since the array is small we can go with a double for loop
    // I can find the last digit, but I'm thinking of a quicker way to find the first digit

    public static int GCD(int num1, int num2){
        if(num2==0){
            return num1;
        }
        return GCD(num2, num1%num2);
    }

    // ! Mistakes - Recalculating first digit in the inner loop
    // ? Learnt - How to extract the first digit of a number without the inbuilt conversion methods

    public static int BeautifulPairs(int[] nums){
        int count = 0;
        for(int i = 0;i<nums.length-1;i++){
            int firstDigit = nums[i];
            while(firstDigit>=10){
                firstDigit /= 10;
            }
            for(int j = i+1;j<nums.length;j++){
                int lastDigit = nums[j]%10;
                if(GCD(firstDigit, lastDigit)==1){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(BeautifulPairs(new int[] {11,21,12}));
    }
}
