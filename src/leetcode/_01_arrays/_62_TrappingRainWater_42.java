package leetcode._01_arrays;

public class _62_TrappingRainWater_42 {
    // TODO - Given an integer array where each element represents a rock we have to find out how many blocks of water we can store between the boundaries of said rocks
    //  ex.  height = [0,1,0,2,1,0,1,3,2,1,2,1] o/p -> 6
    //  visualize over here - https://leetcode.com/problems/trapping-rain-water/description/?envType=problem-list-v2&envId=2qhu3fp7

    // ? Approach - We need to find the tallest rock on the left and right for a particular rock
    // * Why? Because only if the rocks are tall enough they can form sufficient boundary to trap the water

    // ? The formula to solve this problem is min(tallestLeft, tallestRight) - currHeight
    // * Why? Because the water storing capacity depends on the shorter of two boundaries
    // * Water cannot overflow over the shorter boundary, so we take the minimum
    // * The trapped water at this position is determined by how much higher the boundary is compared to the current rock's height
    // * If current rock taller than left and right rock no water can be trapped at this current position

    public static int trappingRainWater(int[] arr) {
        int n = arr.length;
        int[] tallestOnTheLeft = new int[n];
        tallestOnTheLeft[0] = 0;
        int[] tallestOnTheRight = new int[n];
        tallestOnTheRight[n - 1] = 0;

        // Populating the tallest buildings on left for a particular rock
        int leftCurrMax = 0;
        for (int i = 1; i < n; i++) {
            leftCurrMax = Math.max(leftCurrMax, arr[i - 1]);
            tallestOnTheLeft[i] = leftCurrMax;
        }
        // Populating the tallest buildings on right for a particular rock
        int rightCurrMax = 0;
        for (int i = n - 2; i >= 0; i--) {
            rightCurrMax = Math.max(rightCurrMax, arr[i + 1]);
            tallestOnTheRight[i] = rightCurrMax;
        }

        int waterVol = 0;
        for (int i = 0; i < n; i++) {
            int assumedVol = Math.min(tallestOnTheLeft[i], tallestOnTheRight[i]) - arr[i];
            if (assumedVol >= 0) {
                waterVol += assumedVol;
            }
        }

        return waterVol;
    }

    // ? Approach - 2
    public static int trappingRainWaterOpt(int[] arr) {
        int n = arr.length;
        int currLeftMax = arr[0];
        int currRightMax = arr[n - 1];
        int left = 0;
        int right = n - 1;
        int waterVol = 0;
        while (left < right) {
            // We focus on the left side because the left wall is smaller (or equal)
            if (arr[right] >= arr[left]) {
                // Calculate the difference between the current maximum wall on the left
                // and the current height at 'left' pointer
                int heightDiff = currLeftMax - arr[left];
                if (heightDiff >= 0) {
                    waterVol += heightDiff;
                }
                // Update currLeftMax if the current bar is taller
                currLeftMax = Math.max(currLeftMax, arr[left]);
                // Moving left forward
                left++;
            }

            // We focus on the right side because the right wall is smaller
            else {
                // Calculate the difference between the current maximum wall on the right
                // and the current height at 'right' pointer
                int diff = currRightMax - arr[right];
                if (diff >= 0) {
                    waterVol += diff;
                }
                // Update currRightMax if the current bar is taller
                currRightMax = Math.max(currRightMax, arr[right]);
                // Move pointer backwards
                right--;
            }
        }
        return waterVol;
    }

    public static void main(String[] args) {
        System.out.println(trappingRainWater(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
