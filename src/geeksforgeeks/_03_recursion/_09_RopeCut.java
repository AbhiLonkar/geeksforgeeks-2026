package geeksforgeeks._03_recursion;

public class _09_RopeCut {
    public static int maxCuts(int ropeLen, int cut1, int cut2, int cut3){
        if(ropeLen==0){
            return 0;
        }
        if(ropeLen<0){
            return -1;
        }
        int res = Math.max(Math.max(maxCuts(ropeLen - cut1, cut1, cut2, cut3),
                                    maxCuts(ropeLen - cut2, cut1, cut2, cut3)),
                                    maxCuts(ropeLen - cut3, cut1, cut2, cut3));
        if(res==-1){
            return -1;
        }
        return res+1;
    }
    public static void main(String[] args) {
        System.out.println(maxCuts(10, 3,5,2));
    }
}
