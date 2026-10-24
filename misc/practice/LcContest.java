import java.util.*;

public class LcContest {
    public static int smallestIdx(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int numSum = 0;
            while (num > 0) {
                int rem = num % 10;
                numSum += rem;
                num /= 10;
            }
            if (numSum == i) {
                return i;
            }
        }
        return -1;
    }

    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int[][] grid = new int[n][3];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int digitSum = 0;
            while (num > 0) {
                int rem = num % 10;
                digitSum += rem;
                num /= 10;
            }
            grid[i][0] = digitSum;
            grid[i][1] = nums[i];
            grid[i][2] = i;
        }

        Arrays.sort(grid, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[2], b[2]);
        });

        int[] mappedToIdx = new int[n];
        for (int i = 0; i < n; i++) {
            mappedToIdx[grid[i][2]] = i;
        }

        boolean[] seen = new boolean[n];
        int minSwaps = 0;

        for (int i = 0; i < n; i++) {
            if (!seen[i]) {
                int j = i;
                int numberOfCycles = 0;
                while (!seen[j]) {
                    seen[j] = true;
                    j = mappedToIdx[j];
                    numberOfCycles++;
                }
                if (numberOfCycles > 1) {
                    minSwaps += numberOfCycles - 1;
                }
            }
        }

        return minSwaps;

    }

    public static int minMoves(String[] board) {
        int rowCount = board.length;
        int colCount = board[0].length();

        char[][] grid = new char[rowCount][colCount];
        for (int row = 0; row < rowCount; row++) {
            grid[row] = board[row].toCharArray();
        }

        int[][] minStepsToReach = new int[rowCount][colCount];
        for (int[] row : minStepsToReach) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        Map<Character, List<int[]>> portalPositions = new HashMap<>();
        Set<Character> visitedPortals = new HashSet<>();

        for (int row = 0; row < rowCount; ++row) {
            for (int col = 0; col < colCount; ++col) {
                char cell = grid[row][col];
                if (Character.isUpperCase(cell)) {
                    portalPositions.computeIfAbsent(cell, k -> new ArrayList<>()).add(new int[]{row, col});
                }
            }
        }

        Deque<int[]> dq = new ArrayDeque<>();
        dq.addFirst(new int[]{0, 0, 0}); // {row, col, stepsTaken}
        minStepsToReach[0][0] = 0;

        int[][] directionVectors = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!dq.isEmpty()) {
            int[] current = dq.pollFirst();
            int currentRow = current[0], currentCol = current[1], steps = current[2];

            if (currentRow == rowCount - 1 && currentCol == colCount - 1) return steps;

            char currentCell = grid[currentRow][currentCol];

            if (Character.isUpperCase(currentCell) && !visitedPortals.contains(currentCell)) {
                visitedPortals.add(currentCell);
                for (int[] portalLocation : portalPositions.get(currentCell)) {
                    int portalRow = portalLocation[0], portalCol = portalLocation[1];
                    if (minStepsToReach[portalRow][portalCol] > steps) {
                        minStepsToReach[portalRow][portalCol] = steps;
                        dq.addFirst(new int[]{portalRow, portalCol, steps});
                    }
                }
            }

            for (int[] direction : directionVectors) {
                int nextRow = currentRow + direction[0];
                int nextCol = currentCol + direction[1];

                if (nextRow >= 0 && nextCol >= 0 && nextRow < rowCount && nextCol < colCount &&
                        grid[nextRow][nextCol] != '#') {
                    if (minStepsToReach[nextRow][nextCol] > steps + 1) {
                        minStepsToReach[nextRow][nextCol] = steps + 1;
                        dq.addLast(new int[]{nextRow, nextCol, steps + 1});
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minMoves(new String[]{".#...",".#.#.",".#.#.","...#."}));
    }
}
