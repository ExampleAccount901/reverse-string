import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testEmptyInput() {
        String input = "";
        String expectedOutput = "";

        String reversedString = Solution.reverseString(input);

        assertEquals(expectedOutput, reversedString);
    }

    @Test
    void testSingleCharacterInput() {
        String input = "A";
        String expectedOutput = "A";

        String reversedString = Solution.reverseString(input);

        assertEquals(expectedOutput, reversedString);
    }

    @Test
    void testNormalInput() {
        String input = "Hello World!";
        String expectedOutput = "!dlroW olleH";

        String reversedString = Solution.reverseString(input);

        assertEquals(expectedOutput, reversedString);
    }
}