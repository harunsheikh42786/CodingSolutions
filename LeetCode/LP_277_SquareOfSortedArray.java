public class LP_277_SquareOfSortedArray {

    // Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

    // Example 1:
    // Input: nums = [-4,-1,0,3,10]
    // Output: [0,1,9,16,100]
    // Explanation: After squaring, the array becomes [16,1,0,9,100].
    // After sorting, it becomes [0,1,9,16,100].

    // Example 2:
    // Input: nums = [-7,-3,2,3,11]
    // Output: [4,9,9,49,121]

    // Constraints:
    // 1 <= nums.length <= 104
    // -104 <= nums[i] <= 104
    // nums is sorted in non-decreasing order.

    // Note it :
    // Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
    
    public static int[] sortedSquares(int[] nums) {

        int [] result = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        // We can use only one traversal , as algorithm should be in O(n)
        while(left <= right){ // as right is nums.length -1

            // Check Positive greater value
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[index] = nums[left] * nums[left]; // Copy it to the result arr from end to start
                left++;
            }else{
                result[index] = nums[right] * nums[right]; // Square the value before inserting at result index
                right--;
            }

            index--; // Decrease the index of result array
        }

        return result;
    }

    public static void main(String[] args) {
        int [] arr = {-4,-1,0,3,10};

        System.out.println("Original : ");
        PrintArray.print(arr);
        
        int [] resultArr = sortedSquares(arr);
        
        System.out.println("Result : ");
        PrintArray.print(resultArr);
        
        int [] arr2 = {-7,-3,2,3,11};

        System.out.println("\nOriginal : ");
        PrintArray.print(arr2);
        
        int [] resultArr2 = sortedSquares(arr2);
        
        System.out.println("Result : ");
        PrintArray.print(resultArr2);

    }

}
