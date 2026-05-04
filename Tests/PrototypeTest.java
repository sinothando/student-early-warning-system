package Tests;

import creational_patterns.AlertPrototype;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {

    @Test
    public void testClone() {
        AlertPrototype a1 = new AlertPrototype("Risk");
        AlertPrototype a2 = a1.clone();

        assertEquals(a1.getMessage(), a2.getMessage());
        assertNotSame(a1, a2);
    }
}