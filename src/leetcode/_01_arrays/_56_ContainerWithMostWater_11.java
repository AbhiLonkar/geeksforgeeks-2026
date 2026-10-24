package leetcode._01_arrays;

public class _56_ContainerWithMostWater_11 {
    // TODO - We're given an integer array, the elements in this integer array represents bars of a bucket
    //  We have to find the max area which can be formed by the bucket
    //  Check this photo of the graph for the example - https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg

    // ? Approach - We'll use 2 pointers
    // ? Problem 1 - How to find the area? Ans -> width(r-l) * height(min(arr[l], arr[r]));
    // ? Problem 2 - How to move the pointers
    // ? Case 1 - the pointer which has the lowest value will be moved. Left will be moved forward and right backwards
    // ! Apparently there wasn't any need for bottom check
    // * Trial Case 2 - If they're both equal lets compare the values next to them
    // * If the left+1 is greater we'll move left forward if right-1 is greater we'll move right backwards

    public static int mostWater(int[] arr) {
        int l = 0, r = arr.length - 1;
        int maxArea = Integer.MIN_VALUE;
        while (l < r) {
            int area = (r - l) * Math.min(arr[l], arr[r]);
            maxArea = Math.max(maxArea, area);
            if (arr[l] < arr[r]) {
                l++;
            } else if (arr[l] > arr[r]) {
                r--;
            } else {
                if (arr[l + 1] > arr[r - 1]) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(mostWater(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

}
