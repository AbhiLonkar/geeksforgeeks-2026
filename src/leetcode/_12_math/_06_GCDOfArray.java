package leetcode._12_math;

import java.util.Arrays;
public class _06_GCDOfArray {
    public static int GCD(int num1, int num2){
        if(num2==0){
            return num1;
        }
        return GCD(num2, num1%num2);
    }
    public static int GCD_Array(int[] nums){
        Arrays.sort(nums);
        return GCD(nums[0], nums[nums.length-1]);
    }
    public static void main(String[] args) {
        int[] x = new int[]{7,8,9};
        System.out.println(GCD_Array(x));
    }
}
