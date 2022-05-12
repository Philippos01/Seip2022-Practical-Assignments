package math;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;
public class MyMathTest {
    MyMath math=new MyMath();
    @Test(expected = IllegalArgumentException.class)
    public void test_factorial_out_of_range(){math.factorial(-1);}


}
