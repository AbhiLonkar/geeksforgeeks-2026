public class LcMatrix_Jewels {
    public static int numJewelsInStones(String LcMatrix_Jewels, String stones) {
        int count = 0;
        for (char jewel: LcMatrix_Jewels.toCharArray()){
            for (int i = 0; i < stones.length(); i++) {
                if (jewel == stones.charAt(i)){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}
