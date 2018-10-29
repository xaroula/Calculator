package numericalOperations;


import static numericalOperations.Addition.AdditionDoubleValues;
import static numericalOperations.Division.DivideValues;
import static numericalOperations.Multiplication.Multiply;
import static numericalOperations.Subtraction.Subtract;

public class MathResult {

    public static double printResult(String value1,String value2,String operator){
        double result=0.0;
       switch(operator){
           case ("+"):
               result =AdditionDoubleValues(value1,value2);
                break;
           case("-"):
               result = Subtract(value1,value2);
               break;
           case("*"):
              result = Multiply(value1,value2);
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
