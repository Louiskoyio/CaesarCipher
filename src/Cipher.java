import java.security.Key;

public class Cipher {
    char [] capitalLetters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char [] smallLetters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};


    boolean validateInput(String s) {
        if (s == null) {
            return false;
             }
        int len = s.length();

        for (int i = 0; i < len; i++) {
        if ((Character.isLetter(s.charAt(i)) == false)) {
            return false;
        }
    }
      return true;
    }

    public String[] words(String userInput){
        String [] words = userInput.split(" ");

        return words;
    }

    public String cipher(String userInput, int key){
        String [] words = words(userInput);
        String encodedText = "";

        for(int j = 0;j<words.length;j++){

            for(int i=0;i<words[j].length();i++) {
                String word = words[j];


                char letter = word.charAt(i);

                if(Character.isLetter(letter)){
                    int letterIndex;
                    if(Character.isUpperCase(letter)) {
                        letterIndex = new String(capitalLetters).indexOf(letter);
                        int newIndex = letterIndex + key;
                        if(newIndex>25){
                            newIndex = newIndex - 25;

                        }
                        char encodedLetter = capitalLetters[newIndex];
                        encodedText += encodedLetter;
                    }else {
                        letterIndex = new String(smallLetters).indexOf(letter);
                        int newIndex = letterIndex + key;
                        if(newIndex>25){
                            newIndex = newIndex - 25;

                        }
                        char encodedLetter = smallLetters[newIndex];
                        encodedText += encodedLetter;
                    }
                }else {
                    encodedText += letter;
                }
            }
        }



    return encodedText;
}

    public String runCipher(String userInput, int key) {
        String result = cipher(userInput,key);

        return result;
    }
}
