package leetcode._11_bit_manipulation;

public class _07_NumberComplement {
    // Number flip complement - Flip all the bits of a given number & then return a new number which is the flipped binary num
    // Idea - Convert the given number into binary after converting to binary flip all the bits
    // Return the result representing the flipped bits
    // So 3 for loops - 1. Converting to bin 2. Flipping bits 3. Converting binary to int
    // Time & Space Complexity very large.
    public static int NumberComplement(int n){
        // Converting number to string
        String bin = "";
        while(n>0){
            int remainder = n%2;
            bin = remainder + bin;
            n=n/2;
        }
        // Flipping all the bits
        String flippedBin = "";
        for(int i = bin.length()-1;i>=0;i--){
            if(bin.charAt(i)=='1'){
                flippedBin = '0' + flippedBin;
            }
            else {
                flippedBin = '1' + flippedBin;
            }
        }
        int res = 0;
        int pos = 0;
        for(int i = flippedBin.length()-1;i>=0;i--){
            if(flippedBin.charAt(i)=='1'){
                res = (int) (res + Math.pow(2, pos));
            }
            else {
                res += 0;
            }
            pos++;
        }
        return res;
    }

    // Approach - Find the binary length of the number and create a temp number with all its bits set to 1 for the same length.
    // Then just xor with the og number to get the flipped variant.
    public static int QuickNumberComplement(int num){
        // Problem 1 - How do I find the length?

        int binLength1 = Integer.SIZE - Integer.numberOfLeadingZeros(num);
        // or
        int binLength2 = (int)(Math.log(num)/Math.log(2)) + 1; // Formula to find binLength - (Math.log(num)/Math.log(2)) + 1

        // Problem 2 - How do create a num of length binLength and all bits set to 1.
        int temp = (1 << binLength2) - 1; // Moves 1 to leftmost side by binLength positions. Then when we do -1 all the trailing zeros converted to 1 and the leftmost 1 converted to 0.
        return temp ^ num;
    }

    public static void main(String[] args) {
        System.out.println(NumberComplement(5));
        System.out.println(QuickNumberComplement(2));
    }
}
