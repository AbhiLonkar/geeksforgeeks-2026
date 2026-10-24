package leetcode._04_binary_search;

public class _03_MaxCountOfPositivesAndNegatives_2529 {
    // TODO - Given a sorted integer array we have to find the number of positives and negatives in this array then
    //  whichever one has greater count we return it
    //  ex. {-4,-3,-2,-1,-1,0,1,2,3,} -> Over here we've got 5 negatives and 3 positives so we return 5

    // ? Approach - This problem can be solved in brute force by creating 2 arrays which store positives and negatives and then returning the length of the larger array

    // ? It can be solved in logn time using binary search
    // ? How? What we'll do is that we'll find the first occurence of the positive number
    // ? Now we can use the first occurence's index (positive) to find last occurence of negative num
    // ? In case element at firstOccIdx - 1 is a negative itself we don't need a while loop to find the last occurence
    // ? But if element at firstOccIdx - 1 is 0 we need a while loop to keep on decrementing till we find a negative number
    // ? At the end we simply do lastOccIdx - 0 + 1 and arr length - firstOccIdx + 1 then we'll return whichever one which is larger

    public static int maxCount(int[] arr) {
        int n = arr.length;
        int firstOccIdx = -1;
        int start = 0;
        int end = n - 1;
        if (arr[start] > 0 || arr[end] < 0) {
            return n;
        }
        if (arr[start]==0 && arr[end]==0){
            return 0;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == n - 1) {
                firstOccIdx = mid;
                break;
            }
            if (arr[mid] > 0) {
                if (mid > 0 && arr[mid - 1] > 0) {
                    end = mid - 1;
                } else {
                    firstOccIdx = mid;
                    break;
                }
            } else {
                start = mid + 1;
            }
        }
        int lastNegOccIdx = firstOccIdx - 1;
        if (arr[lastNegOccIdx] == 0) {
            while (lastNegOccIdx > 0 && arr[lastNegOccIdx] == 0) {
                lastNegOccIdx--;
            }
        }
        return Math.max(lastNegOccIdx + 1, n - firstOccIdx);
    }

    public static void main(String[] args) {
        System.out.println(maxCount(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }
}
