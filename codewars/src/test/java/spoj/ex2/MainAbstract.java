package spoj.ex2;

import org.junit.Test;
import spoj.SpojAbstract;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

/**
 * Peter wants to generate some prime numbers for his cryptosystem.
 * Help him! Your task is to generate all prime numbers between two given numbers!
 * <p>
 * Input
 * The input begins with the number t of test cases in a single line (t<=10).
 * In each of the next t lines there are two numbers m and n (1 <= m <= n <= 1000000000, n-m<=100000) separated by a space.
 * <p>
 * Output
 * For every test case print all prime numbers p such that m <= p <= n, one number per line,
 * test cases separated by an empty line.
 * Example
 * Input:
 * 2
 * 1 10
 * 3 5
 * <p>
 * Output:
 * 2
 * 3
 * 5
 * 7
 * <p>
 * 3
 * 5
 */
public abstract class MainAbstract extends SpojAbstract {

    @Test
    public void testPrime() {
        String in = "2 1 10 3 5";
        System.setIn(new ByteArrayInputStream(in.getBytes()));
        callMain();

        assertEquals("2\r\n3\r\n5\r\n7\r\n\r\n3\r\n5\r\n\r\n", outContent.toString());
    }
}