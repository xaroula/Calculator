package numericalOperations;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest
{

    @Test
    public void additionDoubleValues_isCorrect()
    {
        String value1="2.5";
        String value2="1.5";
        Double expected=4.0;

        Double result=Addition.AdditionDoubleValues(value1,value2);

        assertEquals("should be correct",expected,result );
    }
    @Test
    public void additionDoubleValues_isNotCorrect()
    {
        String value1="2.5";
        String value2="2.5";
        Double expected=4.0;

        Double result=Addition.AdditionDoubleValues(value1,value2);

        assertNotEquals("shouldn't be correct",expected,result);
    }

    @Test
    public void additionIntValues_isCorrect()
    {
        String value1="1";
        String value2="3";
        int expected=4;

        int result=Addition.AdditionIntValues(value1,value2);

        assertEquals("should be correct",expected,result);
    }
    @Test
    public void additionIntValues_isNotCorrect()
    {
        String value1="3";
        String value2="3";
        int expected=4;

        int result=Addition.AdditionIntValues(value1,value2);

        assertNotEquals("shouldn't be correct",expected,result);
    }
}