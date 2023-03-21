import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();
    @Test
    public void factorialTruePositive(){
        assertEquals("factorial - True Positive", 120, calculator.factorial(5), DELTA);
        assertEquals("factorial - True Positive", 24, calculator.factorial(4), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("factorial- False Positive", 24, calculator.factorial(8), DELTA);
        assertNotEquals("factorial- False Positive", 24, calculator.factorial(2), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("power - True Positive", 8, calculator.power(2, 3), DELTA);
        assertEquals("power - True Positive", 27, calculator.power(3, 3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("power- False Positive", 6, calculator.power(2, 2), DELTA);
        assertNotEquals("power- False Positive", -7.3, calculator.power(2, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("natural log -True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("natural log - True Positive", 0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("natural log -False Positive", 6, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("natural log - False Positive", 7.3, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void sqrootTruePositive(){
        assertEquals("square root - True Positive", 2, calculator.squareRoot(4), DELTA);
        assertEquals("square root - True Positive", 1, calculator.squareRoot(1), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("square root - False Positive", 1, calculator.squareRoot(8), DELTA);
        assertNotEquals("square root - False Positive", 0, calculator.squareRoot(9), DELTA);

    }


}