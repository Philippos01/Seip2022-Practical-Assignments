package math;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

public class ArithmeticOperationsTest {
    ArithmeticOperations ar = new ArithmeticOperations();

    @Test (expected = ArithmeticException.class)
    public void test_divide(){
        ar.divide(0,0);
    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_multiply_x_or_y_negative(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("x & y should be >= 0");
        ar.multiply(-1,1);
    }
    @Test
    public void test_multiply_product_of_multiplication(){
        Assert.assertEquals(6,ar.multiply(2,3));
    }

    @Test
    public void test_multiply_out_of_range(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("The product does not fit in an Integer variable");
        ar.multiply(100000,100000000);
    }



}