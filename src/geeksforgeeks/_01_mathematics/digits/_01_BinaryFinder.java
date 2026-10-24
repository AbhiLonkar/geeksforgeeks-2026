package geeksforgeeks._01_mathematics.digits;

public class _01_BinaryFinder {
    public static String DecimalToBinary(int num){
        String binaryString = "";
        while(num>0){
            int remainder = num%2;
            binaryString = remainder+binaryString;
            num=num>>1;
        }
        return binaryString;
    }

    public static void main(String[] args) {
        System.out.println(DecimalToBinary(13));
    }
}
