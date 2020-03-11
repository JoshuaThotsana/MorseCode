public class MorseCode {

    // First we going to create a morseCode database.

    String[] morseCodeAlphabets = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.",
            "---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};

    char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x',
            'y','z',' '};

    // This is a method that takes a string as input and returns a morseCode.
    String lettersToMorseCode(String string) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i <string.length(); i++) {

            for (int j = 0; j < alphabets.length; j++){
                if (alphabets[j] == string.toLowerCase().charAt(i)) {
                    str.append(morseCodeAlphabets[j]);
                    str.append(" ");
                }
            }
        }
        assert string.length() == str.toString().split(" ").length: "input and output have the same number of characters.";
        return str.toString();
    }

    // This is a method that takes a morseCode as input and returns a string.
    String morseCodeToLetters(String[] stringArray) {

        StringBuilder str =  new StringBuilder();

        for (String s : stringArray) {
            for (int j = 0; j < morseCodeAlphabets.length; j++) {
                if (morseCodeAlphabets[j].equals(s)) {
                    str.append(alphabets[j]);
                }
            }
        }
        assert stringArray.length == str.toString().length(): "input and output have the same number of characters.";
        return str.toString();
    }
}
