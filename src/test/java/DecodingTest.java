import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {

    private Decoding testDecoding = new Decoding(1, "TUFQIFO OKFSJ");

    @Test
    public void checkIfSavesInputText() {
        assertEquals("TUFQIFO OKFSJ", testDecoding.getInputText());
    }

    @Test
    public void checkKeyIsSaved() {
        assertEquals(1,testDecoding.getKey());
    }

    @Test
    public void isValidInputText() {
        assertEquals(true, testDecoding.isValidInputText());
    }

    @Test
    public void isValidKey() {
        assertEquals(false, testDecoding.isValidKey());
    }

    @Test
    public void validDecoding() {
        assertEquals("STEPHEN NJERI", testDecoding.decode());
    }
}