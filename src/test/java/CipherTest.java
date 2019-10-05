import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CipherTest {

    @Test
    public void createCipher_instanceOfCipher(){
        Cipher cipher = new Cipher("test string");
        assertTrue(cipher instanceof Cipher);
    }

    @Test
    public void runGetInput_returnString_String(){
        Cipher cipher = new Cipher("test string");
        assertEquals("test string", cipher.getInputString());
    }

    @Test
    public void runEncrypt_receiveInput_String(){
        Cipher cipher = new Cipher("test");
        assertEquals("test",cipher.encryptText("right",1 ));
    }

    @Test
    public void runEncrpt_shiftLettersBy1_String() {
        Cipher cipher = new Cipher("a");
        assertEquals("b", cipher.encryptText("right",1));
    }

    @Test
    public void runEncrpt_shiftLettersBy2_String() {
        Cipher cipher = new Cipher("a");
        assertEquals("c", cipher.encryptText("right",2));
    }

    @Test
    public void runEncrpt_shiftLettersBeyondZ_String() {
        Cipher cipher = new Cipher("z");
        assertEquals("c", cipher.encryptText("right",3));
    }

    @Test
    public void runEncrpt_dealingWithEncryptWhitespaces_String() {
        Cipher cipher = new Cipher("a b");
        assertEquals("c d", cipher.encryptText("right",2));
    }
}