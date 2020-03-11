import java.util.Scanner;

/**
 * In this project we will create a program that converts a string
 * to morseCode and vise versa,
 */

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1 Convert string to morseCode.\n");
        System.out.println("2 Convert morseCode to string.\n");

        System.out.println("Please make your choice");

        MorseCode morseCode = new MorseCode();

        /*
         * We going to use a switch statement.
         * If the user make a choice of 1, we will convert a string to morseCode.
         * If the user make a choice of 2, we will convert a morseCode to string.
         */

        while (true) {

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Please enter the string you want to convert to Morse Code: ");
                    System.out.println(morseCode.lettersToMorseCode(scanner.nextLine()));
                    break;
                case "2":
                    System.out.println("Please enter the morseCode you want to convert to Letters: ");
                    System.out.println(morseCode.morseCodeToLetters(scanner.nextLine().split(" ")));
                    break;
                default:
                    System.out.println("Invalid choice. Please choose between one and two: ");
                    continue;
            }
            break;
        }
    }
}
