public class InsertionSort {
    
    // Place minimum value at first index
    public static void sort(int [] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) { // Traverse current i index to 0, Skip 0, else it will throw indexoutofbond exception
                // arr[1] > arr[0] : last condition, if arr[0] > arr[0-1 = -1] throw exception
                if(arr[j] < arr[j-1]){ // Select minimum value
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        int [] arr = {8,6,1,4,2,5,4};
        System.out.println("Original : ");
        PrintArray.print(arr);

        sort(arr);
        
        System.out.println("Sorted : ");
        PrintArray.print(arr);
    }
}
