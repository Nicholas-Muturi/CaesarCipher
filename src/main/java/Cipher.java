public class Cipher {
    private String inputString;
    private String encryptedString;
    private String decryptedString;

    private final String[] alphabets = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

    public Cipher(String inputString) {
        this.inputString = inputString;
        this.encryptedString = "";
        this.decryptedString = "";
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
        String[] brokenString = inputString.split("");
        for (String letter : brokenString) {
            for (int y = 0; y < alphabets.length; y++) {
                if (letter.equalsIgnoreCase(alphabets[y])) {
                    //noinspection StringConcatenationInLoop
                    encryptedString += alphabets[y + shiftBy];
                }
            }
        }
        return encryptedString;
    }
}