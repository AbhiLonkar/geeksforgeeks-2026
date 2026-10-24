package geeksforgeeks._04_arrays;

public class _13_MostConsecutiveOnes {
    // TODO - Given a binary array return the count of 1's most consecutive times.
    // ex. {0,1,1,1,0,0,1} So the max count of consecutive ones is 3
    public static int MostConsecutiveOnes(int[] arr){
        int maxCount = 0;
        int contiguousOnesCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                contiguousOnesCount++;
            }
            if (arr[i]==0 || i+1==arr.length){
                maxCount = Math.max(maxCount, contiguousOnesCount);
                contiguousOnesCount =0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        System.out.println(MostConsecutiveOnes(new int[] {1,1,1,1}));
    }
}
