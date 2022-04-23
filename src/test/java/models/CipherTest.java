package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherTest {

    @Test
    public void shiftSingleCharacter_shiftsSingleCharacterAsRequiredByUser_3() {
        Encoding encoding  = new Encoding ();
        assertEquals("Y",encoding.encrypt("B",3));
    }
    @Test
    public void shiftsWord_shiftsWordAsRequiredByUser_3() {
        Encoding encoding  = new Encoding ();
        assertEquals("EBIIL",encoding.encrypt("HELLO",3));
    }

    @Test
    public void resetsCharacter_resetsCharacterAsRequiredByUser_3() {
        Decoding decoding  = new Decoding ();
        assertEquals("THE",decoding.decrypt("QEB",3));
    }
}
