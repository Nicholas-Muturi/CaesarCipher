import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CipherTest {

    @Test
    public void runCipher_instanceOfCipher(){
        Cipher cipher = new Cipher();
        assertTrue(cipher instanceof Cipher);
    }

}