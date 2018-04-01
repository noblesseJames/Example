import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorTest {
    private static final Logger log = LoggerFactory.getLogger(CalculatorTest.class);

    public static void main(String args[]) {
        log.info("main method start!!!");

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(1,2,5));
        System.out.println(calculator.subtract(10,2,7));

        log.info("main method end!!!");
    }
}
