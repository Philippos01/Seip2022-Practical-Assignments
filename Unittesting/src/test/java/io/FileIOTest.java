package io;
/**
 * @author  Fpriovolos
 * @version 1.0
 * @since   2022-0521
 */
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FileIOTest {

    FileIO f = new FileIO();
    public static String resourcesPath= "src/test/resources/";

    @Test
    public void test_read_file(){
    int[] expectedNumbers = new int[]{
            0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    };
        String validpath= resourcesPath.concat("read_numbers.txt");
        Assert.assertArrayEquals(expectedNumbers,f.readFile(validpath));
    }
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test_file_empty(){
        String wrongpath= resourcesPath.concat("eeeempty_numbers.txt");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Input file does not exist");
        f.readFile(wrongpath);
    }

    @Test
    public void  test_file_not_exist(){
        String validpath=resourcesPath.concat("empty_numbers.txt");
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Given file is empty");
        f.readFile(validpath);

    }

    @Test
    public void testReadFileContainsInvalidEntries(){
        int[] expectedNumbers = new int[]{
            1,2,3,999,10000
        };
        String validpath= resourcesPath.concat("int_string_entries.txt");
        Assert.assertArrayEquals(expectedNumbers,f.readFile(validpath));
    }

    }



