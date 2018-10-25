package numericalOperations;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Test
    public void additionDoubleValues_isCorrect() {
        String value1="2.5";
        String value2="1.5";
        Double expected=4.0;
        Double result=Double.parseDouble(value1)+Double.parseDouble(value2);
        assertEquals("should be correct",expected,result );
    }
    @Test
    public void additionDoubleValues_isNotCorrect() {
        String value1="2.5";
        String value2="2.5";
        Double expected=4.0;
        Double result=Double.parseDouble(value1)+Double.parseDouble(value2);
        assertNotEquals("shouldnt be correct",expected,result);
    }

    @Test
    public void additionIntValues_isCorrect() {
        String value1="1";
        String value2="3";
        int expected=4;
        int result=Integer.parseInt(value1)+Integer.parseInt(value2);

        assertEquals("should be correct",expected,result);
    }
    @Test
    public void additionIntValues_isNotCorrect() {
        String value1="3";
        String value2="3";
        int expected=4;
        int result=Integer.parseInt(value1)+Integer.parseInt(value2);

        assertNotEquals("shouldnt be correct",expected,result);
    }
}