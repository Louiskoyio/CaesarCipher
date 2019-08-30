public class Decipher {
    char [] capitalLetters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char [] smallLetters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

    public String runDecipher (String encryptedText, int key){
        String decipheredText="";

        for(int i=0; i<encryptedText.length();i++) {
            char letter = encryptedText.charAt(i);
            int letterIndex;
            if(Character.isUpperCase(letter)) {
                letterIndex = new String(capitalLetters).indexOf(letter);
                int newIndex = letterIndex - key;
                char decodedLetter = capitalLetters[newIndex];
                decipheredText += decodedLetter;
            }else if(Character.isLowerCase(letter)){
                letterIndex = new String(smallLetters).indexOf(letter);
                int newIndex = letterIndex - key;
                char decodedLetter = smallLetters[newIndex];
                decipheredText += decodedLetter;
            }else decipheredText += letter;
        }




        return decipheredText;
    }
}
