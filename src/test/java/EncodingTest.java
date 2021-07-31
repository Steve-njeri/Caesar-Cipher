import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {
    Encoding testEncoding = new Encoding("STEPHEN CIPHER", 2);
    @Test
    public void checkIfItCreatesInstance() {
        assertEquals(true, testEncoding instanceof Encoding);
    }

    @Test
    public void checkIfSavesInputText() {
        assertEquals("STEPHEN CIPHER", testEncoding.getInputText());
    }

    @Test
    public void checkKeyIsSaved() {
        assertEquals(2,testEncoding.getKey());
    }

    @Test
    public void isValidInputText() {
        assertEquals(true, testEncoding.isValidInputText());
    }
}