package taudemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WithAssertionsTest {

    @Test
    public void firstAssertion() {
        assertEquals(1, 2);
    }

    @Test
    public void secondAssertions() {
        assertEquals(45, 45);
    }
}
