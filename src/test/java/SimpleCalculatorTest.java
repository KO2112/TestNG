import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void twoPlustwoshouldequalsfour(){
        var calculator = new SimpleCalculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    void threeplussevenshouldequal10(){
        var calculator = new SimpleCalculator();
        assertEquals(10,calculator.add(3,7));


    }
}