import ObjectsAndMethods_03.Arithmetic.Arithmetic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArithmeticTest {

    @Test
    void testSum1() {
        int result = 10;
        Arithmetic arithmetic = new Arithmetic(5,5);
        int actual = arithmetic.sum(5,5);
        Assertions.assertEquals(result, actual);
    }

    @Test
    void testSum2() {
        int result = 5;
        Arithmetic arithmetic = new Arithmetic(0,0);
        int actual = arithmetic.sum(5,-15);
        Assertions.assertEquals(result, actual);
    }
}