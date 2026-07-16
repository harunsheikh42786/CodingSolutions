public class LP_167_TwoSum {

    // Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
    // Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1, index2] of length 2.
    // The tests are generated such that there is exactly one solution. You may not use the same element twice.
    // Your solution must use only constant extra space.

    // Example 1:
    // Input: numbers = [2,7,11,15], target = 9
    // Output: [1,2]
    // Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

    // Example 2:
    // Input: numbers = [2,3,4], target = 6
    // Output: [1,3]
    // Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].

    // Example 3:
    // Input: numbers = [-1,0], target = -1
    // Output: [1,2]
    // Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
    

    // Constraints:
    // 2 <= numbers.length <= 3 * 104
    // -1000 <= numbers[i] <= 1000
    // numbers is sorted in non-decreasing order.
    // -1000 <= target <= 1000
    // The tests are generated such that there is exactly one solution.

    public static int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            
            // Check current element target : 9-2 = 7
            int need = target - numbers[i];

            // i+1 : bcz we already used i upper in need
            int index = binarySearch(numbers, i+1, numbers.length-1, need);

            // Check if index is not -1
            if(index != -1){
                // return i+1 and index + 1 : as question said about +1 index based answer not 0 index based
                return new int[]{i+1, index+1}; // 1-based indexing
            }
        }

        // Return if no match indexes
        return new int[]{-1,-1};
    }

    public static int binarySearch(int [] arr, int low, int high, int need){
        
        // Traverse 
        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == need){ // if mid element is equals to need return mid
                return mid;
            }else if(arr[mid] < need){ // if mid is less than need , place low pointer at mid + 1
                low = mid + 1;
            }else{ // else declare mid-1 as high
                high = mid-1;
            }
        }

        // If no element match return -1
        return -1;
    }


    public static void main(String[] args) {
        // Example 1:
        // Input: numbers = [2,7,11,15], target = 9
        // Output: [1,2]
        // Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
        int [] arr = {2,7,11,15};
        int target = 9;

        System.out.print("Target : " + target + ", Original : ");
        PrintArray.print(arr);
        
        int [] resultArr = twoSum(arr, target);
        
        System.out.print("Result : ");
        PrintArray.print(resultArr);

        // Example 2:
        // Input: numbers = [2,3,4], target = 6
        // Output: [1,3]
        // Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
        int [] arr1 = {2,3,4};
        int target1 = 6;

        System.out.print("\nTarget : " + target1 + ", Original : ");
        PrintArray.print(arr1);
        
        int [] resultArr1 = twoSum(arr1, target1);
        
        System.out.print("Result : ");
        PrintArray.print(resultArr1);

        // Example 3:
        // Input: numbers = [-1,0], target = -1
        // Output: [1,2]
        // Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
        int [] arr2 = {-1,0};
        int target2 = -1;

        System.out.print("\nTarget : " + target2 + ", Original : ");
        PrintArray.print(arr2);
        
        int [] resultArr2 = twoSum(arr2, target2);
        
        System.out.print("Result : ");
        PrintArray.print(resultArr2);

    }
    
}
