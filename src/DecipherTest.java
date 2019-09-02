import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecipherTest {
    @Test
    public void runDecipher_DecryptOneLetter_String() {
        Decipher testDecipher = new Decipher();
        String expected = "A";
        assertEquals(expected, testDecipher.runDecipher("B", 1));


    }
    @Test
    public void runDecipher_DecryptOneWord_String() {
        Decipher testDecipher = new Decipher();
        String expected = "Boy";
        assertEquals(expected, testDecipher.runDecipher("Cpz", 1));


    }


}