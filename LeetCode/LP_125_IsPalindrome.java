package LeetCode;

public class LP_125_IsPalindrome {
    // A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    // Given a string s, return true if it is a palindrome, or false otherwise.

    // Example 1:

    // Input: s = "A man, a plan, a canal: Panama"
    // Output: true
    // Explanation: "amanaplanacanalpanama" is a palindrome.
    
    // Example 2:
    // Input: s = "race a car"
    // Output: false
    // Explanation: "raceacar" is not a palindrome.

    // Example 3:
    // Input: s = " "
    // Output: true
    // Explanation: s is an empty string "" after removing non-alphanumeric characters.
    // Since an empty string reads the same forward and backward, it is a palindrome.

    //Constraints:
    // 1 <= s.length <= 2 * 105
    // s consists only of printable ASCII characters.

    public static boolean isDigit(char c){
        return (c >= '0' && c <= '9');
    }
    public static boolean isLetter(char c){
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
    public static boolean isPalindrome(String s){

        int i = 0, j = s.length()-1;

        while (i < j) {

            // Skip any char instead digit or letter
            while(i<j && !(isDigit(s.charAt(i)) || isLetter(s.charAt(i)) )){
                i++;
            }
            while(i<j && !(isDigit(s.charAt(j)) || isLetter(s.charAt(j)) )){
                j--;
            }

            char c = s.charAt(i);
            char c1 = s.charAt(j);

            // Uppercase char to lowercase case
            // 'A' = 65, 'a' = 97 -> 'a' - 'A' = 97 - 65 = 32
            // if c = B
            // c + 'a' - 'A' = B(66) + 97 - 65 = 66 + 97 - 65 = 98 = b
            if(c >= 'A' && c <= 'Z'){
                c = (char)(c + 'a' - 'A');
            }

            if(c1 >= 'A' && c1 <= 'Z'){
                c1 = (char)(c1 + 'a' - 'A');
            }

            // if Current first and last is not equal : condition false, break the loop, stop checking, return false 
            if(c != c1) return false;

            // Update variables pointer
            i++;
            j--;
            
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println("String : " + str);
        boolean result = isPalindrome(str);
        System.out.println("Result : " + result);

        String str1 = "race a car";
        System.out.println("\nString1 : " + str1);
        boolean result1 = isPalindrome(str1);
        System.out.println("Result1 : " + result1);

        String str2 = "harun";
        System.out.println("\nString2 : " + str2);
        boolean result2 = isPalindrome(str2);
        System.out.println("Result2 : " + result2);
        
        String str3 = " ";
        System.out.println("\nString3 : " + str3);
        boolean result3 = isPalindrome(str3);
        System.out.println("Result3 : " + result3);
    }
}
