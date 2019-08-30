import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter a message:\n(INPUT MUST ONLY BE LETTERS)");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("Enter decryption key:\n(MUST BE BETWEEN 1-26)");
        int key = scanner.nextInt();

        Cipher cipherText = new Cipher();
        String encodedText = cipherText.runCipher(userInput,key);
        Decipher decipherText = new Decipher();
        String decodedText = decipherText.runDecipher(encodedText,key);

        System.out.println("INPUT: " + userInput );
        System.out.println("ENCODED: " + encodedText );
        System.out.println("DECODED: " + decodedText );




        }
    }

