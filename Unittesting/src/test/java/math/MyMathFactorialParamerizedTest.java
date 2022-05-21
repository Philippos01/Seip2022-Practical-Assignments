package math;
/**
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-0521
 */
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MyMathFactorialParamerizedTest {
    @Parameter()
    public int number;
    @Parameter(value = 1)
    public int result;
    MyMath math = new MyMath();

    @Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{0, 1}, {1, 1}, {2, 2}, {12, 479001600}};
        return Arrays.asList(data);
    }

    @Test
    public void test_factorial_in_range() {
        Assert.assertEquals(result, math.factorial(number));
    }
}