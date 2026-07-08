import com.example.ShiftCipher;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShiftCipherTest {

    private final ShiftCipher shiftCipher = new ShiftCipher();

    @Test
    void testTC01_Upper() {
        String result = shiftCipher.shift("SOFTWARE", 3);
        assertEquals("VRIWZDUH", result);
    }

    @Test
    void testTC02_Lower() {
        String result = shiftCipher.shift("software", 3);
        assertEquals("vriwzduh", result);
    }

    @Test
    void testTC03_WrapAroundUpper() {
        String result = shiftCipher.shift("XYZ", 4);
        assertEquals("BCD", result);
    }

    @Test

    void testTC04_InvalidInput() {
        String result = shiftCipher.shift("SOFT123", 3);
        assertEquals("invalid", result);
    }
}