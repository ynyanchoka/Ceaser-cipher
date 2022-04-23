package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherTest {
    @Test
    public void shiftCharacter_shiftsCharacterAsRequiredByUser_3() {
        Encoding encoding  = new Encoding ();
        assertEquals("HELLO",encoding.encrypt("EBIIL",3));
    }
}
