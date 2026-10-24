package leetcode._12_math;

public class _30_TotalNumberOfColoredCells_2579 {
    // TODO - Given a number minute we have to how many colored blocks exists for said minute
    //  View the problem on leetcode to see the drawing
    public static long numberOfMiddleBlocks(int n){
        return (long) n*2 - 1;
    }

    public static long numberOfBottomBlocks(int n) {
        return 2 * (long) Math.pow(n-1, 2);
    }

    public static long totalBlocks(int n){
        return numberOfMiddleBlocks(n) + numberOfBottomBlocks(n);
    }

    public static void main(String[] args) {
        System.out.println(numberOfBottomBlocks(6));
    }
}
