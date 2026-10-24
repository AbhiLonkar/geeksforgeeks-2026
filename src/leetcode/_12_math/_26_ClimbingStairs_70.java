package leetcode._12_math;

public class _26_ClimbingStairs_70 {
    // TODO - Given number of stairs we have to find in how many ways we can climb these steps
    //  We can only use steps of 1 or 2 and 1 <= n <= 45
    //  ex. n = 6(even), We can take the following approaches
    //  count = 0;
    //  only using 1s -> 1,1,1,1,1,1    count = 1
    //  only using 2s -> 2,2,2          count = 2
    //  using 1, 2 -> 1,2,1,2           count = 3
    //  using 2, 1 -> 2,1,2,1           count = 4
    //  using 1 and 2 -> 1,1,2,2        count = 5
    //  using 2 and 1 -> 2,2,1,1        count = 6
    //  using 1 and 2 -> 1,2,2,1        count = 7
    //  using 2 and 1 -> 2,1,1,2        count = 8
    //  1,1,1,1,2                       count = 9
    //  1,1,1,2,1                       count = 10
    //  1,1,2,1,1                       count = 11
    //  1,2,1,1,1                       count = 12
    //  2,1,1,1,1                       count = 13

    // ? Approach - Lets start by analyzing from 1 to 6
    // n = 1 -> 1 step -> 1 way
    // n = 2 -> 1,1 or 2 -> 2 ways
    // n = 3 -> 1,1,1 or 2,1 or 2,1 -> 3 ways
    // n = 4 -> 1,1,1,1 or 1,1,2 or 1,2,1 or 2,1,1 or 2,2 -> 5 ways
    // n = 5 -> 1,1,1,1,1 or 1,1,1,2 or 1,1,2,1 or 1,2,1,1 or 2,1,1,1 or 2,2,1 or 2,1,2 or 1,2,2 -> 8 ways
    // n = 6 -> 13 ways
    // 1,2,3,5,8,13
    // 1,2,3,4,5,6 -> value of n
    // * So what we've got ourselves is a fibonacci sequence
    // ? To solve this problem we only have to find value of the nth fibonacci number

    // General code to print numbers from 1 to n of a fibonacci sequence
    public static void generateFib(int n){
        int n1 = 1, n2 = 2;
        System.out.println("1st fib -> " + n1);
        System.out.println("2nd fib -> " + n2);
        int count = 3;
        while (count < n){
            int n3 = n1 + n2;
            System.out.println(count + "th fib -> "+ n3);
            n1 = n2;
            n2 = n3;
            count++;
        }
    }

    public static int climbingStairs(int n) {
        if (n == 1 ){
            return 1;
        }
        else if (n == 2){
            return 2;
        }
        int n1 = 1, n2 = 2;
        int count = 3;
        while (true){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            if (count == n){
                return n3;
            }
            count++;
        }
    }

    public static void main(String[] args) {
        System.out.println(climbingStairs(3));
    }

 }
