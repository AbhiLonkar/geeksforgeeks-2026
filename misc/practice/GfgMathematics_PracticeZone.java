import java.util.Arrays;

public class GfgMathematics_PracticeZone {
    // Checks if only 3 divisors or not
//    public static boolean isThree(int n) {
//        int count=0;
//        for (int i = 1; i <= Math.sqrt(n); i++) {
//            if (n % i == 0) {
//                count++;
//            }
//        }
//        for (int i = (int) Math.sqrt(n)+1; i <= n; i++) {
//            if (n % i == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
//        return count == 3;
//    }

    public static boolean[] sieveOfEratosthenes(int num){
        boolean[] Jack = new boolean[num+1];
        Arrays.fill(Jack, true);

        Jack[0] = false;
        Jack[1] = false;

        for(int q=2; q<=Math.sqrt(num); q++){
            if(Jack[q]){
                for(int hgw=q*q; hgw<=num; hgw+=q){
                    Jack[hgw] = false;
                }
            }
        }
        return Jack;
    }

    public static void main(String[] args) {
        boolean[] isPrimes = sieveOfEratosthenes(100);
        for(int i=2; i<isPrimes.length;i++){
            if(isPrimes[i]){
                System.out.println(i);
            }
        }
    }
}
