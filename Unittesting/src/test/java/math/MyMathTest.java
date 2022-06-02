package math;
/**
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class MyMathTest {
    MyMath math = new MyMath();

    @Test(expected = IllegalArgumentException.class)
    public void test_factorial_under_0() {
        math.factorial(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_factorial_over_12() {
        math.factorial(13);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_is_prime_exception_negative() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Prime numbers are greater than 1");
        math.isPrime(-1);
    }

    @Test
    public void test_is_prime_exception_zero() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Prime numbers are greater than 1");
        math.isPrime(0);
    }

    @Test
    public void test_is_prime_exception_one() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Prime numbers are greater than 1");
        math.isPrime(1);
    }


    @Test
    public void test_is_prime() {
        Assert.assertEquals(true, math.isPrime(3));
    }

    @Test
    public void test_is_not_prime() {
        Assert.assertEquals(false, math.isPrime(6));
    }


    @Test
    public void test_is_prime_2() {
        Assert.assertEquals(true, math.isPrime(2));
    }
}



