import java.util.Arrays;
import java.util.HashMap;

public class GfgArrays_FrequencyOfElementsV2 {
    // TODO Given an array return the count of elements
    // Method 1 Using Hashmap
    public static void Counter(int[] arr){
        HashMap<Integer, Integer> countsMap = new HashMap<>();
        for (int j : arr) {
            if (countsMap.containsKey(j)) {
                countsMap.put(j, countsMap.get(j) + 1);
            } else {
                countsMap.put(j, 1);
            }
        }
        for(int i: countsMap.keySet()){
            System.out.println(i+":"+countsMap.get(i));
        }
    }

    // Method 2 Using for loop and sorting
    public static void CounterForLoop(int[] arr){
        Arrays.sort(arr);
        int currElPointer = 0;
        while(currElPointer<arr.length){
            int count = 1;
            while(arr[currElPointer]==arr[currElPointer+1] && (currElPointer+1)<arr.length){
                count++;
                currElPointer++;
            }
            System.out.println(arr[currElPointer]+":"+count);
        }
    }

    public static void main(String[] args) {
        Counter(new int[] {1,1,2,2,3,4});
    }
}
