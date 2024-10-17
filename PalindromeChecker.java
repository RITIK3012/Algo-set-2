public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        // Normalize the string
        StringBuilder normalized = new StringBuilder();
        for (char c : s.toCharArray()) {
            // Check if the character is alphanumeric
            if (Character.isLetterOrDigit(c)) {
                normalized.append(Character.toLowerCase(c));
            }
        }

        // Convert StringBuilder to String for easy manipulation
        String normalizedStr = normalized.toString();
        int left = 0;
        int right = normalizedStr.length() - 1;

        // Check for palindrome
        while (left < right) {
            if (normalizedStr.charAt(left) != normalizedStr.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }
        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // Output: true
        System.out.println(isPalindrome("race a car")); // Output: false
    }
}