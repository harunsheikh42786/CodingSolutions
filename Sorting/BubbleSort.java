public class BubbleSort {

    public static void sort(int [] arr){
        for (int i = 0; i < arr.length-1; i++) { // i < arr.length - 1 : skip last index as we will check 6 element at 5

            // j<arr.length - i- 1
            // Suppose size is 6 then i=1 : 6 - 0 - 1 = 5 -> i=2 : 6-1-1 = 4
            // We will fix last element everytime
            // Next time will skip to visit it as it will be already fix
            // It will save our time to be repeated
            for (int j = 0; j < arr.length-i-1; j++) {
                // if(arr[j] < arr[j+1]){ Reverse Prder
                if(arr[j] > arr[j+1]){ // Incremtnt Order
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int [] arr = {3,6,8,5,4,1,2};

        System.out.print("Original : ");
        PrintArray.print(arr);
        
        sort(arr);
        
        System.out.print("Sorted : ");
        PrintArray.print(arr);


    }
    
}
