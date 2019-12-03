import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {
    MorseCode morseCode = new MorseCode();
    @Test
    void lettersToMorseCode() {

        String testing =  "Hi you";
        assertEquals(testing.length(), morseCode.lettersToMorseCode(testing).split(" ").length);
    }

    @Test
    void morseCodeToLetters() {

        String[] testingArray = ".... .. / - .... . .-. .".split(" ");
        assertEquals(testingArray.length,morseCode.morseCodeToLetters(testingArray).length());

    }
}