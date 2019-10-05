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

}