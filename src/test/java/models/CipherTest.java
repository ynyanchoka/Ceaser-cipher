package models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherTest {
//encrypt test
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
//decrypt test
    @Test
    public void resetsCharacter_resetsCharacterAsRequiredByUser_5() {
        Decoding decoding  = new Decoding ();
        assertEquals("P",decoding.decrypt("K",5));
    }

    @Test
    public void resetsWord_resetsWordAsRequiredByUser_3() {
        Decoding decoding  = new Decoding ();
        assertEquals("THE",decoding.decrypt("QEB",3));
    }

//    @Test
//    public void moreThan25_inputMoreThan25_3() {
//       App main  = new App ();
//        assertEquals("THE",main.("QEB",3));
//    }
}
