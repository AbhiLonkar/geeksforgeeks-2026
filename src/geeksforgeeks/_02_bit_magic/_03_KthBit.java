package geeksforgeeks._02_bit_magic;

public class _03_KthBit {
    public static String inSet(int num, int k) {
//        Method 1: Calculating 2^k-1 with a loop and then doing bitwise and on it.
//        Logic is around comparing the number with kth bit set
//        int res=1; // number with kth bit set
//        for(int i = 0; i<(k-1); i++){
//            res=res*2;
//        }
//        if((num&res)!=0){ // No zero result of num&res means kth bit is set
//            return ("Yes");
//        }
//        else {
//            return ("No");
//        }

//        Method 2: Using left shift operator
//        int leftShifted = (1<<(k-1));
//        if((num&leftShifted)!=0){
//            return "Yes";
//        }
//        else {
//            return "No";
//        }

//    Method 2 using right shift operator
        int rightShifted = (num>>k-1);
        if((rightShifted&1)!=0){
            return "Yes";
        }
        else {
            return "No";
        }
    }

    public static void main(String[] args) {
        System.out.println(inSet(5,3));
    }
}

























//        int x = 1;
//        for(int i=1; i<=(k-1);i++){
//            x=x*2;
//        }
//        if((num&x)!=0){
//            System.out.println("Yes");
//        }
//        else {
//            System.out.println("No");
//        }
//    }