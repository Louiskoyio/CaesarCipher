import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cipher cipherText = new Cipher();
        System.out.println("Enter a message:\n(INPUT MUST ONLY BE LETTERS)");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if(cipherText.validateInput(userInput)==false){
            String error = "ONLY ENTER LETTERS OF THE ALPHABET!";
            System.out.println(error);
        }else {

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
    }

