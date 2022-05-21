package math;
/**
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-0521
 */
import io.FileIO;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;


public class ArrayOperationsTest {

    ArrayOperations ar=new ArrayOperations();

    @Test
    public void test_find_primes_inf_file_mocking(){
        String filepath="src/main/resources/find_primes.txt";
        MyMath math=mock(MyMath.class);
        FileIO file=mock(FileIO.class);
        when(math.isPrime(2)).thenReturn(true);
        when(math.isPrime(3)).thenReturn(true);
        when(math.isPrime(4)).thenReturn(false);
        when(math.isPrime(5)).thenReturn(true);
        when(math.isPrime(6)).thenReturn(false);
        when(math.isPrime(7)).thenReturn(true);
        when(math.isPrime(8)).thenReturn(false);
        when(math.isPrime(9)).thenReturn(false);
        when(math.isPrime(10)).thenReturn(false);
        when(math.isPrime(11)).thenReturn(true);
        when(file.readFile(filepath)).thenReturn(new int[]{2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11});
        Assert.assertArrayEquals(new int[]{2,3,5,7,11},ar.findPrimesInFile(file,filepath,math));
    }

    }




