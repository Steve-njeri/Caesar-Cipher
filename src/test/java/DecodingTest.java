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
        assertEquals(2,testDecoding.getKey());
    }
}