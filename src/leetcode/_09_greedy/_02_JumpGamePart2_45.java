package leetcode._09_greedy;

public class _02_JumpGamePart2_45 {
    // TODO - Given a whole number array, where each element represent the max number of jumps we can take from that element's position
    //  we have to return the minimum number of jumps required to reach the array end or overcome it

    // ? Each element in the array represents the max number of steps you can jump from that position.
    // ! Goal: Find the minimum number of jumps to reach the last index from the first index.
    // ? Strategy: Use a greedy approach by scanning through "windows" defined by reachable ranges.
    // ? At each step, find the farthest index reachable from the current window (left to right).
    // ? Once the window is exhausted, increment jump count and slide the window to the new range.
    // ? Example: [2, 3, 1, 1, 4]
    // ? Step-by-step:
    // ? Initialize: jumps = 0, left = 0, right = 0 (starting window is just index 0)
    // * First window: indices [0 to 0]
    // ?   From index 0 → max jump = 0 + 2 = 2 → farthestPossibleJump = 2
    // ?   New window becomes [1 to 2], jumps = 1
    // * Second window: indices [1 to 2]
    // ?   From index 1 → max jump = 1 + 3 = 4
    // ?   From index 2 → max jump = 2 + 1 = 3 → max so far = 4
    // ?   New window becomes [3 to 4], jumps = 2
    // ? Now, right >= n - 1 → reached the end → return jumps = 2

    public static int jumpGame(int[] arr) {
        int jumps = 0;
        // Here left represents the left boundary of the window
        int left = 0;
        // right represents the rightmost index we can reach with max number of jumps (i + arr[i])
        int right = 0;
        int n = arr.length;

        // Once right >= n - 1, it means we've reached (or passed) the end of the array
        while (right < n - 1) {
            int farthestPossibleJump = 0;
            // Check the farthest jump possible from all elements in the current window
            for (int i = left; i <= right; i++) {
                farthestPossibleJump = Math.max(farthestPossibleJump, i + arr[i]);
            }
            // Start a new window:
            // The new left is just past the current right
            left = right + 1;
            // The new right is the farthest we can jump to from the current window
            right = farthestPossibleJump;
            // Increment the jump count after each window
            jumps++;
        }

        return jumps;
    }


    public static void main(String[] args) {
        System.out.println(jumpGame(new int[]{3, 1, 2, 1, 2, 2, 4, 6, 7}));
    }
}
