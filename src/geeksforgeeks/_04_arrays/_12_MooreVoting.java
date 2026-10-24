package geeksforgeeks._04_arrays;

public class _12_MooreVoting {
    // TODO - Given an array return the element which occurs more than n/2 times. Here n is the length

    // ? Moore Voting - The basic idea behind this algo is that when we encounter a new element we decrement the count of the current element.
    // ? And when the count becomes 0 a new candidate is set, and it's count is set to 1.

    public static int MooreVoting(int[] arr){
        int count = 0;
        int candidate = 0;
        for (int num : arr) {
            if (count == 0) {
                // When the count becomes zero, there's no occurence of the element, so new element takes control
                candidate = num;
                count++;
            } else {
                // If we have the same element increment the count
                if (num == candidate) {
                    count++;
                }
                // When found a new element decrement the current candidate's count
                else {
                    count--;
                }
            }
        }
        return candidate;
    }
    public static void main(String[] args) {
        System.out.println(MooreVoting(new int[] {1, 3, 4, 2, 4, 7}));
    }
}
