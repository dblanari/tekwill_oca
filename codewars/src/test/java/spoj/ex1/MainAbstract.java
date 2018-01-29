package spoj.ex1;

import org.junit.Test;
import spoj.SpojAbstract;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

/**
 * Your program is to use the brute-force approach in order to find the Answer to Life,
 * the Universe, and Everything. More precisely... rewrite small numbers from input to output.
 * Stop processing input after reading in the number 42.
 * All numbers at input are integers of one or two digits.
 * Example
 * Input:
 * 1
 * 2
 * 88
 * 42
 * 99
 * <p>
 * Output:
 * 1
 * 2
 * 88
 */
public abstract class MainAbstract extends SpojAbstract {
    @Test
    public void testEmpty() {
        String in = "";
        System.setIn(new ByteArrayInputStream(in.getBytes()));
        callMain();

        assertEquals(in, outContent.toString());
    }

    @Test
    public void testNotEmpty() {
        String in = "1\r\n2\r\n";
        System.setIn(new ByteArrayInputStream(in.getBytes()));
        callMain();

        assertEquals(in, outContent.toString());
    }


    @Test
    public void test42NotEmpty() {
        String in = "1\r\n2\r\n42\r\n43\r\n";
        System.setIn(new ByteArrayInputStream(in.getBytes()));
        callMain();

        assertEquals("1\r\n2\r\n", outContent.toString());
    }

    protected abstract void callMain();
}