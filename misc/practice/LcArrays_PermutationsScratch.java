import java.util.*;
public class LcArrays_PermutationsScratch {
    public static List<List<Integer>> resultList = new ArrayList<>();
    public static List<Integer> currPermList = new ArrayList<>();
    public static boolean[] isVisited;
    public static int[] elements;

    public static void backTrack(int idx){
        if (idx == elements.length){
            resultList.add(new ArrayList<>(currPermList));
            return;
        }
        for (int i = 0; i<elements.length; i++){
            if (!isVisited[i]){
                isVisited[i] = true;
                currPermList.add(elements[i]);
                backTrack(idx+1);
                currPermList.remove(currPermList.size() - 1);
                isVisited[i] = false;
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        elements = nums;
        isVisited = new boolean[nums.length];
        backTrack(0);
        return resultList;
    }

    public static void main(String[] args) {
        System.out.println( permute(new int[] {0, 1}));
    }

}