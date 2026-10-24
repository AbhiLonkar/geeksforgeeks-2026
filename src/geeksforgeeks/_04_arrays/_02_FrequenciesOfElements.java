package geeksforgeeks._04_arrays;

import java.util.HashMap;

public class _02_FrequenciesOfElements {
    // TODO - Given a sorted array return the count of the elements
    // ! Array is sorted
    // ex. {1,1,1,2,2,2,3,4,4,4,6,7}
    // 1 = 3, 2=3, 3=1, 4=3, 6=1, 7=1

    // ? Method 1 Idea - Double for loop
    public static void FrequenciesOfElements(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i<n){
            int count = 1;
            // * i+1 is here because we're comparing ith element with the (i+1)th element and don't want to go out of bounds by doing i<n.
            while(i+1<n && arr[i] == arr[i+1]){
                count++;
                i++;
            }
            System.out.println(arr[i]+":"+count);
            i++;
        }
    }

    // ? Method 2 Idea - Use a hashmap
    public static void FrequenciesOfElementsHashMap(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int el : arr) {
            if (countMap.containsKey(el)) {
                countMap.put(el, countMap.get(el) + 1);
            } else {
                countMap.put(el, 1);
            }
        }
        countMap.forEach((key, value) -> {
            System.out.println(key + ":" + value);

        });
        System.out.println(countMap.size());
    }

    public static void main(String[] args) {
        FrequenciesOfElements(new int[]{1, 1, 2, 2, 3, 4, 4, 6, 7});
    }
}
