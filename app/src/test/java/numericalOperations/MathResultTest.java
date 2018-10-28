package numericalOperations;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MathResultTest {

    @Test
    public void MathΙsCorrect(){
        //den douleuei to / ( provlhma me to return )
        String value1="2";
        String value2="0";
        String operator = "+";
        double expected=2.0;
        double result = MathResult.printResult(value1,value2,operator);
        assertEquals("Should be correct",expected,result);
    }

}
