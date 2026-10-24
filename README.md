# GeeksForGeeks 2025

Java solutions from the GeeksForGeeks DSA course, plus LeetCode problems solved alongside it.

## Layout

```
src/
├── geeksforgeeks/   GfG course problems, one package per course topic (in course order)
├── leetcode/        LeetCode problems, one package per topic
└── oops/            OOP concept examples and notes
misc/                practice re-attempts, scratch files, notes, JS/Python, pattern printing, shortcuts PDF
```

## Naming conventions

- **GfG files:** `_<solve order>_<ProblemName>.java`, e.g. `_03_LeaderElement.java`. Numbering restarts in every folder.
- **LeetCode files:** `_<solve order>_<ProblemName>_<LeetCode number>.java`, e.g. `_01_FirstBadVersion_278.java`.
- **Package:** matches the folder, e.g. `package geeksforgeeks._04_arrays.sliding_window;`.
- **Finding a problem:** `Ctrl+N` in IntelliJ and type part of the name (or a LeetCode number).

## About the solve order

The original repo had a single commit and identical file dates, so the order comes from the numbering already in the file names.
Files marked **\*** had no number; they are placed after the numbered ones, alphabetically. Rename them if you remember the real order.
In `leetcode/`, files from the old `Leetcode` folder come first, then `Leetcode 2` (Easy, then Medium, then Hard).

## GeeksForGeeks (101 files)

| Topic | File | Originally |
|---|---|---|
| Mathematics / digits | [_01_BinaryFinder.java](src/geeksforgeeks/_01_mathematics/digits/_01_BinaryFinder.java) * | `Mathematics/src/Digits/BinaryFinder.java` |
| Mathematics / digits | [_02_ComputingPower.java](src/geeksforgeeks/_01_mathematics/digits/_02_ComputingPower.java) * | `Mathematics/src/Digits/Computing_Power.java` |
| Mathematics / digits | [_03_ComputingPowerBinaryExponentiation.java](src/geeksforgeeks/_01_mathematics/digits/_03_ComputingPowerBinaryExponentiation.java) * | `Mathematics/src/Digits/Computing_Power_Binary_Exponentiation.java` |
| Mathematics / digits | [_04_CountOfDigits.java](src/geeksforgeeks/_01_mathematics/digits/_04_CountOfDigits.java) * | `Mathematics/src/Digits/Count_of_Digits.java` |
| Mathematics / digits | [_05_PalindromeNumber.java](src/geeksforgeeks/_01_mathematics/digits/_05_PalindromeNumber.java) * | `Mathematics/src/Digits/Palindrome_Number.java` |
| Mathematics / digits | [_06_SumOfDigits.java](src/geeksforgeeks/_01_mathematics/digits/_06_SumOfDigits.java) * | `Mathematics/src/Digits/Sum_of_Digits.java` |
| Mathematics / factorials | [_01_Factorial.java](src/geeksforgeeks/_01_mathematics/factorials/_01_Factorial.java) * | `Mathematics/src/Factorials/Factorial.java` |
| Mathematics / factorials | [_02_FactorialTrailingZeroes.java](src/geeksforgeeks/_01_mathematics/factorials/_02_FactorialTrailingZeroes.java) * | `Mathematics/src/Factorials/Factorial_Trailing_Zeroes.java` |
| Mathematics / factorials | [_03_FactorialUsingRecursion.java](src/geeksforgeeks/_01_mathematics/factorials/_03_FactorialUsingRecursion.java) * | `Mathematics/src/Factorials/Factorial_using_Recursion.java` |
| Mathematics / gcd_lcm | [_01_DivisorsOfANumber.java](src/geeksforgeeks/_01_mathematics/gcd_lcm/_01_DivisorsOfANumber.java) * | `Mathematics/src/GCD_and_LCM/Divisors_of_a_Number.java` |
| Mathematics / gcd_lcm | [_02_GreatestCommonDivisor.java](src/geeksforgeeks/_01_mathematics/gcd_lcm/_02_GreatestCommonDivisor.java) * | `Mathematics/src/GCD_and_LCM/Greatest_Common_Divisor.java` |
| Mathematics / gcd_lcm | [_03_LeastCommonMultiple.java](src/geeksforgeeks/_01_mathematics/gcd_lcm/_03_LeastCommonMultiple.java) * | `Mathematics/src/GCD_and_LCM/Least_Common_Multiple.java` |
| Mathematics / primes | [_01_PrimeFactors.java](src/geeksforgeeks/_01_mathematics/primes/_01_PrimeFactors.java) * | `Mathematics/src/Primes/Prime_Factors.java` |
| Mathematics / primes | [_02_PrimeNumber.java](src/geeksforgeeks/_01_mathematics/primes/_02_PrimeNumber.java) * | `Mathematics/src/Primes/Prime_Number.java` |
| Mathematics / primes | [_03_PrimeNumbersSmallerThanNumber.java](src/geeksforgeeks/_01_mathematics/primes/_03_PrimeNumbersSmallerThanNumber.java) * | `Mathematics/src/Primes/PrimeNumbers_Smaller_than_Number.java` |
| Mathematics / primes | [_04_SieveOfEratosthenes.java](src/geeksforgeeks/_01_mathematics/primes/_04_SieveOfEratosthenes.java) * | `Mathematics/src/Primes/Sieve_of_Eratosthenes.java` |
| Mathematics / primes | [_05_SieveOfEratosthenes2.java](src/geeksforgeeks/_01_mathematics/primes/_05_SieveOfEratosthenes2.java) * | `Mathematics/src/Primes/Sieve_of_Eratosthenes2.java` |
| Bit Magic | [_01_BitwiseOperators.java](src/geeksforgeeks/_02_bit_magic/_01_BitwiseOperators.java) * | `Bit Magic/Bitwise_Operators.java` |
| Bit Magic | [_02_DecimalToBinary.java](src/geeksforgeeks/_02_bit_magic/_02_DecimalToBinary.java) * | `Bit Magic/Decimal_To_Binary.java` |
| Bit Magic | [_03_KthBit.java](src/geeksforgeeks/_02_bit_magic/_03_KthBit.java) * | `Bit Magic/KthBit.java` |
| Bit Magic | [_04_OddOneOccuring.java](src/geeksforgeeks/_02_bit_magic/_04_OddOneOccuring.java) * | `Bit Magic/Odd_One_Occuring.java` |
| Bit Magic | [_05_OddTwoOccuring.java](src/geeksforgeeks/_02_bit_magic/_05_OddTwoOccuring.java) * | `Bit Magic/Odd_Two_Occuring.java` |
| Bit Magic | [_06_PowerOfTwo.java](src/geeksforgeeks/_02_bit_magic/_06_PowerOfTwo.java) * | `Bit Magic/Power_Of_Two.java` |
| Bit Magic / count_set_bits | [_01_BrianKaringham.java](src/geeksforgeeks/_02_bit_magic/count_set_bits/_01_BrianKaringham.java) * | `Bit Magic/Count_Set_Bits/Brian_Karingham.java` |
| Bit Magic / count_set_bits | [_02_CountSetBits.java](src/geeksforgeeks/_02_bit_magic/count_set_bits/_02_CountSetBits.java) * | `Bit Magic/Count_Set_Bits/CountSetBits.java` |
| Bit Magic / count_set_bits | [_03_LookUpTable.java](src/geeksforgeeks/_02_bit_magic/count_set_bits/_03_LookUpTable.java) * | `Bit Magic/Count_Set_Bits/LookUp_Table.java` |
| Recursion | [_01_DecimalToBinaryRecursion.java](src/geeksforgeeks/_03_recursion/_01_DecimalToBinaryRecursion.java) * | `Recursion/src/Decimal_To_Binary_Recursion.java` |
| Recursion | [_02_FactorialTailRecursion.java](src/geeksforgeeks/_03_recursion/_02_FactorialTailRecursion.java) * | `Recursion/src/Factorial_Tail_Recursion.java` |
| Recursion | [_03_NthFibNum.java](src/geeksforgeeks/_03_recursion/_03_NthFibNum.java) * | `Recursion/src/Nth_Fib_Num.java` |
| Recursion | [_04_PalindromeMethod1.java](src/geeksforgeeks/_03_recursion/_04_PalindromeMethod1.java) * | `Recursion/src/Palindrome_Method1.java` |
| Recursion | [_05_PalindromeMethod2.java](src/geeksforgeeks/_03_recursion/_05_PalindromeMethod2.java) * | `Recursion/src/Palindrome_Method2.java` |
| Recursion | [_06_Print1ToNRecursion.java](src/geeksforgeeks/_03_recursion/_06_Print1ToNRecursion.java) * | `Recursion/src/Print_1_to_N_Recursion.java` |
| Recursion | [_07_PrintNTo1Recursion.java](src/geeksforgeeks/_03_recursion/_07_PrintNTo1Recursion.java) * | `Recursion/src/Print_N_to_1_Recursion.java` |
| Recursion | [_08_Recursion.java](src/geeksforgeeks/_03_recursion/_08_Recursion.java) * | `Recursion/src/Recursion_1.java` |
| Recursion | [_09_RopeCut.java](src/geeksforgeeks/_03_recursion/_09_RopeCut.java) * | `Recursion/src/Rope_Cut.java` |
| Recursion | [_10_SubsetOfString.java](src/geeksforgeeks/_03_recursion/_10_SubsetOfString.java) * | `Recursion/src/Subset_of_String.java` |
| Recursion | [_11_SubsetSumProblem.java](src/geeksforgeeks/_03_recursion/_11_SubsetSumProblem.java) * | `Recursion/src/Subset_Sum_Problem.java` |
| Recursion | [_12_SumOfDigits.java](src/geeksforgeeks/_03_recursion/_12_SumOfDigits.java) * | `Recursion/src/Sum_Of_Digits.java` |
| Recursion | [_13_SumOfNums.java](src/geeksforgeeks/_03_recursion/_13_SumOfNums.java) * | `Recursion/src/Sum_Of_Nums.java` |
| Arrays | [_01_DeleteElement.java](src/geeksforgeeks/_04_arrays/_01_DeleteElement.java) * | `Arrays/src/Delete_Element.java` |
| Arrays | [_02_FrequenciesOfElements.java](src/geeksforgeeks/_04_arrays/_02_FrequenciesOfElements.java) * | `Arrays/src/Frequencies_Of_Elements.java` |
| Arrays | [_03_LargestElement.java](src/geeksforgeeks/_04_arrays/_03_LargestElement.java) * | `Arrays/src/Largest_Element.java` |
| Arrays | [_04_LeaderElement.java](src/geeksforgeeks/_04_arrays/_04_LeaderElement.java) * | `Arrays/src/Leader_Element.java` |
| Arrays | [_05_LeftRotateByD.java](src/geeksforgeeks/_04_arrays/_05_LeftRotateByD.java) * | `Arrays/src/Left_Rotate_By_d.java` |
| Arrays | [_06_LeftRotateByOne.java](src/geeksforgeeks/_04_arrays/_06_LeftRotateByOne.java) * | `Arrays/src/Left_Rotate_By_One.java` |
| Arrays | [_07_LongestEvenOddSubarray.java](src/geeksforgeeks/_04_arrays/_07_LongestEvenOddSubarray.java) * | `Arrays/src/Longest_Even_Odd_Subarray.java` |
| Arrays | [_08_MajorityElement.java](src/geeksforgeeks/_04_arrays/_08_MajorityElement.java) * | `Arrays/src/Majority_Element.java` |
| Arrays | [_09_MaximumDifferenceWithOrder.java](src/geeksforgeeks/_04_arrays/_09_MaximumDifferenceWithOrder.java) * | `Arrays/src/Maximum_Difference_With_Order.java` |
| Arrays | [_10_MaximumSumSubarray.java](src/geeksforgeeks/_04_arrays/_10_MaximumSumSubarray.java) * | `Arrays/src/Maximum_Sum_Subarray.java` |
| Arrays | [_11_MinimumConsecutiveFlips.java](src/geeksforgeeks/_04_arrays/_11_MinimumConsecutiveFlips.java) * | `Arrays/src/Minimum_Consecutive_Flips.java` |
| Arrays | [_12_MooreVoting.java](src/geeksforgeeks/_04_arrays/_12_MooreVoting.java) * | `Arrays/src/Moore_Voting.java` |
| Arrays | [_13_MostConsecutiveOnes.java](src/geeksforgeeks/_04_arrays/_13_MostConsecutiveOnes.java) * | `Arrays/src/Most_Consecutive_Ones.java` |
| Arrays | [_14_MoveZerosToEnd.java](src/geeksforgeeks/_04_arrays/_14_MoveZerosToEnd.java) * | `Arrays/src/Move_Zeros_To_End.java` |
| Arrays | [_15_PrefixSum.java](src/geeksforgeeks/_04_arrays/_15_PrefixSum.java) * | `Arrays/src/Prefix_Sum.java` |
| Arrays | [_16_RemoveDuplicatesSortedArr.java](src/geeksforgeeks/_04_arrays/_16_RemoveDuplicatesSortedArr.java) * | `Arrays/src/Remove_Duplicates_SortedArr.java` |
| Arrays | [_17_ReverseArray.java](src/geeksforgeeks/_04_arrays/_17_ReverseArray.java) * | `Arrays/src/Reverse_Array.java` |
| Arrays | [_18_SecondLargestElement.java](src/geeksforgeeks/_04_arrays/_18_SecondLargestElement.java) * | `Arrays/src/Second_Largest_Element.java` |
| Arrays | [_19_SortedArr.java](src/geeksforgeeks/_04_arrays/_19_SortedArr.java) * | `Arrays/src/Sorted_Arr.java` |
| Arrays | [_20_StockBuyAndSell.java](src/geeksforgeeks/_04_arrays/_20_StockBuyAndSell.java) * | `Arrays/src/Stock_Buy_And_Sell.java` |
| Arrays / sliding_window | [_01_EquilibriumPoint.java](src/geeksforgeeks/_04_arrays/sliding_window/_01_EquilibriumPoint.java) * | `Arrays/src/Sliding_Window/Equilibrium_Point.java` |
| Arrays / sliding_window | [_02_MaxSumOfKConsecutiveElements.java](src/geeksforgeeks/_04_arrays/sliding_window/_02_MaxSumOfKConsecutiveElements.java) * | `Arrays/src/Sliding_Window/Max_Sum_Of_K_Consecutive_Elements.java` |
| Arrays / sliding_window | [_03_PrefixSum.java](src/geeksforgeeks/_04_arrays/sliding_window/_03_PrefixSum.java) * | `Arrays/src/Sliding_Window/Prefix_Sum.java` |
| Arrays / sliding_window | [_04_SubArrayWithGivenSum.java](src/geeksforgeeks/_04_arrays/sliding_window/_04_SubArrayWithGivenSum.java) * | `Arrays/src/Sliding_Window/SubArray_with_given_Sum.java` |
| Searching | [_01_IndexOfFirstOccurence.java](src/geeksforgeeks/_05_searching/_01_IndexOfFirstOccurence.java) | `Searching/src/IndexOfFirstOccurence_01.java` |
| Searching | [_02_IndexOfLastOccurence.java](src/geeksforgeeks/_05_searching/_02_IndexOfLastOccurence.java) | `Searching/src/IndexOfLastOccurence_02.java` |
| Searching | [_03_CountOccurrencesInASortedArray.java](src/geeksforgeeks/_05_searching/_03_CountOccurrencesInASortedArray.java) | `Searching/src/CountOccurrencesInASortedArray_03.java` |
| Searching | [_04_Count1InASortedBinaryArray.java](src/geeksforgeeks/_05_searching/_04_Count1InASortedBinaryArray.java) | `Searching/src/Count1InASortedBinaryArray_04.java` |
| Searching | [_05_SquareRoot.java](src/geeksforgeeks/_05_searching/_05_SquareRoot.java) | `Searching/src/SquareRoot_05.java` |
| Searching | [_06_SearchInASortedInfiniteArray.java](src/geeksforgeeks/_05_searching/_06_SearchInASortedInfiniteArray.java) | `Searching/src/SearchInASortedInfiniteArray_06.java` |
| Searching | [_07_SearchInSortedRotatedArray.java](src/geeksforgeeks/_05_searching/_07_SearchInSortedRotatedArray.java) | `Searching/src/SearchInSortedRotatedArray_07.java` |
| Searching | [_08_PeakElement.java](src/geeksforgeeks/_05_searching/_08_PeakElement.java) | `Searching/src/PeakElement_08.java` |
| Searching | [_09_TwoPointerApproach.java](src/geeksforgeeks/_05_searching/_09_TwoPointerApproach.java) | `Searching/src/TwoPointerApproach_09.java` |
| Searching | [_10_TripletInASortedArray.java](src/geeksforgeeks/_05_searching/_10_TripletInASortedArray.java) | `Searching/src/TripletInASortedArray_10.java` |
| Searching | [_11_MedianOfTwoSortedArrays.java](src/geeksforgeeks/_05_searching/_11_MedianOfTwoSortedArrays.java) | `Searching/src/MedianOfTwoSortedArrays_11.java` |
| Searching | [_12_RepeatingElement.java](src/geeksforgeeks/_05_searching/_12_RepeatingElement.java) | `Searching/src/RepeatingElement_12.java` |
| Searching | [_13_BinarySearch.java](src/geeksforgeeks/_05_searching/_13_BinarySearch.java) * | `Searching/src/Binary_Search.java` |
| Searching | [_14_BinarySearchUsingRecursion.java](src/geeksforgeeks/_05_searching/_14_BinarySearchUsingRecursion.java) * | `Searching/src/Binary_Search_Using_Recursion.java` |
| Searching | [_15_LinearSearch.java](src/geeksforgeeks/_05_searching/_15_LinearSearch.java) * | `Searching/src/Linear_Search.java` |
| Sorting | [_01_BubbleSort.java](src/geeksforgeeks/_06_sorting/_01_BubbleSort.java) | `Sorting/src/_01_BubbleSort.java` |
| Sorting | [_02_SelectionSort.java](src/geeksforgeeks/_06_sorting/_02_SelectionSort.java) | `Sorting/src/_02_SelectionSort.java` |
| Sorting | [_03_InsertionSort.java](src/geeksforgeeks/_06_sorting/_03_InsertionSort.java) | `Sorting/src/_03_InsertionSort.java` |
| Sorting | [_04_MergeSort.java](src/geeksforgeeks/_06_sorting/_04_MergeSort.java) | `Sorting/src/_04_MergeSort.java` |
| Sorting | [_05_PartitionAnArray.java](src/geeksforgeeks/_06_sorting/_05_PartitionAnArray.java) | `Sorting/src/_05_PartitionAnArray.java` |
| Sorting | [_06_LomutoPartition.java](src/geeksforgeeks/_06_sorting/_06_LomutoPartition.java) | `Sorting/src/_06_LomutoPartition.java` |
| Sorting | [_07_HoarePartition.java](src/geeksforgeeks/_06_sorting/_07_HoarePartition.java) | `Sorting/src/_07_HoarePartition.java` |
| Sorting | [_08_QuickSortLomuto.java](src/geeksforgeeks/_06_sorting/_08_QuickSortLomuto.java) | `Sorting/src/_08_QuickSortLomuto.java` |
| Sorting | [_09_QuickSortHoare.java](src/geeksforgeeks/_06_sorting/_09_QuickSortHoare.java) | `Sorting/src/_09_QuickSortHoare.java` |
| Sorting | [_10_KthSmallestElement.java](src/geeksforgeeks/_06_sorting/_10_KthSmallestElement.java) | `Sorting/src/_10_KthSmallestElement.java` |
| Sorting | [_11_MinimumDifferenceInArray.java](src/geeksforgeeks/_06_sorting/_11_MinimumDifferenceInArray.java) | `Sorting/src/_11_MinimumDifferenceInArray.java` |
| Sorting | [_12_SegregatePositiveAndNegative.java](src/geeksforgeeks/_06_sorting/_12_SegregatePositiveAndNegative.java) | `Sorting/src/_12_SegregatePositiveAndNegative.java` |
| Strings | [_01_PrintOccurrencesInSortedManner.java](src/geeksforgeeks/_07_strings/_01_PrintOccurrencesInSortedManner.java) | `Strings/src/_01_PrintOccurrencesInSortedManner.java` |
| Strings | [_02_StringMethods.java](src/geeksforgeeks/_07_strings/_02_StringMethods.java) | `Strings/src/_02_StringMethods.java` |
| Strings | [_03_PalindromeCheck.java](src/geeksforgeeks/_07_strings/_03_PalindromeCheck.java) | `Strings/src/_03_PalindromeCheck.java` |
| Strings | [_04_SubstringOfOtherString.java](src/geeksforgeeks/_07_strings/_04_SubstringOfOtherString.java) | `Strings/src/_04_SubstringOfOtherString.java` |
| Strings | [_05_AnagramCheck.java](src/geeksforgeeks/_07_strings/_05_AnagramCheck.java) | `Strings/src/_05_AnagramCheck.java` |
| Strings | [_06_LeftMostRepeatingCharacter.java](src/geeksforgeeks/_07_strings/_06_LeftMostRepeatingCharacter.java) | `Strings/src/_06_LeftMostRepeatingCharacter.java` |
| Strings | [_07_LeftMostNonRepeatingCharacter.java](src/geeksforgeeks/_07_strings/_07_LeftMostNonRepeatingCharacter.java) | `Strings/src/_07_LeftMostNonRepeatingCharacter.java` |
| Strings | [_08_ReverseWordsInString.java](src/geeksforgeeks/_07_strings/_08_ReverseWordsInString.java) | `Strings/src/_08_ReverseWordsInString.java` |
| Strings | [_09_PermutationsOfAString.java](src/geeksforgeeks/_07_strings/_09_PermutationsOfAString.java) | `Strings/src/_09_PermutationsOfAString.java` |
| Strings / pattern_searching | [_01_PatternSearchingNaive.java](src/geeksforgeeks/_07_strings/pattern_searching/_01_PatternSearchingNaive.java) | `Strings/src/PatternSearching/_01_PatternSearchingNaive.java` |
| Strings / pattern_searching | [_02_PatternSearchingDistinctNaive.java](src/geeksforgeeks/_07_strings/pattern_searching/_02_PatternSearchingDistinctNaive.java) | `Strings/src/PatternSearching/_02_PatternSearchingDistinctNaive.java` |

## LeetCode (181 files)

| Topic | File | Originally |
|---|---|---|
| Arrays | [_01_ApplyOpsAndMoveZeros_2460.java](src/leetcode/_01_arrays/_01_ApplyOpsAndMoveZeros_2460.java) * | `Leetcode/Arrays/src/Apply_Ops_and_Move_Zeros.java` |
| Arrays | [_02_BeautifulPairs_2748.java](src/leetcode/_01_arrays/_02_BeautifulPairs_2748.java) * | `Leetcode/Arrays/src/Beautiful_Pairs.java` |
| Arrays | [_03_ContainsDuplicateII_219.java](src/leetcode/_01_arrays/_03_ContainsDuplicateII_219.java) * | `Leetcode/Arrays/src/Contains_Duplicate_II.java` |
| Arrays | [_04_DistinctIntegerAfterReversal_2442.java](src/leetcode/_01_arrays/_04_DistinctIntegerAfterReversal_2442.java) * | `Leetcode/Arrays/src/Distinct_Integer_After_Reversal.java` |
| Arrays | [_05_FindDifferenceOfTwoArrays_2215.java](src/leetcode/_01_arrays/_05_FindDifferenceOfTwoArrays_2215.java) * | `Leetcode/Arrays/src/Find_Difference_Of_Two_Arrays.java` |
| Arrays | [_06_FindSubArraysWithEqualSum_2395.java](src/leetcode/_01_arrays/_06_FindSubArraysWithEqualSum_2395.java) * | `Leetcode/Arrays/src/Find_SubArrays_With_Equal_Sum.java` |
| Arrays | [_07_FindTheDuplicateNumber_287.java](src/leetcode/_01_arrays/_07_FindTheDuplicateNumber_287.java) * | `Leetcode/Arrays/src/Find_The_Duplicate_Number.java` |
| Arrays | [_08_FizzBuzz_412.java](src/leetcode/_01_arrays/_08_FizzBuzz_412.java) * | `Leetcode/Arrays/src/FizzBuzz.java` |
| Arrays | [_09_IndexOfFirstAndLastOccurrence_34.java](src/leetcode/_01_arrays/_09_IndexOfFirstAndLastOccurrence_34.java) * | `Leetcode/Arrays/src/Index_Of_First_And_Last_Occurrence.java` |
| Arrays | [_10_IntersectionOfTwoArrays_349.java](src/leetcode/_01_arrays/_10_IntersectionOfTwoArrays_349.java) * | `Leetcode/Arrays/src/Intersection_Of_Two_Arrays.java` |
| Arrays | [_11_KthMissingPositiveNumber_1539.java](src/leetcode/_01_arrays/_11_KthMissingPositiveNumber_1539.java) * | `Leetcode/Arrays/src/Kth_Missing_Positive_Number.java` |
| Arrays | [_12_LongestEqualSubArray_2831.java](src/leetcode/_01_arrays/_12_LongestEqualSubArray_2831.java) * | `Leetcode/Arrays/src/Longest_Equal_SubArray.java` |
| Arrays | [_13_LongestHarmoniusSubsequence_594.java](src/leetcode/_01_arrays/_13_LongestHarmoniusSubsequence_594.java) * | `Leetcode/Arrays/src/Longest_Harmonius_Subsequence.java` |
| Arrays | [_14_LongestSubarrayWithAbsDiffK_1438.java](src/leetcode/_01_arrays/_14_LongestSubarrayWithAbsDiffK_1438.java) * | `Leetcode/Arrays/src/Longest_Subarray_With_AbsDiff_K.java` |
| Arrays | [_15_MajorityElement_169.java](src/leetcode/_01_arrays/_15_MajorityElement_169.java) * | `Leetcode/Arrays/src/Majority_Element.java` |
| Arrays | [_16_MaxAvgSubArrayI_643.java](src/leetcode/_01_arrays/_16_MaxAvgSubArrayI_643.java) * | `Leetcode/Arrays/src/Max_Avg_SubArray_I.java` |
| Arrays | [_17_MaxConsecutiveOnes_485.java](src/leetcode/_01_arrays/_17_MaxConsecutiveOnes_485.java) * | `Leetcode/Arrays/src/Max_Consecutive_Ones.java` |
| Arrays | [_18_MaxNumberOfKSumPairs_1679.java](src/leetcode/_01_arrays/_18_MaxNumberOfKSumPairs_1679.java) * | `Leetcode/Arrays/src/Max_Number_Of_KSum_Pairs.java` |
| Arrays | [_19_MaxSumWithExactlyKElements_2656.java](src/leetcode/_01_arrays/_19_MaxSumWithExactlyKElements_2656.java) * | `Leetcode/Arrays/src/Max_Sum_With_Exactly_K_Elements.java` |
| Arrays | [_20_MaximumAscendingSubarraySum_1800.java](src/leetcode/_01_arrays/_20_MaximumAscendingSubarraySum_1800.java) * | `Leetcode/Arrays/src/Maximum_Ascending_Subarray_Sum.java` |
| Arrays | [_21_MaximumProductOf3Numbers_628.java](src/leetcode/_01_arrays/_21_MaximumProductOf3Numbers_628.java) * | `Leetcode/Arrays/src/Maximum_Product_Of_3_Numbers.java` |
| Arrays | [_22_MissingNumber_268.java](src/leetcode/_01_arrays/_22_MissingNumber_268.java) * | `Leetcode/Arrays/src/Missing_Number.java` |
| Arrays | [_23_NumberOfPairsWithAbsDiffK_2006.java](src/leetcode/_01_arrays/_23_NumberOfPairsWithAbsDiffK_2006.java) * | `Leetcode/Arrays/src/Number_Of_Pairs_With_Abs_Diff_K.java` |
| Arrays | [_24_PlusOne_66.java](src/leetcode/_01_arrays/_24_PlusOne_66.java) * | `Leetcode/Arrays/src/Plus_One.java` |
| Arrays | [_25_ProductOfArrayExceptSelf_238.java](src/leetcode/_01_arrays/_25_ProductOfArrayExceptSelf_238.java) * | `Leetcode/Arrays/src/Product_Of_Array_Except_Self.java` |
| Arrays | [_26_RemoveDuplicateElements_26.java](src/leetcode/_01_arrays/_26_RemoveDuplicateElements_26.java) * | `Leetcode/Arrays/src/Remove_Duplicate_Elements.java` |
| Arrays | [_27_RemoveElement_27.java](src/leetcode/_01_arrays/_27_RemoveElement_27.java) * | `Leetcode/Arrays/src/Remove_Element.java` |
| Arrays | [_28_RotateArray_189.java](src/leetcode/_01_arrays/_28_RotateArray_189.java) * | `Leetcode/Arrays/src/Rotate_Array.java` |
| Arrays | [_29_SearchInsertPosition_35.java](src/leetcode/_01_arrays/_29_SearchInsertPosition_35.java) * | `Leetcode/Arrays/src/Search_Insert_Position.java` |
| Arrays | [_30_StockBuyAndSell_121.java](src/leetcode/_01_arrays/_30_StockBuyAndSell_121.java) * | `Leetcode/Arrays/src/Stock_Buy_And_Sell.java` |
| Arrays | [_31_ThirdMaximum_414.java](src/leetcode/_01_arrays/_31_ThirdMaximum_414.java) * | `Leetcode/Arrays/src/Third_Maximum.java` |
| Arrays | [_32_ThreeSum_15.java](src/leetcode/_01_arrays/_32_ThreeSum_15.java) * | `Leetcode/Arrays/src/Three_Sum.java` |
| Arrays | [_33_TwoSum_1.java](src/leetcode/_01_arrays/_33_TwoSum_1.java) * | `Leetcode/Arrays/src/Two_Sum.java` |
| Arrays | [_34_TwoSumIISortedArray_167.java](src/leetcode/_01_arrays/_34_TwoSumIISortedArray_167.java) * | `Leetcode/Arrays/src/Two_Sum_II_Sorted_Array.java` |
| Arrays | [_35_LongestEvenOddSubarrayThreshold_2760.java](src/leetcode/_01_arrays/_35_LongestEvenOddSubarrayThreshold_2760.java) | `Leetcode/Arrays_II/src/_01_LongestEvenOddSubarrayThreshold_2760.java` |
| Arrays | [_36_LongestIncreasingSubsequence_300.java](src/leetcode/_01_arrays/_36_LongestIncreasingSubsequence_300.java) | `Leetcode/Arrays_II/src/_02_LongestIncreasingSubsequence_300.java` |
| Arrays | [_37_ArrayPartition_561.java](src/leetcode/_01_arrays/_37_ArrayPartition_561.java) | `Leetcode/Arrays_II/src/_03_ArrayPartition_561.java` |
| Arrays | [_38_MinimumCommonValue_2540.java](src/leetcode/_01_arrays/_38_MinimumCommonValue_2540.java) | `Leetcode/Arrays_II/src/_04_MinimumCommonValue_2540.java` |
| Arrays | [_39_IntersectionTwoArraysII_350.java](src/leetcode/_01_arrays/_39_IntersectionTwoArraysII_350.java) | `Leetcode/Arrays_II/src/_05_IntersectionTwoArraysII_350.java` |
| Arrays | [_40_Permutations_46.java](src/leetcode/_01_arrays/_40_Permutations_46.java) | `Leetcode/Arrays_II/src/_06_Permutations_46.java` |
| Arrays | [_41_4Sum_18.java](src/leetcode/_01_arrays/_41_4Sum_18.java) | `Leetcode/Arrays_II/src/_07_4Sum_18.java` |
| Arrays | [_42_Permutations_46.java](src/leetcode/_01_arrays/_42_Permutations_46.java) | `Arrays 2/src/_01_Permutations_46.java` |
| Arrays | [_43_LongestIncreasingSubsequence_674.java](src/leetcode/_01_arrays/_43_LongestIncreasingSubsequence_674.java) | `Leetcode 2/Arrays/_01_Easy/_01_LongestIncreasingSubsequence_674.java` |
| Arrays | [_44_FindDisappearedNumbers_448.java](src/leetcode/_01_arrays/_44_FindDisappearedNumbers_448.java) | `Leetcode 2/Arrays/_01_Easy/_02_FindDisappearedNumbers_448.java` |
| Arrays | [_45_FindMissingAndRepeatedValues_2965.java](src/leetcode/_01_arrays/_45_FindMissingAndRepeatedValues_2965.java) | `Leetcode 2/Arrays/_01_Easy/_03_FindMissingAndRepeatedValues_2965.java` |
| Arrays | [_46_DivideArrayEqualParts_2206.java](src/leetcode/_01_arrays/_46_DivideArrayEqualParts_2206.java) | `Leetcode 2/Arrays/_01_Easy/_04_DivideArrayEqualParts_2206.java` |
| Arrays | [_47_SummaryRanges_228.java](src/leetcode/_01_arrays/_47_SummaryRanges_228.java) | `Leetcode 2/Arrays/_01_Easy/_05_SummaryRanges_228.java` |
| Arrays | [_48_PascalTriangle_118.java](src/leetcode/_01_arrays/_48_PascalTriangle_118.java) | `Leetcode 2/Arrays/_01_Easy/_06_PascalTriangle_118.java` |
| Arrays | [_49_MaximumSumSubArray_53.java](src/leetcode/_01_arrays/_49_MaximumSumSubArray_53.java) | `Leetcode 2/Arrays/_02_Medium/_01_MaximumSumSubArray_53.java` |
| Arrays | [_50_MaximumProductSubArray_152.java](src/leetcode/_01_arrays/_50_MaximumProductSubArray_152.java) | `Leetcode 2/Arrays/_02_Medium/_02_MaximumProductSubArray_152.java` |
| Arrays | [_51_PeakElement_162.java](src/leetcode/_01_arrays/_51_PeakElement_162.java) | `Leetcode 2/Arrays/_02_Medium/_03_PeakElement_162.java` |
| Arrays | [_52_PeakIdxMountainArray_852.java](src/leetcode/_01_arrays/_52_PeakIdxMountainArray_852.java) | `Leetcode 2/Arrays/_02_Medium/_04_PeakIdxMountainArray_852.java` |
| Arrays | [_53_ThreeSumClosest_16.java](src/leetcode/_01_arrays/_53_ThreeSumClosest_16.java) | `Leetcode 2/Arrays/_02_Medium/_05_ThreeSumClosest_16.java` |
| Arrays | [_54_LargestNumber_179_TODO.java](src/leetcode/_01_arrays/_54_LargestNumber_179_TODO.java) | `Leetcode 2/Arrays/_02_Medium/_06_LargestNumber_179_TODO.java` |
| Arrays | [_55_PartitionArrayAccordingToPivot_2161.java](src/leetcode/_01_arrays/_55_PartitionArrayAccordingToPivot_2161.java) | `Leetcode 2/Arrays/_02_Medium/_07_PartitionArrayAccordingToPivot_2161.java` |
| Arrays | [_56_ContainerWithMostWater_11.java](src/leetcode/_01_arrays/_56_ContainerWithMostWater_11.java) | `Leetcode 2/Arrays/_02_Medium/_08_ContainerWithMostWater_11.java` |
| Arrays | [_57_LongestIncreasingSubsequence_300.java](src/leetcode/_01_arrays/_57_LongestIncreasingSubsequence_300.java) | `Leetcode 2/Arrays/_02_Medium/_09_LongestIncreasingSubsequence_300.java` |
| Arrays | [_58_MinimumOperationsToFlipBinaryElements_3191.java](src/leetcode/_01_arrays/_58_MinimumOperationsToFlipBinaryElements_3191.java) | `Leetcode 2/Arrays/_02_Medium/_10_MinimumOperationsToFlipBinaryElements_3191.java` |
| Arrays | [_59_Subsets_78.java](src/leetcode/_01_arrays/_59_Subsets_78.java) | `Leetcode 2/Arrays/_02_Medium/_11_Subsets_78.java` |
| Arrays | [_60_RemoveDuplicatesFromSortedArrayPart2_80.java](src/leetcode/_01_arrays/_60_RemoveDuplicatesFromSortedArrayPart2_80.java) | `Leetcode 2/Arrays/_02_Medium/_12_RemoveDuplicatesFromSortedArrayPart2_80.java` |
| Arrays | [_61_FirstMissingPositive_41.java](src/leetcode/_01_arrays/_61_FirstMissingPositive_41.java) | `Leetcode 2/Arrays/_03_Hard/_01_FirstMissingPositive_41.java` |
| Arrays | [_62_TrappingRainWater_42.java](src/leetcode/_01_arrays/_62_TrappingRainWater_42.java) | `Leetcode 2/Arrays/_03_Hard/_02_TrappingRainWater_42.java` |
| Strings | [_01_ValidPalindrome_125.java](src/leetcode/_02_strings/_01_ValidPalindrome_125.java) | `Leetcode 2/Strings/_01_Easy/_01_ValidPalindrome_125.java` |
| Strings | [_02_NeedleInHaystack_28.java](src/leetcode/_02_strings/_02_NeedleInHaystack_28.java) | `Leetcode 2/Strings/_01_Easy/_02_NeedleInHaystack_28.java` |
| Strings | [_03_LengthOfLastWord_58.java](src/leetcode/_02_strings/_03_LengthOfLastWord_58.java) | `Leetcode 2/Strings/_01_Easy/_03_LengthOfLastWord_58.java` |
| Strings | [_04_ValidAnagram_242.java](src/leetcode/_02_strings/_04_ValidAnagram_242.java) | `Leetcode 2/Strings/_01_Easy/_04_ValidAnagram_242.java` |
| Strings | [_05_MergeStringsAlternately_1768.java](src/leetcode/_02_strings/_05_MergeStringsAlternately_1768.java) | `Leetcode 2/Strings/_01_Easy/_05_MergeStringsAlternately_1768.java` |
| Strings | [_06_GCDofString_1071.java](src/leetcode/_02_strings/_06_GCDofString_1071.java) | `Leetcode 2/Strings/_01_Easy/_06_GCDofString_1071.java` |
| Strings | [_07_ReverseVowels_345.java](src/leetcode/_02_strings/_07_ReverseVowels_345.java) | `Leetcode 2/Strings/_01_Easy/_07_ReverseVowels_345.java` |
| Strings | [_08_IsomorphicStrings_205.java](src/leetcode/_02_strings/_08_IsomorphicStrings_205.java) | `Leetcode 2/Strings/_01_Easy/_08_IsomorphicStrings_205.java` |
| Strings | [_09_FirstUniqueChar_387.java](src/leetcode/_02_strings/_09_FirstUniqueChar_387.java) | `Leetcode 2/Strings/_01_Easy/_09_FirstUniqueChar_387.java` |
| Strings | [_10_RomanToInteger_13.java](src/leetcode/_02_strings/_10_RomanToInteger_13.java) | `Leetcode 2/Strings/_01_Easy/_10_RomanToInteger_13.java` |
| Strings | [_11_IsSubsequence_392.java](src/leetcode/_02_strings/_11_IsSubsequence_392.java) | `Leetcode 2/Strings/_01_Easy/_11_IsSubsequence_392.java` |
| Strings | [_12_ValidParenthesis_20.java](src/leetcode/_02_strings/_12_ValidParenthesis_20.java) | `Leetcode 2/Strings/_01_Easy/_12_ValidParenthesis_20.java` |
| Strings | [_13_WordPattern_290.java](src/leetcode/_02_strings/_13_WordPattern_290.java) | `Leetcode 2/Strings/_01_Easy/_13_WordPattern_290.java` |
| Strings | [_14_LongestNiceSubstring_1763.java](src/leetcode/_02_strings/_14_LongestNiceSubstring_1763.java) | `Leetcode 2/Strings/_01_Easy/_14_LongestNiceSubstring_1763.java` |
| Strings | [_15_SubstringsOfSize3WithDistinctCharacters_1876.java](src/leetcode/_02_strings/_15_SubstringsOfSize3WithDistinctCharacters_1876.java) | `Leetcode 2/Strings/_01_Easy/_15_SubstringsOfSize3WithDistinctCharacters_1876.java` |
| Strings | [_16_SmallestLetterGreaterThanTarget_744.java](src/leetcode/_02_strings/_16_SmallestLetterGreaterThanTarget_744.java) | `Leetcode 2/Strings/_01_Easy/_16_SmallestLetterGreaterThanTarget_744.java` |
| Strings | [_17_FindTheDifference_389.java](src/leetcode/_02_strings/_17_FindTheDifference_389.java) | `Leetcode 2/Strings/_01_Easy/_17_FindTheDifference_389.java` |
| Strings | [_18_RansomNote_383.java](src/leetcode/_02_strings/_18_RansomNote_383.java) | `Leetcode 2/Strings/_01_Easy/_18_RansomNote_383.java` |
| Strings | [_19_DetectCapital_520_TODO.java](src/leetcode/_02_strings/_19_DetectCapital_520_TODO.java) | `Leetcode 2/Strings/_01_Easy/_19_DetectCapital_520_TODO.java` |
| Strings | [_20_ReverseWordsInStringIII_557.java](src/leetcode/_02_strings/_20_ReverseWordsInStringIII_557.java) | `Leetcode 2/Strings/_01_Easy/_20_ReverseWordsInString_III_557.java` |
| Strings | [_21_MinRecolorsToGetConsecutiveBlack_2379.java](src/leetcode/_02_strings/_21_MinRecolorsToGetConsecutiveBlack_2379.java) | `Leetcode 2/Strings/_01_Easy/_21_MinRecolorsToGetConsecutiveBlack_2379.java` |
| Strings | [_22_LongestCommonPrefix_14.java](src/leetcode/_02_strings/_22_LongestCommonPrefix_14.java) | `Leetcode 2/Strings/_01_Easy/_22_LongestCommonPrefix_14.java` |
| Strings | [_23_RotateString_796.java](src/leetcode/_02_strings/_23_RotateString_796.java) | `Leetcode 2/Strings/_01_Easy/_23_RotateString_796.java` |
| Strings | [_24_LongestSubstringWithoutRepeatingCharacters_3.java](src/leetcode/_02_strings/_24_LongestSubstringWithoutRepeatingCharacters_3.java) | `Leetcode 2/Strings/_02_Medium/_01_LongestSubstringWithoutRepeatingCharacters_3.java` |
| Strings | [_25_PermutationsInAString_567.java](src/leetcode/_02_strings/_25_PermutationsInAString_567.java) | `Leetcode 2/Strings/_02_Medium/_02_PermutationsInAString_567.java` |
| Strings | [_26_ReverseWordsInString_151.java](src/leetcode/_02_strings/_26_ReverseWordsInString_151.java) | `Leetcode 2/Strings/_02_Medium/_03_ReverseWordsInString_151.java` |
| Strings | [_27_NumberOfMatchingSubsequence_792.java](src/leetcode/_02_strings/_27_NumberOfMatchingSubsequence_792.java) | `Leetcode 2/Strings/_02_Medium/_04_NumberOfMatchingSubsequence_792.java` |
| Strings | [_28_LongestPalindromicSubstring_5.java](src/leetcode/_02_strings/_28_LongestPalindromicSubstring_5.java) | `Leetcode 2/Strings/_02_Medium/_05_LongestPalindromicSubstring_5.java` |
| Strings | [_29_FindandReplacePattern_890.java](src/leetcode/_02_strings/_29_FindandReplacePattern_890.java) | `Leetcode 2/Strings/_02_Medium/_06_FindandReplacePattern_890.java` |
| Strings | [_30_WordBreak_139.java](src/leetcode/_02_strings/_30_WordBreak_139.java) | `Leetcode 2/Strings/_02_Medium/_07_WordBreak_139.java` |
| Strings | [_31_ZigzagCoversion_6.java](src/leetcode/_02_strings/_31_ZigzagCoversion_6.java) | `Leetcode 2/Strings/_02_Medium/_08_ZigzagCoversion_6.java` |
| Strings | [_32_MultiplyStrings_43.java](src/leetcode/_02_strings/_32_MultiplyStrings_43.java) | `Leetcode 2/Strings/_02_Medium/_11_MultiplyStrings_43.java` |
| Strings | [_33_CountAndSay_38.java](src/leetcode/_02_strings/_33_CountAndSay_38.java) | `Leetcode 2/Strings/_02_Medium/_12_CountAndSay_38.java` |
| Strings | [_34_GroupAnagrams_49.java](src/leetcode/_02_strings/_34_GroupAnagrams_49.java) | `Leetcode 2/Strings/_02_Medium/_13_GroupAnagrams_49.java` |
| Strings | [_35_StringToInteger_8.java](src/leetcode/_02_strings/_35_StringToInteger_8.java) | `Leetcode 2/Strings/_02_Medium/_14_StringToInteger_8.java` |
| Strings | [_36_SubstringWithConcatenationOfWords_30.java](src/leetcode/_02_strings/_36_SubstringWithConcatenationOfWords_30.java) | `Leetcode 2/Strings/_03_Hard/_01_SubstringWithConcatenationOfWords_30.java` |
| Strings | [_37_LongestValidParenthesis_32.java](src/leetcode/_02_strings/_37_LongestValidParenthesis_32.java) | `Leetcode 2/Strings/_03_Hard/_02_LongestValidParenthesis_32.java` |
| Strings | [_38_RegexMatching_10.java](src/leetcode/_02_strings/_38_RegexMatching_10.java) | `Leetcode 2/Strings/_03_Hard/_03_RegexMatching_10.java` |
| Sliding Window | [_01_MinimumSizeSubArraySum_209.java](src/leetcode/_03_sliding_window/_01_MinimumSizeSubArraySum_209.java) | `Leetcode 2/Arrays/_02_Medium/SlidingWindow/src/_06_MinimumSizeSubArraySum_209.java` |
| Sliding Window | [_02_RepeatedDnaSequence_187.java](src/leetcode/_03_sliding_window/_02_RepeatedDnaSequence_187.java) | `Leetcode 2/Strings/_02_Medium/SlidingWindow/src/_09_RepeatedDnaSequence_187.java` |
| Sliding Window | [_03_LongestSubStringWithAtleastKRepeatingCharacters_395.java](src/leetcode/_03_sliding_window/_03_LongestSubStringWithAtleastKRepeatingCharacters_395.java) | `Leetcode 2/Strings/_02_Medium/SlidingWindow/src/_10_LongestSubStringWithAtleastKRepeatingCharacters_395.java` |
| Sliding Window | [_04_ContinuousSubarraySum_523.java](src/leetcode/_03_sliding_window/_04_ContinuousSubarraySum_523.java) | `Leetcode 2/Sliding Window/Medium/_01_ContinuousSubarraySum_523.java` |
| Sliding Window | [_05_SubStringWithConcatOfAllWords_30.java](src/leetcode/_03_sliding_window/_05_SubStringWithConcatOfAllWords_30.java) | `Leetcode 2/Sliding Window/Hard/_01_SubStringWithConcatOfAllWords_30.java` |
| Binary Search | [_01_FirstBadVersion_278.java](src/leetcode/_04_binary_search/_01_FirstBadVersion_278.java) | `Leetcode 2/Binary Search/Easy/_01_FirstBadVersion_278.java` |
| Binary Search | [_02_GuessNumberHigherOrLower_374.java](src/leetcode/_04_binary_search/_02_GuessNumberHigherOrLower_374.java) | `Leetcode 2/Binary Search/Easy/_02_GuessNumberHigherOrLower_374.java` |
| Binary Search | [_03_MaxCountOfPositivesAndNegatives_2529.java](src/leetcode/_04_binary_search/_03_MaxCountOfPositivesAndNegatives_2529.java) | `Leetcode 2/Binary Search/Easy/_03_MaxCountOfPositivesAndNegatives_2529.java` |
| Binary Search | [_04_SingleElementSortedArray_540.java](src/leetcode/_04_binary_search/_04_SingleElementSortedArray_540.java) | `Leetcode 2/Binary Search/Medium/_01_SingleElementSortedArray_540.java` |
| Binary Search | [_05_SearchInRotatedArray_33.java](src/leetcode/_04_binary_search/_05_SearchInRotatedArray_33.java) | `Leetcode 2/Binary Search/Medium/_02_SearchInRotatedArray_33.java` |
| Binary Search | [_06_SearchInRotatedArrayPart2_81.java](src/leetcode/_04_binary_search/_06_SearchInRotatedArrayPart2_81.java) | `Leetcode 2/Binary Search/Medium/_03_SearchInRotatedArrayPart2_81.java` |
| Binary Search | [_07_Search2DSortedMatrix_74.java](src/leetcode/_04_binary_search/_07_Search2DSortedMatrix_74.java) | `Leetcode 2/Binary Search/Medium/_04_Search2DSortedMatrix_74.java` |
| Binary Search | [_08_Search2dSortedMatrixPart2_240.java](src/leetcode/_04_binary_search/_08_Search2dSortedMatrixPart2_240.java) | `Leetcode 2/Binary Search/Medium/_05_Search2dSortedMatrixPart2_240.java` |
| Sorting | [_01_MergeTwoSortedArr_88.java](src/leetcode/_05_sorting/_01_MergeTwoSortedArr_88.java) | `Leetcode/Sorting/_01_MergeTwoSortedArr_88.java` |
| Matrix | [_01_TransposeMatrix_867.java](src/leetcode/_06_matrix/_01_TransposeMatrix_867.java) | `Leetcode 2/Matrix/Easy/_01_TransposeMatrix_867.java` |
| Matrix | [_02_SpiralMatrix_54.java](src/leetcode/_06_matrix/_02_SpiralMatrix_54.java) | `Leetcode 2/Matrix/Medium/_01_SpiralMatrix_54.java` |
| Matrix | [_03_SpiralMatrix2_59.java](src/leetcode/_06_matrix/_03_SpiralMatrix2_59.java) | `Leetcode 2/Matrix/Medium/_02_SpiralMatrix2_59.java` |
| Matrix | [_04_RotateImage_48.java](src/leetcode/_06_matrix/_04_RotateImage_48.java) | `Leetcode 2/Matrix/Medium/_03_RotateImage_48.java` |
| Matrix | [_05_ValidSudoku_36.java](src/leetcode/_06_matrix/_05_ValidSudoku_36.java) | `Leetcode 2/Matrix/Medium/_04_ValidSudoku_36.java` |
| Matrix | [_06_SudokuSolver_37.java](src/leetcode/_06_matrix/_06_SudokuSolver_37.java) | `Leetcode 2/Matrix/Hard/_01_SudokuSolver_37.java` |
| Stack | [_01_BaseballGame_682.java](src/leetcode/_07_stack/_01_BaseballGame_682.java) | `Leetcode 2/Stack/Easy/_01_BaseballGame_682.java` |
| Backtracking | [_01_GenerateParenthesis_22.java](src/leetcode/_08_backtracking/_01_GenerateParenthesis_22.java) | `Leetcode 2/Backtracking/Medium/_01_GenerateParenthesis_22.java` |
| Backtracking | [_02_LetterCombinationsPhone_17.java](src/leetcode/_08_backtracking/_02_LetterCombinationsPhone_17.java) | `Leetcode 2/Backtracking/Medium/_02_LetterCombinationsPhone_17.java` |
| Backtracking | [_03_NextPermutation_31.java](src/leetcode/_08_backtracking/_03_NextPermutation_31.java) | `Leetcode 2/Backtracking/Medium/_03_NextPermutation_31.java` |
| Backtracking | [_04_CombinationSumPart1_39.java](src/leetcode/_08_backtracking/_04_CombinationSumPart1_39.java) | `Leetcode 2/Backtracking/Medium/_04_CombinationSumPart1_39.java` |
| Backtracking | [_05_CombinationSumPart2_40.java](src/leetcode/_08_backtracking/_05_CombinationSumPart2_40.java) | `Leetcode 2/Backtracking/Medium/_05_CombinationSumPart2_40.java` |
| Backtracking | [_06_Combinations_77.java](src/leetcode/_08_backtracking/_06_Combinations_77.java) | `Leetcode 2/Backtracking/Medium/_06_Combinations_77.java` |
| Backtracking | [_07_PermutationsPart2_47.java](src/leetcode/_08_backtracking/_07_PermutationsPart2_47.java) | `Leetcode 2/Backtracking/Medium/_08_PermutationsPart2_47.java` |
| Backtracking | [_08_NQueens_51.java](src/leetcode/_08_backtracking/_08_NQueens_51.java) | `Leetcode 2/Backtracking/Hard/_01_NQueens_51.java` |
| Greedy | [_01_JumpGamePart1_55.java](src/leetcode/_09_greedy/_01_JumpGamePart1_55.java) | `Leetcode 2/Greedy/Medium/_01_JumpGamePart1_55.java` |
| Greedy | [_02_JumpGamePart2_45.java](src/leetcode/_09_greedy/_02_JumpGamePart2_45.java) | `Leetcode 2/Greedy/Medium/_02_JumpGamePart2_45.java` |
| Dynamic Programming | [_01_PascalTriangle_118.java](src/leetcode/_10_dynamic_programming/_01_PascalTriangle_118.java) | `Leetcode 2/Dynamic Programming/Easy/_01_PascalTriangle_118.java` |
| Dynamic Programming | [_02_PascalTrianglePart2_119.java](src/leetcode/_10_dynamic_programming/_02_PascalTrianglePart2_119.java) | `Leetcode 2/Dynamic Programming/Easy/_02_PascalTrianglePart2_119.java` |
| Dynamic Programming | [_03_WordBreak_139.java](src/leetcode/_10_dynamic_programming/_03_WordBreak_139.java) | `Leetcode 2/Dynamic Programming/Medium/_01_WordBreak_139.java` |
| Bit Manipulation | [_01_AddBinaryString_67.java](src/leetcode/_11_bit_manipulation/_01_AddBinaryString_67.java) * | `Leetcode/Bit Manipulation/Add_Binary_String.java` |
| Bit Manipulation | [_02_AlternatingBits_693.java](src/leetcode/_11_bit_manipulation/_02_AlternatingBits_693.java) * | `Leetcode/Bit Manipulation/Alternating_Bits.java` |
| Bit Manipulation | [_03_CountingBits_338.java](src/leetcode/_11_bit_manipulation/_03_CountingBits_338.java) * | `Leetcode/Bit Manipulation/Counting_Bits.java` |
| Bit Manipulation | [_04_Divide2Integers_29.java](src/leetcode/_11_bit_manipulation/_04_Divide2Integers_29.java) * | `Leetcode/Bit Manipulation/Divide_2_Integers.java` |
| Bit Manipulation | [_05_HammingDistance_461.java](src/leetcode/_11_bit_manipulation/_05_HammingDistance_461.java) * | `Leetcode/Bit Manipulation/Hamming_Distance.java` |
| Bit Manipulation | [_06_MaximumOddBinaryNumber_2864.java](src/leetcode/_11_bit_manipulation/_06_MaximumOddBinaryNumber_2864.java) * | `Leetcode/Bit Manipulation/Maximum_Odd_Binary_Number.java` |
| Bit Manipulation | [_07_NumberComplement_476.java](src/leetcode/_11_bit_manipulation/_07_NumberComplement_476.java) * | `Leetcode/Bit Manipulation/Number_Complement.java` |
| Bit Manipulation | [_08_ReverseBits_190.java](src/leetcode/_11_bit_manipulation/_08_ReverseBits_190.java) * | `Leetcode/Bit Manipulation/Reverse_Bits.java` |
| Bit Manipulation | [_09_SingleNumber_136.java](src/leetcode/_11_bit_manipulation/_09_SingleNumber_136.java) * | `Leetcode/Bit Manipulation/Single_Number.java` |
| Bit Manipulation | [_10_SingleNumberII_137.java](src/leetcode/_11_bit_manipulation/_10_SingleNumberII_137.java) * | `Leetcode/Bit Manipulation/Single_Number_II.java` |
| Bit Manipulation | [_11_XORArray_1486.java](src/leetcode/_11_bit_manipulation/_11_XORArray_1486.java) * | `Leetcode/Bit Manipulation/XOR_Array.java` |
| Bit Manipulation | [_12_SortElementsByCountOfSetBits_1356.java](src/leetcode/_11_bit_manipulation/_12_SortElementsByCountOfSetBits_1356.java) | `Leetcode 2/Bit Manipulation/Easy/_01_SortElementsByCountOfSetBits_1356.java` |
| Bit Manipulation | [_13_BitwiseAndOfNumbersInRange_201.java](src/leetcode/_11_bit_manipulation/_13_BitwiseAndOfNumbersInRange_201.java) | `Leetcode 2/Bit Manipulation/Medium/_01_BitwiseAndOfNumbersInRange_201.java` |
| Math | [_01_AddDigits_258.java](src/leetcode/_12_math/_01_AddDigits_258.java) * | `Leetcode/Mathematics/Add_Digits.java` |
| Math | [_02_BeautifulPairs_2748.java](src/leetcode/_12_math/_02_BeautifulPairs_2748.java) * | `Leetcode/Mathematics/Beautiful_Pairs.java` |
| Math | [_03_ClosestPrimePalindrome_866.java](src/leetcode/_12_math/_03_ClosestPrimePalindrome_866.java) * | `Leetcode/Mathematics/Closest_Prime_Palindrome.java` |
| Math | [_04_CountGoodNumbers_1922.java](src/leetcode/_12_math/_04_CountGoodNumbers_1922.java) * | `Leetcode/Mathematics/Count_Good_Numbers.java` |
| Math | [_05_DoubleReversal_2119.java](src/leetcode/_12_math/_05_DoubleReversal_2119.java) * | `Leetcode/Mathematics/Double_Reversal.java` |
| Math | [_06_GCDOfArray_1979.java](src/leetcode/_12_math/_06_GCDOfArray_1979.java) * | `Leetcode/Mathematics/GCD_of_Array.java` |
| Math | [_07_HappyNumber_202.java](src/leetcode/_12_math/_07_HappyNumber_202.java) * | `Leetcode/Mathematics/Happy_Number.java` |
| Math | [_08_KthFactorOfN_1492.java](src/leetcode/_12_math/_08_KthFactorOfN_1492.java) * | `Leetcode/Mathematics/Kth_Factor_Of_N.java` |
| Math | [_09_NumberOfCommonFactors_2427.java](src/leetcode/_12_math/_09_NumberOfCommonFactors_2427.java) * | `Leetcode/Mathematics/Number_of_Common_Factors.java` |
| Math | [_10_PalindromeNumber_9.java](src/leetcode/_12_math/_10_PalindromeNumber_9.java) * | `Leetcode/Mathematics/Palindrome_Number.java` |
| Math | [_11_PerfectNumber_507.java](src/leetcode/_12_math/_11_PerfectNumber_507.java) * | `Leetcode/Mathematics/Perfect_Number.java` |
| Math | [_12_PowerOf2_231.java](src/leetcode/_12_math/_12_PowerOf2_231.java) * | `Leetcode/Mathematics/Power_of_2.java` |
| Math | [_13_PowerOf3_326.java](src/leetcode/_12_math/_13_PowerOf3_326.java) * | `Leetcode/Mathematics/Power_of_3.java` |
| Math | [_14_PowerOf4_342.java](src/leetcode/_12_math/_14_PowerOf4_342.java) * | `Leetcode/Mathematics/Power_Of_4.java` |
| Math | [_15_PowerXN_50.java](src/leetcode/_12_math/_15_PowerXN_50.java) * | `Leetcode/Mathematics/Power_X_N.java` |
| Math | [_16_ReverseInteger_7.java](src/leetcode/_12_math/_16_ReverseInteger_7.java) * | `Leetcode/Mathematics/Reverse_Integer.java` |
| Math | [_17_SelfDividingNumbers_728.java](src/leetcode/_12_math/_17_SelfDividingNumbers_728.java) * | `Leetcode/Mathematics/Self_Dividing_Numbers.java` |
| Math | [_18_SpecialNums_3233.java](src/leetcode/_12_math/_18_SpecialNums_3233.java) * | `Leetcode/Mathematics/Special_Nums.java` |
| Math | [_19_SqrtX_69.java](src/leetcode/_12_math/_19_SqrtX_69.java) * | `Leetcode/Mathematics/Sqrt_X.java` |
| Math | [_20_SumOfNumberAndItsReverse_2443.java](src/leetcode/_12_math/_20_SumOfNumberAndItsReverse_2443.java) * | `Leetcode/Mathematics/Sum_Of_Number_and_Its_Reverse.java` |
| Math | [_21_UglyNum_263.java](src/leetcode/_12_math/_21_UglyNum_263.java) * | `Leetcode/Mathematics/Ugly_Num.java` |
| Math | [_22_UglyNumIII_1201.java](src/leetcode/_12_math/_22_UglyNumIII_1201.java) * | `Leetcode/Mathematics/Ugly_Num_III_1201.java` |
| Math | [_23_UglyNumber_264.java](src/leetcode/_12_math/_23_UglyNumber_264.java) * | `Leetcode/Mathematics/Ugly_Number_264.java` |
| Math | [_24_ValidPerfectSquare_367.java](src/leetcode/_12_math/_24_ValidPerfectSquare_367.java) * | `Leetcode/Mathematics/Valid_Perfect_Square.java` |
| Math | [_25_HappyNumber_202.java](src/leetcode/_12_math/_25_HappyNumber_202.java) | `Leetcode 2/Math/_01_Easy/_01_HappyNumber_202.java` |
| Math | [_26_ClimbingStairs_70.java](src/leetcode/_12_math/_26_ClimbingStairs_70.java) | `Leetcode 2/Math/_01_Easy/_02_ClimbingStairs_70.java` |
| Math | [_27_AddStrings_415.java](src/leetcode/_12_math/_27_AddStrings_415.java) | `Leetcode 2/Math/_01_Easy/_03_AddStrings_415.java` |
| Math | [_28_ClosestPrimeNumberInRange_2523.java](src/leetcode/_12_math/_28_ClosestPrimeNumberInRange_2523.java) | `Leetcode 2/Math/_02_Medium/_01_ClosestPrimeNumberInRange_2523.java` |
| Math | [_29_IsSumOfPowersOfThree_1780.java](src/leetcode/_12_math/_29_IsSumOfPowersOfThree_1780.java) | `Leetcode 2/Math/_02_Medium/_02_IsSumOfPowersOfThree_1780.java` |
| Math | [_30_TotalNumberOfColoredCells_2579.java](src/leetcode/_12_math/_30_TotalNumberOfColoredCells_2579.java) | `Leetcode 2/Math/_02_Medium/_03_TotalNumberOfColoredCells_2579.java` |
| Math | [_31_TrailingZeroesFactorial_172.java](src/leetcode/_12_math/_31_TrailingZeroesFactorial_172.java) | `Leetcode 2/Math/_02_Medium/_04_TrailingZeroesFactorial_172.java` |
| Math | [_32_IntegerToRoman_12.java](src/leetcode/_12_math/_32_IntegerToRoman_12.java) | `Leetcode 2/Math/_02_Medium/_05_IntegerToRoman_12.java` |
| Math | [_33_NumberOfDigitOne_233.java](src/leetcode/_12_math/_33_NumberOfDigitOne_233.java) | `Leetcode 2/Math/_03_Hard/_01_NumberOfDigitOne_233.java` |
| Math | [_34_PermutationSequence_60.java](src/leetcode/_12_math/_34_PermutationSequence_60.java) | `Leetcode 2/Math/_03_Hard/_02_PermutationSequence_60.java` |

## OOPS (8 files + notes)

| Topic | File | Originally |
|---|---|---|
|  | [Abstraction.java](src/oops/Abstraction.java) | `OOPS/src/Abstraction.java` |
|  | [Cat.java](src/oops/Cat.java) | `OOPS/src/Cat.java` |
|  | [Constructor.java](src/oops/Constructor.java) | `OOPS/src/Constructor.java` |
|  | [Inheritance.java](src/oops/Inheritance.java) | `OOPS/src/Inheritance.java` |
|  | [Interface.java](src/oops/Interface.java) | `OOPS/src/Interface.java` |
|  | [Numbers.java](src/oops/Numbers.java) | `OOPS/src/Numbers.java` |
|  | [Polymorphism.java](src/oops/Polymorphism.java) | `OOPS/src/Polymorphism.java` |
|  | [Static.java](src/oops/Static.java) | `OOPS/src/Static.java` |

## misc (31 files)

| Topic | File | Originally |
|---|---|---|
|  | [GfgArrays_EquilibriumPoint.java](misc/practice/GfgArrays_EquilibriumPoint.java) | `Arrays/src/PracticeZone/Equilibrium_Point.java` |
|  | [GfgArrays_FrequenciesOfElements.java](misc/practice/GfgArrays_FrequenciesOfElements.java) | `Arrays/src/PracticeZone/Frequencies_Of_Elements.java` |
|  | [GfgArrays_FrequencyOfElementsV2.java](misc/practice/GfgArrays_FrequencyOfElementsV2.java) | `Arrays/src/PracticeZone/Frequency_Of_Elements_V2.java` |
|  | [GfgArrays_MoveZerosToEnd.java](misc/practice/GfgArrays_MoveZerosToEnd.java) | `Arrays/src/PracticeZone/Move_Zeros_To_End.java` |
|  | [GfgBitMagic_LookUpTable.java](misc/practice/GfgBitMagic_LookUpTable.java) | `Bit Magic/PracticeZone/src/LookUpTable.java` |
|  | [GfgRecursion_SubsetSum.java](misc/practice/GfgRecursion_SubsetSum.java) | `Recursion/PracticeZone/src/SubsetSum.java` |
|  | [GfgSorting_BubbleSort.java](misc/practice/GfgSorting_BubbleSort.java) | `Sorting/src/PracticeZone/BubbleSort.java` |
|  | [GfgSorting_HoarePartition.java](misc/practice/GfgSorting_HoarePartition.java) | `Sorting/src/PracticeZone/HoarePartition.java` |
|  | [GfgSorting_MergeSort.java](misc/practice/GfgSorting_MergeSort.java) | `Sorting/src/PracticeZone/MergeSort.java` |
|  | [GfgSorting_SelectionSort.java](misc/practice/GfgSorting_SelectionSort.java) | `Sorting/src/PracticeZone/SelectionSort.java` |
|  | [GfgSorting_Scratch.java](misc/practice/GfgSorting_Scratch.java) | `Sorting/src/Main.java` |
|  | [GfgStrings_Scratch.java](misc/practice/GfgStrings_Scratch.java) | `Strings/src/Main.java` |
|  | [GfgMathematics_PracticeZone.java](misc/practice/GfgMathematics_PracticeZone.java) | `Mathematics/src/practice_zone.java` |
|  | [PracticeZone.java](misc/practice/PracticeZone.java) | `Practice Zone/src/practice_zone.java` |
|  | [Revision.java](misc/practice/Revision.java) | `Revision/src/Main.java` |
|  | [LcArrays_PermutationsScratch.java](misc/practice/LcArrays_PermutationsScratch.java) | `Arrays 2/src/Main.java` |
|  | [LcArrays_PermutationsSwapScratch.java](misc/practice/LcArrays_PermutationsSwapScratch.java) | `Leetcode/Arrays_II/src/Main.java` |
|  | [LcBits_DivideTwoIntegers.java](misc/practice/LcBits_DivideTwoIntegers.java) | `Leetcode/Bit Manipulation/PracticeZone/src/Divide_Two_Integers.java` |
|  | [LcMath_AddDigits.java](misc/practice/LcMath_AddDigits.java) | `Leetcode/Mathematics/PracticeZone/src/AddDigits.java` |
|  | [LcMath_UglyNumberIIIScratch.java](misc/practice/LcMath_UglyNumberIIIScratch.java) | `Leetcode/Mathematics/PracticeZone/src/Main.java` |
|  | [LcArrays_LongestSubArrayWithSumLessThanTarget.java](misc/practice/LcArrays_LongestSubArrayWithSumLessThanTarget.java) | `Leetcode 2/Arrays/_02_Medium/practiceZone/src/_01_LongestSubArrayWithSumLessThanTarget_SlidingWindow.java` |
|  | [LcContest.java](misc/practice/LcContest.java) | `Leetcode 2/Arrays/_03_Hard/contest.java` |
|  | [LcMatrix_Jewels.java](misc/practice/LcMatrix_Jewels.java) | `Leetcode 2/Matrix/Medium/practice/src/jewels.java` |
|  | [LcStrings_IsomorphicStrings.java](misc/practice/LcStrings_IsomorphicStrings.java) | `Leetcode 2/Strings/_01_Easy/PracticeZone/src/IsomorphicStrings.java` |
|  | [Sorting_Notes.txt](misc/notes/Sorting_Notes.txt) | `Sorting/src/Notes.txt` |
|  | [Strings_Notes.txt](misc/notes/Strings_Notes.txt) | `Strings/src/Notes.txt` |
|  | [Permutations_Notes.txt](misc/notes/Permutations_Notes.txt) | `Arrays 2/src/notes.txt` |
|  | [RightAngledTriangle.java](misc/pyramids/RightAngledTriangle.java) | `Pyramids/Stars/_01_RightAngledTriangle.java` |
|  | [patterns.py](misc/pyramids/patterns.py) | `Pyramids/Python/patterns.py` |
|  | [IntersectionTwoArrays_350.js](misc/js/IntersectionTwoArrays_350.js) | `JS/Leetcode/_01_IntersectionTwoArrays_350.js` |
|  | [IntelliJIDEA_ReferenceCard.pdf](misc/shortcuts/IntelliJIDEA_ReferenceCard.pdf) | `Shortcuts/IntelliJIDEA_ReferenceCard.pdf` |
