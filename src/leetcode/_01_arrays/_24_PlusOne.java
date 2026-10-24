package leetcode._01_arrays;

public class _24_PlusOne {
    // TODO - Given a digit array, these digits when joined form a number,
    // TODO we have to add 1 to this number and then return an representing the digits of the number
    // ex. {1,2,3} which represents 123 add 1 to it, it becomes 124 output should be {1,2,4}
    // ex. {1,2,9} which represents 129 add 1 to it, it becomes 130 output should be {1,3,0}

    // ? Approach - For the arrays which don't have the last element as 9, simply add 1 to the last element and return
    // ? For arrays which do have last element as 9, we c
    // ? First try to form integer from the array
    // ? The logic would be that size of the array - 1 represents the units
    // ! Power fxn causes problem for large array sizes
    // ex. {1,2,3} so 3-1 = 2 so first digit should be 10^2*1 = 100, second digit should be 10^1*2 = 20, third digit should be 10^0*3 = 3
    // add them together we get 123
    public static int[] plusOne(int[] arr) {
        int num = 1;
        int n = arr.length - 1;
        for (int i : arr) {
            num += (int) (i * Math.pow(10, n));
            n--;
        }
        int arrSize = 0;
        int temp = num;
        while (temp > 0) {
            arrSize++;
            temp = temp / 10;
        }
        int[] res = new int[arrSize];
        while (num > 0) {
            int remainder = num % 10;
            num = num / 10;
            res[arrSize - 1] = remainder;
            arrSize--;
        }
        return res;
    }

    public static int[] plusOneV2(int[] arr) {
        int len = arr.length - 1;
        if (arr[len] != 9) {
            arr[len] += 1;
        } else {
            while (len >= 0 && arr[len] == 9) {
                arr[len] = 0;
                len--;
            }
        }
        return arr;
    }

    // ? Approach -
    // ? Case 1 - Digit lies in the range 0-8, over here we simply add 1 to it and return the result since there's no carry
    // ? Case 2 - Digit is 9, when we add 1 to 9 it becomes 0 and 1 is carried
    // ? But did you notice that 0 can be used to determine there'll be a carry or not
    // ? ex. After performing addition we can do modulo 10 with the result if it equals 0 there's a carry else no carry and return the array
    // ? For 9, 99, 999 we'll have to create a new array with length + 1 of the og array
    public static int[] plusOneV3(int[] arr) {
        int n = arr.length;
        for (int i = n-1; i>=0; i--){
            arr[i] += 1;
            arr[i] %= 10;
            if(arr[i]!=0){
                return arr;
            }
        }
        int[] newArr = new int[n+1];
        newArr[0] = 1;
        return newArr;
    }

    public static void main(String[] args) {
        int[] res = plusOneV3(new int[]{9,9,9});
        for (int i : res) {
            System.out.println(i);
        }
    }
}
