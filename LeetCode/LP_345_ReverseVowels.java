package LeetCode;

public class LP_345_ReverseVowels {

    // Given a string s, reverse only all the vowels in the string and return it.
    // The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

    // Example 1:
    // Input: s = "IceCreAm"
    // Output: "AceCreIm"

    // Explanation:
    // The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

    // Example 2:
    // Input: s = "leetcode"
    // Output: "leotcede"

    // Constraints:
    // 1 <= s.length <= 3 * 105
    // s consist of printable ASCII characters.

    public static boolean isVowel(char c){
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public static String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;

        char [] arr = s.toCharArray();
        while(start < end){

            // Iterate untill we found a vowel
            while (start < end && !isVowel(arr[start])) {
                start++;
            }
            while (start < end && !isVowel(arr[end])) {
                end--;
            }

            // Swap both vowels
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return String.valueOf(arr);
    }


    public static void main(String[] args) {

        String str = "IceCreAm";
        String result  = reverseVowels(str);
        System.out.println("Input : " + str);
        System.out.println("Result : " + result);
        
        String str1 = "leetcode";
        String result1  = reverseVowels(str1);
        System.out.println("\nInput1 : " + str1);
        System.out.println("Result1 : " + result1);
        
        String str2 = "Ui";
        String result2  = reverseVowels(str2);
        System.out.println("\nInput2 : " + str2);
        System.out.println("Result2 : " + result2);
        
    }
    
}
