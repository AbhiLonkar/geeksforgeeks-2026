package leetcode._01_arrays;

public class _17_MaxConsecutiveOnes_485 {
    // TODO - Given a binary array return the count of max number of consecutive ones;
    // ex. {1,1,0,0,0,1,1,1,1} o/p = 4

    // ? Approach - Using kadane's algo. Update resultLen when currSubArrayLen exceeds its value.
    // ? Make a choice to extend the subarray when the current element is equal to 1.

    public static int maxConsecutiveOnes(int[] arr) {
        int resultLen = 0;
        int currSubArrayLen = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                currSubArrayLen++;
                resultLen = Math.max(resultLen, currSubArrayLen);
            } else {
                currSubArrayLen = 0;
            }
        }
        return resultLen;
    }

    public static void main(String[] args) {
        System.out.println(maxConsecutiveOnes(new int[]{1, 1, 0, 0, 0, 1, 1, 1, 1}));
    }

}
