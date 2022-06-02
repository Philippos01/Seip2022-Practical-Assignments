package math;
/**
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-05-21
 */
import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

public class ArithmeticOperationsTest {
    ArithmeticOperations ar = new ArithmeticOperations();


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_divide_exception(){
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Cannot divide with zero");
        ar.divide(0.0,0.0);
    }

    @Test
    public void test_divide(){Assert.assertEquals((double)10/5,ar.divide(10,5),0);}

    @Test
    public void test_multiply_x_negative_y_positive(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("x & y should be >= 0");
        ar.multiply(-1,1);
    }
    @Test
    public void test_multiply_x_positive_y_negative(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("x & y should be >= 0");
        ar.multiply(1,-1);
    }
    @Test
    public void test_multiply_product_of_multiplication(){
        Assert.assertEquals(6,ar.multiply(2,3));
    }

    @Test
    public void test_multiply_y_0(){
        Assert.assertEquals(0,ar.multiply(2,0));
    }

    @Test
    public void test_multiply_out_of_range(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("The product does not fit in an Integer variable");
        ar.multiply(100000,100000000);
    }



}