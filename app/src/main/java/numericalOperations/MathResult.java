package numericalOperations;


import static numericalOperations.Addition.AdditionDoubleValues;
import static numericalOperations.Division.DivideValues;

public class MathResult {

    public static double printResult(String value1,String value2,String operator){
        double result=0.0;
       switch(operator){
           case ("+"):
               result =AdditionDoubleValues(value1,value2);
                break;
           case("-"):
               result = Subtraction.DoubleValues(value1,value2);
               break;
           case("*"):
              result = Multiplication.DoubleValues(value1,value2);
               break;
           case ("/"):
             result = DivideValues(value1,value2);
             break;
           default :
               result = 0.0;
       }
        return result;
    }
}
