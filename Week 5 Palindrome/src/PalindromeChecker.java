import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Check if the entered word is a palindrome
        if (isPalindrome(word)) {
            System.out.println("The word \"" + word + "\" is a palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase to make the comparison case-insensitive
        str = str.toLowerCase();
        
        // Remove spaces and punctuation from the string
        str = str.replaceAll("[^a-z]", "");

        // Initialize pointers for the beginning and end of the string
        int left = 0;
        int right = str.length() - 1;

        // Iterate over the string from both ends, comparing characters
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If all characters match, it's a palindrome
    }
}
