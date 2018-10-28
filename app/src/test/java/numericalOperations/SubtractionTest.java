package numericalOperations;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SubtractionTest {
    @Test
    public void SubtractionDoubleValues_isCorrect1()
    {
        String value1="2.5";
        String value2="1.5";
        Double expected=1.0;
        Double result=Subtraction.DoubleValues(value1,value2);
        assertEquals("should be correct",expected,result );
    }
    @Test
    public void SubtractionDoubleValues_isCorrect2()
    {
        String value1="-2.5";
        String value2="-1.5";
        Double expected=-(4.0);
        Double result=Subtraction.DoubleValues(value1,value2);
        assertEquals("should be correct",expected,result );
    }
    @Test
    public void SubtractionDoubleValues_isCorrect3()
    {
        String value1="100";
        String value2="100";
        Double expected=0.0;
        Double result=Subtraction.DoubleValues(value1,value2);
        assertEquals("should be correct",expected,result );
    }
    public void SubtractionDoubleValues_isCorrect4()
    {
        String value1="10";
        String value2="100";
        Double expected=-(90.0);
        Double result=Subtraction.DoubleValues(value1,value2);
        assertEquals("should be correct",expected,result );
    }
    public void SubtractionDoubleValues_isCorrect5()
    {
        String value1="0.0";
        String value2="0.0";
        Double expected=0.0;
        Double result=Subtraction.DoubleValues(value1,value2);
        assertEquals("should be correct",expected,result );
    }
}
