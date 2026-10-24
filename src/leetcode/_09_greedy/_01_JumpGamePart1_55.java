package leetcode._09_greedy;

public class _01_JumpGamePart1_55 {
    // TODO - Given a whole number array, each element in it represent the maximum amount of steps we're allowed to take
    //  return true if we can reach the array end or pass it by taking arr[i] number of steps else return false
    //  ex. arr = [2,3,1,1,4]
    //  arr[0] = 2, so we're allowed to take 1 or 2 steps respectively
    //  with 1 step we reach arr[1] = 3 -> 1,2 or 3 steps allowed if we take 2 steps we'll reach arr[3] = 1 and by taking 1 step we'll reach array end
    //  with 2 step we reach arr[2] = 1 -> so 1 step allowed which moves us to arr[3] = 1 -> which by then taking moves us to array end so we return true

    // ? Each element in the array represents the max number of steps you can jump from that position.
    // ! Goal: Check if we can reach the last index starting from the first index.
    // ? Strategy: Start from the end and move backward, updating the "goal" to the left if a position can reach it.
    // ? Example: [2, 3, 1, 1, 4]
    // ? Step-by-step:
    // ? Index 4 is the destination (initial goal).
    // ? Check if index 3 (value = 1) can reach index 4 → 3 + 1 >= 4 → yes → update goal to 3
    // ? Check if index 2 (value = 1) can reach index 3 → 2 + 1 >= 3 → yes → update goal to 2
    // ? Check if index 1 (value = 3) can reach index 2 → 1 + 3 >= 2 → yes → update goal to 1
    // ? Check if index 0 (value = 2) can reach index 1 → 0 + 2 >= 1 → yes → update goal to 0
    // ? If we can move the goal all the way back to 0, return true.

    public static boolean jumpGame(int[] arr) {
        int n = arr.length;
        // Initially we assume the last element as goal
        int goalIdx = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            // Here i means the jump point and arr[i] means max number of jumps allowed
            // Check whether we can reach goal with current position
            if (i + arr[i] >= goalIdx) {
                // Move the goal to the current position
                goalIdx = i;
            }
        }
        // If we've moved the goal to the first index, return true
        return goalIdx == 0;
    }

    public static void main(String[] args) {
        System.out.println(jumpGame(new int[]{1, 2, 3, 1, 1, 0, 2, 5}));
    }

}
