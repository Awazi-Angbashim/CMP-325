import static org.junit.Assert.assertTrue;

public class PalindromeTestt {
    class PalindromeTest {

        void testIsPalindrome_Palindromes() {
            Ass.stringToPalindrome Palindrome = null;
            assertTrue(Palindrome.isPalindrome("madam"));
            assertTrue(Palindrome.isPalindrome("racecar"));
            assertTrue(Palindrome.isPalindrome("a"));
            assertTrue(Palindrome.isPalindrome(""));
        }

    }
