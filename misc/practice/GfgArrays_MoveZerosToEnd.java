public class GfgArrays_MoveZerosToEnd {
    public static void MoveZeros(int[] nums){
        int nonZeroElementInsertPos = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[nonZeroElementInsertPos];
                nums[nonZeroElementInsertPos] = nums[i];
                nums[i] = temp;
                nonZeroElementInsertPos++;
            }
        }
    }
    public static void main(String[] args) {
        MoveZeros(new int[] {1,0,1,2,0,5,0});
    }
}
