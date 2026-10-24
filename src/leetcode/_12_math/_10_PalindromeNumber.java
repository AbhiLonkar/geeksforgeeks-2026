package leetcode._12_math;

public class _10_PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int ogNum = x;
        int reverseDigit=0;
        if(ogNum<0){
            return false;
        }
        while(x!=0){
            int lastDigit = x%10;
            reverseDigit = reverseDigit*10 + lastDigit;
            x=x/10;
        }
        System.out.println(reverseDigit);
        System.out.println(ogNum);
        if(ogNum == reverseDigit){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
       isPalindrome(1010101);
    }
}
