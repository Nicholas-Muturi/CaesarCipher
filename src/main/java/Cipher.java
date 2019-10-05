public class Cipher {
    private String inputString;
    private String encryptedString;
    private String decryptedString;

    public Cipher(String inputString) {
        this.inputString = inputString;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String getEncryptedString() {
        return encryptedString;
    }

    public String getDecryptedString() {
        return decryptedString;
    }

    public String encryptText(String shiftDirection, int shiftBy){
        encryptedString = inputString;
        return encryptedString;
    }
}