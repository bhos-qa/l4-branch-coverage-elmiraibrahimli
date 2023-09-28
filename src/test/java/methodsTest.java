import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class methodsTest {

    methods logic = new methods();

    // Test for the 5th method: Reverse a string
    @Test
    public void testReverseString() {
        assertEquals("tac", logic.reverseString("cat"));
        assertEquals("god", logic.reverseString("dog"));
    }

    // Test for the 6th method: Count occurrences of a character in a string
    @Test
    public void testCountOccurrences() {
        assertEquals(2, logic.countOccurrences("hello", 'l'));
        assertEquals(0, logic.countOccurrences("world", 'z'));
    }

    // Test for the 7th method: Check if a string is a palindrome
    @Test
    public void testIsPalindrome() {
        assertTrue(logic.isPalindrome("racecar"));
        assertFalse(logic.isPalindrome("hello"));
    }

    // Test for the 9th method: Rotate an array to the right by k steps
    @Test
    public void testRotateArray() {
        int[] nums = {1, 2, 3, 4, 5};
        logic.rotateArray(nums, 2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, nums);
    }

    // Test for the 10th method: Intentionally vulnerable method
    @Test
    public void testVulnerableMethod() {
        assertEquals("Access granted", logic.vulnerableMethod("1234"));
        assertEquals("Access denied", logic.vulnerableMethod("4321"));
    }
}
