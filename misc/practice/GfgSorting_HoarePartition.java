public class GfgSorting_HoarePartition {
    public static int hoarePartition(int[] arr) {
        int left = -1;
        int right = arr.length;
        int pivot = arr[0];
        while (true) {
            do {
                left++;
            } while (arr[left] < pivot);
            do {
                right--;
            } while (arr[right] > pivot);
            if (left >= right) {
                return right;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println(hoarePartition(new int[] {4,2,1,3,5,6,7}));
    }
}
