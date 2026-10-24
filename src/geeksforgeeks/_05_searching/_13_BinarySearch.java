package geeksforgeeks._05_searching;

public class _13_BinarySearch {
    // TODO - Given a sorted integer array find an element target if it does exist in the array return its index else return -1
    // ! Note the array is sorted

    // ? Approach - Just think of it like finding the mark sheet of a student based on roll number
    // ? Let's say sample size is 100 and roll no is 53
    // ? First we'll find the midpoint ie 50, noticed that roll number is greater than 50
    // ? So we'll start at 51 and end at 100, again find the midpoint which comes out to be 75
    // ? Roll no lesser than 75, so 74 will be ending point and 51 will be starting
    // ? We keep on doing this till we reach 51 and 56
    // ? We find the midpoint, and it comes out to be 53 which is indeed the students roll no and we give him the marksheet

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int midPoint = (start + end) / 2; // for smaller array sizes
            // ! int midPoint = start + (end-start)/2; for big array sizes
            if (arr[midPoint]==target){
                return midPoint;
            } else if (target>arr[midPoint]) {
                start = midPoint+1;
            }
            else {
                end = midPoint-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {2,5,6,7,9}, 7));
        System.out.println(binarySearch(new int[] {2,20,20,20,20}, 20));
    }
}
