import java.io.OptionalDataException;

public class Encoding {
    private int dKey;
    private String dInputText;
    public Encoding(String inputText,int key) {
        dKey = key;
        dInputText = inputText;
    }
    public String getInputText() {
        return dInputText;
    }

    public int getKey() {
        int dkey = 1;
        return dkey;
    }

    public boolean isValidInputText() {
        char[] chars = dInputText.toCharArray();
        for (char c : chars) {
            if(!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }

    public boolean isValidKey() {
        return dKey > 1 &&  dKey <26;
    }

    public String encode() {
        String encoded = "";
        String[] encodedArray = dInputText.split("");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i<encodedArray.length; i++) {
            if (dInputText.charAt(i) == ' ') {
                encoded += " ";
            }else{
                int charPosition = alphabet.indexOf(dInputText.charAt(i));
                int key = (dKey + charPosition) % 26;
                encoded += alphabet.charAt(key);
            }
        }
        return encoded.toUpperCase();
    }
}