import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
    private static final Logger log = LoggerFactory.getLogger(Calculator.class);

    int add(int... paramaeters) {
        if(paramaeters.length == 0) {
            return 0;
        }

        int result = paramaeters[0];
        for(int i=1, length=paramaeters.length; i<length; i++) {
            result += paramaeters[i];
        }

        return result;
    }

    int subtract(int... paramaeters) {
        if(paramaeters.length == 0) {
            return 0;
        }

        int result = paramaeters[0];
        for(int i=1, length=paramaeters.length; i<length; i++) {
            result -= paramaeters[i];
        }

        return result;
    }

}