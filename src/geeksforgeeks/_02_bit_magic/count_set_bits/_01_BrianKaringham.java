package geeksforgeeks._02_bit_magic.count_set_bits;

public class _01_BrianKaringham {
    public static int SetBitCounter(int num){
        int count=0;

        // Brian Kernighan's algo
        while(num>0){
            num=num&(num-1); // This results in removing the last set bit
            // How it works -
            // 1. When we subtract 1 from a number, all the bits after the rightmost set bit (including the set bit itself) are flipped: the set bit becomes 0, and all trailing 0s become 1s.
            // 2. eg 8 is - 1000, 7 is 0111, 16-10000 & 15-01111
            // 3. Now if we do 7(0111)&6(0110) this will give - 0110
            // 4. The right most set bit is removed, and we can increment the count
            // 5. We repeat this process.
            // First iteration for num = 7(0111) we do "and" with 6(0110) {count=1}, next iteration num = 6(0110) so we do "and" with 5(0101) {count=2},
            // next iteration num = 4(0100), bitwise "and" with 3(0011) {count=3}, now num becomes 0, so we exit the loop
//            extra = Think of reading the binary number from right to left.
//The first 1 you encounter is the rightmost set bit.
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(SetBitCounter(7));
    }
}
