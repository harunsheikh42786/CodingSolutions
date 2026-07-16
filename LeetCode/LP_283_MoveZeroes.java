public class LP_283_MoveZeroes {

    // Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    // Note that you must do this in-place without making a copy of the array.

    // Example 1:
    // Input: nums = [0,1,0,3,12]
    // Output: [1,3,12,0,0]

    // Example 2:
    // Input: nums = [0]
    // Output: [0]
    
    // Constraints:
    // 1 <= nums.length <= 104
    // -231 <= nums[i] <= 231 - 1

    public static void moveZeroes(int[] nums) {
        int i = 0, j = nums.length, k = 0;

        while (i < j) {
            if(nums[i] != 0){ // If current element is not 0 update it with kth index element
                nums[k++] = nums[i]; // Update kth index value with next none zero value
            }
            i++; // Update current element index
        }

        // Update remaining element with zero
        while(k < j){
            nums[k++] = 0;
        }
    }

    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};

        System.out.println("Original : ");
        PrintArray.print(arr);

        moveZeroes(arr);

        System.out.println("Updated : ");
        PrintArray.print(arr);

        int [] arr2 = {0};

        System.out.println("\nOriginal : ");
        PrintArray.print(arr2);

        moveZeroes(arr2);

        System.out.println("Updated : ");
        PrintArray.print(arr2);


    }
    
}
