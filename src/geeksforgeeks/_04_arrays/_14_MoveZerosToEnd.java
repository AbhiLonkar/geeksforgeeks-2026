package geeksforgeeks._04_arrays;

public class _14_MoveZerosToEnd {
    // TODO - Given an array with zeros move the zeros to the end but still keep the order of the remaining elements
    // ex - {10,20,0,0,21,0,30,20,0} - {10,20,31,30,20,0,0,0,0}

    // ? Idea - First I need to find at which position we have a zero, then find at which position we have a non-zero number
    // ? Swap them both until we reach the end

    // ! Time complexity of O(n2)
    public static int[] MoveZerosToEnd(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
        return arr;
    }

    // ! Time complexity O(n) solution
    public static int[] MoveZerosToEndOptimized(int[] arr, int n) {
        int insertPos = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[insertPos];
                arr[insertPos] = arr[i];
                arr[i] = temp;
                insertPos++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] res = MoveZerosToEndOptimized(new int[]{10, 20, 0, 0, 21, 0, 30, 20, 0}, 9);
        for (int i : res) {
            System.out.println(i);
        }
    }

}
