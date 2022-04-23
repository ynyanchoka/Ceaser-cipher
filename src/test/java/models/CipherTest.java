package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherTest {
    @Test
    public void shiftCharacter_shiftsCharacterAsRequiredByUser_3() {
        Encoding encoding  = new Encoding ();
        assertEquals("EBIIL",encoding.encrypt("HELLO",3));
    }

    @Test
    public void resetsCharacter_resetsCharacterAsRequiredByUser_3() {
        Decoding decoding  = new Decoding ();
        assertEquals("THE",decoding.decrypt("QEB",3));
    }
}
