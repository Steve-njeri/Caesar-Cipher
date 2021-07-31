import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {

    Decoding decoding = new Decoding(1, "TUFQIFO OKFSJ");

    @Test
    public void checkIfSavesInputText() {
        assertEquals("TUFQIFO OKFSJ", decoding.getInputText());
    }
}