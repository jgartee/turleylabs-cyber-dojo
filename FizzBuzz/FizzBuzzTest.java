import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    void someBehavior() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.fizzBuzz();
        assertEquals("expected", actual);
    }
}