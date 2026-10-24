package leetcode._11_bit_manipulation;

public class _10_SingleNumberII_137 {
    // The problem is that we have to find to a number that occurs only once in the array, all the other elements appear exactly thrice.
    // arr = [1,1,1,2,2,2,3,4,4,4]
    // So the basic logic behind this is that we calculate the number of ones at a particular position in the number's binary representation.
    // The number which occurs only once will contribute an extra one, because other numbers will always contribute 1 in the multiples of 3.
    // Consider this -
    // 1 - 0000...001
    // 1 - 0000...001
    // 1 - 0000...001
    // 2 - 0000...010
    // 2 - 0000...010
    // 2 - 0000...010
    // 3 - 0000...011
    // 4 - 0000...100
    // 4 - 0000...100
    // 4 - 0000...100
    // Let's consider the 0th bit here
    // We can see that it's occurring 4 times meaning it's our unique number is contributing that extra one.
    // So we can create a variable in which we'll store this count of 1.
    // Q. But how do I count if 1 is present at a particular position?
    // Ans. We can do a bitwise AND with a temp number who has 1 set at this particular position.
    // Now we store this count of 1 in a sum variable, if we do sum%3 if no unique number contributed 1 then we'll get 0 else 1.
    // So if we get sum%3 != 0, means we have found a set bit position(idx representing 32 bits) from that unique number.
    // Q. How do I set a bit from the temp variable to the result?
    // Ans. Simply keep doing bitwise OR of the result with temp.
    public static int NumberFinder(int[] arr){
        int res = 0;
        int sum, temp;
        // Iterating over all 32 bits.
        for(int idx = 0; idx<32; idx++){
            sum = 0;
            temp = 1 << idx;
            // Iterating through the array
            for(int num: arr){
                if((num&temp)!=0){      // Checking if bit set, this will return the temp variable itself if the condition is true.
                    sum++;              // If bit set increment the sum
                }
            }
            if(sum%3!=0){               // If sum%3 != 0, ie an extra 1 present
                res = res | temp;       // Add it to the result using temp variable or Turn on bit at idx in result.
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,4,4,4};
        System.out.println(NumberFinder(arr));
    }
}
