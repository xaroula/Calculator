package numericalOperations;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static numericalOperations.Division.DivideValues;


public class DivisionTest {

    @Test
    public void division_isCorrect()
    {
        String value1="10.0";
        String value2="5.0";
        double expected=2.0;
        double result = Double.parseDouble(value1)/Double.parseDouble(value2);
        assertEquals("Should be correct",expected,result);
    }

    @Test
    public void division_ByZero()
    {
        String value1="15.2";
        String value2="0.0";
        double expected = Double.POSITIVE_INFINITY;
        double actual = DivideValues(value1,value2);
        assertEquals(expected,actual);

    }

    @Test
    public void division_isCorrectN2()
    {
        String value1="199.5";
        String value2="1.5";
        double expected=133.0;
        double result = Double.parseDouble(value1)/ Double.parseDouble(value2);
        assertEquals("Should be correct",expected,result);
    }

}
