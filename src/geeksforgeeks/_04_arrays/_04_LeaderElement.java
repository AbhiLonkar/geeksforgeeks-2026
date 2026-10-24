package geeksforgeeks._04_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _04_LeaderElement {
    // TODO - Given an integer array, return leader elements.
    // * Leader elements are those elements who don't have an element greater than themselves on their right.
    // ! Note: Equals on the right disqualifies that number
    // ex. {7,54,3,1,3,5,9,21,13} o/p -> 54, 21, 13

    // ? Idea - First approach would be to go for a double for loop.
    public static void LeaderElement(int[] arr) {
        boolean isLeader = true; // flag to check whether the currEl meets the condition.
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) { // If it doesn't meet the condition, it isn't a leader.
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                // If at the end of the above for loop the isLeader remains true, ie. there doesn't exist a single greater element
                // then print it
                System.out.println(arr[i]);
            }
            isLeader = true; // Reset the flag, because in the nested for loop it can be set to false and will remain false forever if we don't reset at the end of the iteration.
        }
    }

    // ? Idea - How about we traverse the array from the end, we know that the last element is always the leader.
    // ? What we'll do is that, we compare the element on the left of current leader, if it's greater, then it's the new leader and we print it.
    // ? We'll continue this till we reach the start

    public static void LeaderElementOptimizedLeaner(int[] arr) {
        int len = arr.length;
        int currLeader = arr[len - 1]; // Last element will always be the leader
        System.out.println(currLeader);
        for (int i = len - 2; i >= 0; i--) { // Compare the elements on the left of currLeader, if they're greater make the element currLeader and print it.
            int currElement = arr[i];
            if (currElement > currLeader) {
                currLeader = currElement;
                System.out.println(currLeader);
            }
        }
    }

    public static void LeaderElementOptimizedArrayVer(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = arr.length;
        int currLeader = arr[len - 1]; // Last element will always be the leader
        list.add(currLeader);
        for (int i = len - 2; i >= 0; i--) { // Compare the elements on the left of currLeader, if they're greater make the element currLeader and print it.
            int currElement = arr[i];
            if (currElement > currLeader) {
                currLeader = currElement;
                list.add(currLeader);
            }
        }
        ArrayList<Integer> res = ReverseArray(list);
        for (int i: res){
            System.out.println(i);
        }
    }
    public static ArrayList<Integer> ReverseArray(ArrayList<Integer> arr) {
        // {1,2,3,4} -> {4,3,2,1}
        int left = 0;
        int right = arr.size() - 1;
        while (left <= right) {
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++;
            right--;
        }
        return arr;
    }

    public static void main(String[] args) {
        LeaderElementOptimizedArrayVer(new int[]{7, 54, 3, 1, 31, 5, 9, 21, 13, 10});
    }

}
