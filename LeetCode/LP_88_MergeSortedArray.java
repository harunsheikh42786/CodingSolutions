package LeetCode;

import java.util.Arrays;

public class LP_88_MergeSortedArray {

// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.
// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// Example 1:
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

// Example 2:
// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].

// Example 3:
// Input: nums1 = [0], m = 0, nums2 = [1], n = 1
// Output: [1]
// Explanation: The arrays we are merging are [] and [1].
// The result of the merge is [1].
// Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

// Constraints:
// nums1.length == m + n
// nums2.length == n
// 0 <= m, n <= 200
// 1 <= m + n <= 200
// -109 <= nums1[i], nums2[j] <= 109
 

// Follow up: Can you come up with an algorithm that runs in O(m + n) time?

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        // i for nums1 array
        // j for nums2 array
        // k for arr array
        int i = 0, j = 0, k = 0;

        
        // nums1.length = m+n
        // arr : For result array
        int [] arr = new int[m+n];

        while(i<m && j<n){ // m and n : nums of elements to be picked from nums1 and nums2
            if(nums1[i] <= nums2[j]){
                arr[k] = nums1[i]; // if num1[i] is less than or equals to nums2[j]
                i++;
            }else{
                arr[k] = nums2[j]; // // if num2[j] is less than or equals to nums1[i]
                j++;
            }
            k++; // Result array update to the next index 0 -> 1
        }
        

        // Copying remaining elements in arr of nums1
        while(i<m){
            arr[k] = nums1[i]; // if num1[i] is less than or equals to nums2[j]
            i++;
            k++;
        }
        
        // Copying remaining elements in arr of nums2
        while(j<n){
            arr[k] = nums2[j]; // if num1[i] is less than or equals to nums2[j]
            j++;
            k++;
        }
        
        // Result should be in nums1 as it doesn't return result
        for (int l = 0; l < nums1.length; l++) {
            nums1[l] = arr[l];
        }

        // For printing arrays
        System.out.print("Result array : ");
        Arrays.stream(nums1).forEach(e-> {System.out.print(e + ", ");});
        System.out.println("\n");
    }

    public static void main(String[] args) {


        // Condition : 1
        int [] nums1 = {1,2,3,0,0,0};
        int [] nums2 = {2,5,6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);


        // Condition : 2
        int [] nums11 = {1};
        int [] nums21 = {};
        int m1 = 1, n1 = 0;

        merge(nums11, m1, nums21, n1);
        
        // Condition : 3
        int [] nums12 = {0};
        int [] nums22 = {1};
        int m2 = 0, n2 = 1;

        merge(nums12, m2, nums22, n2);

    }
    
}
