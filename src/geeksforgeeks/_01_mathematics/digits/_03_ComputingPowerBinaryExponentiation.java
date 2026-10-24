package geeksforgeeks._01_mathematics.digits;

public class _03_ComputingPowerBinaryExponentiation {
    // Every number can be written as sum of powers of 2;
    // In Binary Exponentiation
    public static int ComputingPower(int num, int pow){
        int res=1;
        while(pow>0){
            if(pow%2==1){
                res=res*num;
            }
            pow=pow/2;
            num=num*num;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(ComputingPower(4,9));
    }
}
