package leetcode._12_math;

public class _09_NumberOfCommonFactors_2427 {
    public static int commonFactors(int a, int b) {

        int count=0;
        int n = gcd(a, b);
        for(int i=1;i<=n;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }

        return count;
    }

    public static int gcd(int num1, int num2){
        if(num2==0){
            return num1;
        }
        return gcd(num2, num1%num2);
    }

    public static void main(String[] args) {
        System.out.println(commonFactors(885, 885));
    }
}
