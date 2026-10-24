package leetcode._11_bit_manipulation;

import java.util.Arrays;

public class _03_CountingBits_338 {
    public static int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int i=1;i<=n;i++){
            int count = 0;
            int j = i;
            while(j>0){
                j=j&(j-1);
                ans[i]++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }
}



























//public ArrayList<Integer> countBits(int n) {
//    ArrayList<Integer> res = new ArrayList<Integer>();
//    res.add(0);
//    for(int i = 1;i<=n;i++){
//        int count=0;
//        int j = i;
//        while(j>0){
//            j=j&(j-1);
//            count++;
//        }
//        res.add(count);
//    }
//    return res.stream().mapToInt(Integer::intValue).toArray();
//}









//ArrayList<Integer> ans = new ArrayList<>();
//        ans.add(0,0);
//        for(int i = 1; i<=n;i++){
//int count = 0;
//            while(i>0){
//i = i&(i-1);
//count++;
//        }
//        ans.add(count);
//        }
//                return ans;