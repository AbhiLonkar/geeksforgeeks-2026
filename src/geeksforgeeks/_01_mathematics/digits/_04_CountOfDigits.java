package geeksforgeeks._01_mathematics.digits;

public class _04_CountOfDigits {
    public static int lengthOfNumber(int num) {
//      Time complexity of theta(logn)
        int length = 0;
        while (num>0) {
            num = num/10;
            length++;
        }
        return length;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfNumber(1));
    }
}
