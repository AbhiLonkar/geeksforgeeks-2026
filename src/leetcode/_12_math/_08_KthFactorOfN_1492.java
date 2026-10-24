package leetcode._12_math;

import java.util.ArrayList;

public class _08_KthFactorOfN_1492 {
    // Given a number n and a position k, form an array of all the factors of number and return the factor at position
    // Else return -1
    // Problem - I can iterate only up to sqrt of n but how do I add n/i on the correct pos?
    // Approach 1, still errors
    public static int factorAtPos1(int n, int k){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(n);
        int startPos = 0;
        for(int i=2;i*i<=n;i++){
            startPos++;
            if(n%i==0){
                arr.add(startPos, i);
                if((n/i)!=i){
                    arr.add(startPos+1,n/i);
                }
            }
        }
        if(k<=arr.size()){
            return arr.get(k-1);
        }
        return -1;
    }
    // Approach 2
    public static int factorAtPos2(int n, int k){
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
            if(count==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(factorAtPos1(1000,3));
    }
}
