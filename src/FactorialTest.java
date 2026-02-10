import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {
    @Test
    void testFactorial() {
        assertEquals(120, Factorial.factorial(5));
        assertEquals(1, Factorial.factorial(0));
    }
}
