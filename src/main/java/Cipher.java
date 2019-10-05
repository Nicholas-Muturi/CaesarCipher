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
            if(letter.contains(" ")){
                //noinspection StringConcatenationInLoop
                encryptedString += " ";
            }
            else {
                if (shiftDirection.equalsIgnoreCase("right")){
                    //Shift Right
                    for (int y = 0; y < alphabets.length; y++) {
                        if (letter.equalsIgnoreCase(alphabets[y])) {
                            if((y+shiftBy) > alphabets.length){
                                //noinspection StringConcatenationInLoop
                                encryptedString += alphabets[y-26 + shiftBy];
                            }
                            else {
                                //noinspection StringConcatenationInLoop
                                encryptedString += alphabets[y + shiftBy];
                            }
                        }
                    }
                }
                else {
                    //Shift Left
                    for (int y = alphabets.length-1; y >= 0; y--) {
                        if (letter.equalsIgnoreCase(alphabets[y])) {
                            if((y-shiftBy) < 0){
                                //noinspection StringConcatenationInLoop
                                encryptedString += alphabets[y+26-shiftBy];
                            }
                            else {
                                //noinspection StringConcatenationInLoop
                                encryptedString += alphabets[y - shiftBy];
                            }
                        }
                    }
                }
            }
        }

        return encryptedString;
    }

    public String decryptText(String shiftDirection, int shiftBy){
        String[] brokenString = inputString.split("");

        for (String letter : brokenString) {
            for (int y = alphabets.length-1; y >= 0; y--) {
                if (letter.equalsIgnoreCase(alphabets[y])) {
                    //noinspection StringConcatenationInLoop
                    decryptedString += alphabets[y - shiftBy];
                }
            }
        }

        return decryptedString;
    }
}