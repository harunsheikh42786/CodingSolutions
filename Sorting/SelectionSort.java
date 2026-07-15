public class SelectionSort {
    
    // Select min value and swap it if it is less than current value
    public static void sort(int [] arr){
        // Remove last index as it will not count
        for (int i = 0; i < arr.length-1; i++) {
            int min = i; // Minimun value index
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]){ // Select which one is minimum
                    min = j;
                }
            }
            // Compare : is it minimum or not ?
            if(arr[min] < arr[i]){
                // Swap
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {5,3,1,5,6,8,4};
        System.out.println("Original : ");
        PrintArray.print(arr);
        sort(arr);
        System.out.println("Sorted : ");
        PrintArray.print(arr);
    }

}
