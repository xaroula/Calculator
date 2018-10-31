package numericalOperations;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MultiplicationTest
{

    @Test
    public void MultiplicationResultIsCorrectTest1()
    {
        String value1 = "1.0";
        String value2 = "2.0";
        Double expected = 2.0;

        Double result = Multiplication.DoubleValues(value1,value2);

        assertEquals("should be correct",expected,result);
    }



    @Test
    public void MultiplicationResultIsCorrectTest2()
    {
        String value1 = "0.0";
        String value2 = "2";
        Double expected =0.0;

        Double result = Multiplication.DoubleValues(value1,value2);

        assertEquals("should be correct",expected,result);
    }

    @Test
    public void MultiplicationResultIsCorrectTest3()
    {
        String value1 = "-1.0";
        String value2 = "2.0";
        Double expected = -2.0;

        Double result = Multiplication.DoubleValues(value1,value2);

        assertEquals("should be correct",expected,result);
    }

    @Test
    public void MultiplicationResultIsCorrectTest4()
    {
        String value1 = "-1.0";
        String value2 = "-2.0";
        Double expected = 2.0;

        Double result = Multiplication.DoubleValues(value1,value2);


        assertEquals("should be correct",expected,result);
    }

    @Test
    public void MultiplicationResultIsCorrectTest5()
    {
        String value1 = "0.0";
        String value2 = "0.0";
        Double expected = 0.0;

        Double result = Multiplication.DoubleValues(value1,value2);

        assertEquals("should be correct",expected,result);
    }
}
