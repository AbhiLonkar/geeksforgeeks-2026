package leetcode._01_arrays;

public class _54_LargestNumber_179_TODO {
    // TODO - Given an integer array we have to form the maximum number from these elements
    // ex. [10, 2] => 210 or 102, since 210 > 102 we return 210

    // ? Lets discuss the approach with this example -
    // ex. [3,30,34,5,9], We pick the element which has the biggest first digit for this it is 9
    // next for the remaining elements choose the one with largest first digit -> 5 -> 95
    // [3, 30, 34] remain all the first digits are the same in this case we compare the next digits if there isn't any digit we compare the next digit with the first digit
    // in this case 3, 0(from 30), 4(from 34) since 4 is bigger so 9534
    // compare 3, 30 since 0 smaller than 3 we put 3 before 30 -> 9534330


}
