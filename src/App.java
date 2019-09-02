import java.util.ArrayList;
import java.util.Scanner;


public class App {

    public static final char [] capitalLetters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static void main(String[] args) {

        Cipher cipherText = new Cipher();
        System.out.println("ENTER TEXT TO BE ENCODED (FOR SENTENCES, TYPE WORD BY WORD MAX OF 5 WORDS");
        Scanner scanner = new Scanner(System.in);
        boolean inputOK = false;
        String userInput = "";
        int i = 0;
        ArrayList <String> userInputs = new ArrayList<String>();
        while (!inputOK || "X".equals(userInput) == true ){
            String warning = "(BAD INPUT!!\nINPUT MUST ONLY BE LETTERS. NO SPACES, SYMBOLS OR NUMBERS)";
            System.out.println(warning);
            userInput = scanner.nextLine();
            inputOK = cipherText.validateInput(userInput);
            userInputs.add(userInput);
            i++;
        }

        System.out.println("Enter decryption key:\n(MUST BE BETWEEN 1-26)");
        int key = scanner.nextInt();
        System.out.print("Input:  " );
        for(String word : userInputs){

            System.out.print(word + " " );
            }

        ArrayList <String> encodedWords = new ArrayList<String>();
        ArrayList <String> decodedWords = new ArrayList<String>();
            for(String word: userInputs){
                String encodedText = cipherText.runCipher(word,key);
                Decipher decipherText = new Decipher();
                String decodedText = decipherText.runDecipher(encodedText,key);

                encodedWords.add(encodedText);
                decodedWords.add(decodedText);

            }

        System.out.print("\nEncoded String:  " );
        for(String word : encodedWords){

            System.out.print(word + " " );
        }
        System.out.print("\nDecoded String:  " );
        for(String word : decodedWords){

            System.out.print(word + " " );
        }





    }
    }

