import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CipherTest {
    @Test
    public void runCipher_acceptOnlyStrings_String() {
        Cipher testCipher = new Cipher();
        String expected = "ONLY ENTER LETTERS OF THE ALPHABET!";
        assertEquals(expected, testCipher.runCipher("2th",1));
    }

    @Test
    public void runCipher_EncryptOneLetter_String() {
        Cipher testCipher = new Cipher();
        String expected = "B";
        assertEquals(expected, testCipher.runCipher("A",1));

    }

    @Test
    public void runCipher_EncryptOneWord_String() {
        Cipher testCipher = new Cipher();
        String expected = "Cpz";
        assertEquals(expected, testCipher.runCipher("Boy",1));

    }

    @Test
    public void runCipher_EncryptTwoWords_String() {
        Cipher testCipher = new Cipher();
        String expected = "UP CPZ";
        assertEquals(expected, testCipher.runCipher("TO BOY",1));

    }

    @Test
    public void words_SplitTwoWords_StringArray() {
        Cipher testCipher = new Cipher();
        String [] expected = new String [] {"TO","YOU"};
        assertEquals(expected, testCipher.words("TO YOU"));

    }
}