import java.util.Scanner;


public class App {

    public static final char [] capitalLetters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static void main(String[] args) {

        Cipher cipherText = new Cipher();
        System.out.println("ENTER A MESSAGE: ");
        Scanner scanner = new Scanner(System.in);
        boolean inputOK = false;
        String userInput = "";
        while (inputOK==false){
            String warning = "(INPUT MUST ONLY BE LETTERS. NO SPACES, SYMBOLS OR NUMBERS)";
            System.out.println(warning);
            userInput = scanner.nextLine();
            inputOK = cipherText.validateInput(userInput);

        }

            System.out.println("Enter decryption key:\n(MUST BE BETWEEN 1-26)");
            int key = scanner.nextInt();


            String encodedText = cipherText.runCipher(userInput,key);
            Decipher decipherText = new Decipher();
            String decodedText = decipherText.runDecipher(encodedText,key);

            System.out.println("INPUT: " + userInput );
            System.out.println("ENCODED: " + encodedText );
            System.out.println("DECODED: " + decodedText );






        }
    }

