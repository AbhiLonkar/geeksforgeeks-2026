package geeksforgeeks._01_mathematics.gcd_lcm;

public class _03_LeastCommonMultiple {
    public static int GCD(int num1, int num2){
        if (num2==0) {
            return num1;
        }
        else {
            return GCD(num2, num1%num2);
        }
    }
    public static int LCM(int num1, int num2) {

        return (num1*num2)/GCD(num1, num2);
    }
    public static void main(String[] args) {
        System.out.println(LCM(8, 6));
    }
}
