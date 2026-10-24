public class GfgSorting_SelectionSort {
    // We find the smallest element and put it at the first position
    // then we find the second smallest and put it at the second position and so on.
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElIdx]) {
                    minElIdx = j;
                }
            }
            int temp = arr[minElIdx];
            arr[minElIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] res = selectionSort(new int[]{23, 42, 41, 2, 322, 34, 121});
        for (int i : res) {
            System.out.println(i);
        }
    }

}
