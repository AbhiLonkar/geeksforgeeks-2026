package geeksforgeeks._04_arrays;

public class _11_MinimumConsecutiveFlips {
    // TODO - Given a binary array, we have to either flip the one's or the zeros depending on which has lesser groups
    // ex. {1,0,0,1,1,0,0,0,1,1,0,1}, here 1 has 4 groups & 0 has 3 groups so it would be better to flip 0's to 1's
    // O/p = From 1 to 2, From 5 to 7, From 11 to 11. Here the numbers represent the index

    // ? Idea - First find which has the least number of pairs
    // ? How? Traverse the array, keep a pointer and move it to the new element when inequality occurs

    public static void MinimumConsecutiveFlips(int[] arr) {
        int countOfOnesPairs = 0;
        int countOfZerosPairs = 0;
        int currElPointer = 0;
        for (int i = 0; i < arr.length; i++) {
            int x1 = 0;
            int x2 = 0;
        }
    }

    public static void main(String[] args) {

    }
}
