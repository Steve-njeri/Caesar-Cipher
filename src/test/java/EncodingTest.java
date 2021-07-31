import org.junit.Test;

import javax.xml.crypto.KeySelectorResult;

import java.util.IdentityHashMap;

import static org.junit.Assert.*;

public class EncodingTest {

    @Test
    public void checkIfItCreatesInstance() {
        Encoding testEncoding = new Encoding("MARTIN", 2);
        assertEquals(true, testEncoding instanceof Encoding);
    }

    @Test
    public void checkIfSavesInputText() {
        Encoding testEncoding = new Encoding("MARTIN",2);
        assertEquals("MARTIN", testEncoding.getInputText());
    }

    @Test
    public void checkKeyIsSaved() {
        Encoding testEncoding = new Encoding("MARTIN",2);
        assertEquals(2,testEncoding.getKey());
    }
}