public class Decoding {
    private int dKey;
    private String dInputText;

    public Decoding(int key, String inputText) {
        dKey = key;
        dInputText = inputText;
    }

    public String getInputText() {
        return dInputText;
    }

    public int getKey() {
        return dKey;
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
        return dKey >1 &&  dKey <26;
    }

    public String decode() {
        String decodedValue = "";
        String[] encodedArray = dInputText.split("");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < encodedArray.length; i++) {
            if (dInputText.charAt(i) == ' ') {
                decodedValue += " ";
            } else {
                int charPosition = alphabet.indexOf(dInputText.charAt(i));
                int keyVal = (charPosition - dKey) % 26;

                if (keyVal < 0) {
                    keyVal = alphabet.length() + keyVal;
                }
                char replaceValue = alphabet.charAt(keyVal);
                decodedValue += replaceValue;
            }
        }
        return decodedValue;
    }

}
