public class GfgBitMagic_LookUpTable {
    // Create an 8 bit array that houses the set bit count of numbers 0-255;
    public static int setBitCounter(int num){
        int[] lookUpTable = new int[255];
        static {
            for(int i = 0;i<=num;i++){
                lookUpTable[i] = countSetBits(i);
            }
        }

    }
    public static void main(String[] args) {

    }
}
