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
}