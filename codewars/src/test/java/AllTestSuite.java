import codewars.BasicOperationsTest;
import codewars.XOTest;
import lowest_number.KataTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        BasicOperationsTest.class,
        KataTest.class,
        XOTest.class
})
public class AllTestSuite {
}
