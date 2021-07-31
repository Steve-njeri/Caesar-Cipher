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
        int dkey = 2;
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
}