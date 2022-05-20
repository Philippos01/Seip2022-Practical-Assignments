package math;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class MyMathTest {
    MyMath math=new MyMath();
    @Test(expected = IllegalArgumentException.class)
    public void test_factorial_out_of_range(){math.factorial(-1);}

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_is_prime_exception(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Prime numbers are greater than 1");
        math.isPrime(-1);
    }

    @Test
    public void test_is_prime(){
        Assert.assertEquals(true, math.isPrime(7));
    }
    @Test
    public void test_is_not_prime(){
        Assert.assertEquals(false, math.isPrime(6));
    }
}