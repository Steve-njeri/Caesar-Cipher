import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {
    private Encoding testEncoding = new Encoding("STEPHEN NJERI", 1);

    @Test
    public void checkIfItCreatesInstance() {
        assertEquals(true, testEncoding instanceof Encoding);
    }

    @Test
    public void checkIfSavesInputText() {
        assertEquals("STEPHEN NJERI", testEncoding.getInputText());
    }

    @Test
    public void checkKeyIsSaved() {
        assertEquals(2,testEncoding.getKey());
    }

    @Test
    public void isValidInputText() {
        assertEquals(true, testEncoding.isValidInputText());
    }

    @Test
    public void isValidKey() {
        assertEquals(true, testEncoding.isValidKey());
    }

    @Test
    public void validEncoding() {
        assertEquals("TUFQIFO", testEncoding.encode());
    }
}