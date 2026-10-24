public class RightAngledTriangle {
    // Step 1 - Number of lines = number of rows = how many times the outer for loop will run
    // Step 2 - Identify for every row how many columns are there or the types of elements
    // Step 3 - What you need to print

    // 1. number of rows = n
    // 2. number of cols for each row = n
    // 3. what to print = *
    public static void box(int n) {
        for (int row = 1; row <= n; row++) {
            // n number of columns for each row
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 1. Number of rows = n
    // 2. Number of cols for each row = row number
    // 3. Print *
    public static void rightTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 1. Number of rows = n
    // 2. Number of cols for each row = n - rowNumber + 1
    // 3. Print *
    public static void invertRightTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 1. Number of rows = n
    // 2. Number of cols = row number
    // 3. Print numbers starting from 1 in this case it'll be column number itself
    public static void numericRightTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    // 1. Number of rows = 2 * n - 1
    // 2. Number of cols - 1 to n & then n to 1
    // 3. Print *
    public static void rightAndInvertRightTriangle(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            // general formula
            int numberOfColumnsPerRow = row <= n ? row : 2 * n - row;
            for (int col = 1; col <= numberOfColumnsPerRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        rightAndInvertRightTriangle(5);
    }
}
