import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeTest {
    import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    class PrimeTest {
        @Test
        void isPrime() {
            assertTrue(Prime.isPrime(2));
            assertTrue(Prime.isPrime(3));
            assertFalse(Prime.isPrime(4));
            assertTrue(Prime.isPrime(5));

        }
    }


}
