public class Decoding {
    int dKey;
    String dInputText;

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
}
