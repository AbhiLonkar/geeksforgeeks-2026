package geeksforgeeks._02_bit_magic.count_set_bits;

public class _02_CountSetBits {
    public static int SetBitCounter(int num){
        int count=0;
//        Method 1
        while(num>0){
            // count = count + (num&1);
            if((num&1)==1){
                count++;
            }
        num=num/2; //right shifting each bit by one position
        }
        return count;

//      Method 2: Making the last set bit as 0
//        Using Brian Karringham's algo
//        while(num>0){
//            num=num&(num-1);
//            count++;
//        }
//
//        return count;
    }
    public static void main(String[] args) {
        System.out.println(SetBitCounter(7));
    }
}
