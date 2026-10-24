public class Revision {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static boolean checkPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void isLeapYear(int year) {
        if ((year % 400 == 0)
                || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not leap");
        }
    }

    public static int calculateGcd(int n1, int n2) {
        while (n1 % n2 != 0) {
            int rem = n1 % n2;
            // New Dividend will be equal to the previous divisor
            n1 = n2;
            // And the new divisor will be equal to remainder
            n2 = rem;

        }
        return n2;
    }

    public static int calculateLcm(int n1, int n2) {
        int gcd = calculateGcd(n1, n2);
        return (n1 * n2) / gcd;
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

    }

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int secondMax(int[] arr) {
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static int minElement(int[] arr) {
        int minEl = arr[0];
        for (int i = 1; i < arr.length; i++) {
            minEl = Math.min(minEl, arr[i]);
        }
        return minEl;
    }

    public static int secondMin(int[] arr) {
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }

    public static void minAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[arr.length - 1];
        for (int i1 = 1, i2 = arr.length - 2; i1 < arr.length && i2 >= 0; i1++, i2--) {
            min = Math.min(min, arr[i1]);
            max = Math.max(max, arr[i2]);
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void nthFibNumber(int n) {
        if (n == 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println(1);
        } else {
            int a = 0, b = 1;
            int nthFib = 0;
            for (int i = 3; i <= n; i++) {
                nthFib = a + b;
                a = b;
                b = nthFib;
            }
            System.out.println(nthFib);

        }
    }

    public static void printPattern(int n) {
        for (int row = 1; row<=n; row++){
            for (int col = 1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n){
        for (int i = 1; i<=n; i++){
            for (int i2 = 1; i2<=n; i2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern2(5);
//        int[] arr = {100, 200, 300, 400, 500, 600};
//        System.out.println(secondMin(arr));
//        System.out.println(binarySearch(arr, 400 ));
        isLeapYear(1700);
    }
}