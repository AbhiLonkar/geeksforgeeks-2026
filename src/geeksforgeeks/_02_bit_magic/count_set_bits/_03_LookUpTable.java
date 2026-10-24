package geeksforgeeks._02_bit_magic.count_set_bits;

public class _03_LookUpTable {
//    we break the number down into smaller 8-bit chunks and use the lookup table for each chunk separately
    // main logic is using a precomputed table.
    // this table has already calculated the set bit count of up to 8 positions ie 255
    // table that houses 255 numbers
    static int[] lookupTable = new int[255];
    static {
        // iterating over each index(0,1,2,3) and counting the number of set bits in index(0,1,2,3)
        for(int i=0;i<255;i++){
            lookupTable[i] = countSetBits(i);  // each item in lookUptable will represent the count of set bits
        }
    }
    private static int countSetBits(int num){
        int count = 0;
        while(num>0){
            num=num&(num-1);
            count++;
        }
        return count;
    }
//    calculate the count of set bits for each 8 bit chunk 
    public static int countSetBitsUsingLookUp(int num){
        return lookupTable[num&255] + lookupTable[(num>>8)&255] + lookupTable[(num>>16)&255] + lookupTable[(num>>24)];
    }
    public static void main(String[] args) {
        int num = 5;
        int res = countSetBitsUsingLookUp(num);
        System.out.println("The count of set bits in "+num+" is "+res);
    }
}
