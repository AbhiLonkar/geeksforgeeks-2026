package leetcode._05_sorting;

public class _01_MergeTwoSortedArr_88 {
    // TODO - Given 2 sorted arrays return the combined sorted arr
    public static int[] mergeTwoSortedArr(int[] arr1, int[] arr2, int m, int n) {
        int[] temp = new int[m];
        System.arraycopy(arr1, 0, temp, 0, m);
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        while (i1<m && i2<n){
            if (temp[i1]<=arr2[i2]){
                arr1[i3] = temp[i1];
                i1++;
            }
            else {
                arr1[i3] = arr2[i2];
                i2++;
            }
            i3++;
        }
        while (i1<m){
            arr1[i3] = temp[i1];
            i3++;
            i1++;
        }
        while (i2<n){
            arr1[i3] = arr2[i2];
            i2++;
            i3++;
        }
        return arr1;
    }
    public static void main(String[] args) {
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};
        int m = 3;
        int n = 3;
        int[] res = mergeTwoSortedArr(n1, n2, m, n);
        for (int i: res){
            System.out.println(i);
        }
    }
}
