import java.util.Scanner;

public class LinearSearch {


    public static int search(int [] arr, int target){
       for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
       } 
       return -1;
    }

    public static int search(String [] arr, String target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        // int [] arr = {3,5,2,6,7};

        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter element : (int)");

        // int target = sc.nextInt();

        // int resultIndex = search(arr, target);

        // System.out.println(resultIndex != -1 ? "Element found at " + resultIndex + " index." : "Not found !");

        String [] arr1 = {"Apple", "Mango", "Grapes", "Pineapple"};


        System.out.println("Enter element : (String)");

        String target1 = sc.nextLine();

        int resultIndex1 = search(arr1, target1);

        System.out.println(resultIndex1 != -1 ? "Element found at " + resultIndex1 + " index." : "Not found !");



    }
    
}
