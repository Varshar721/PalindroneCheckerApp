/**
 * ============================================================
 * MAIN CLASS – UseCase3PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 *  - Iterates the string in reverse order
 *  - Builds a reversed version
 *  - Compares original and reversed strings
 *  - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Veeranjaneya Reddy
 * @version 3.0
 * ============================================================
 */

public class UC3 {
    public static void main(String[] args) {

        String input = "madam";

        String reversed = "";


        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        if (input.equals(reversed))
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is NOT a Palindrome");
    }
}
