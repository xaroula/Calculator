package numericalOperations;

public class Division {

    //Divide two given values.If user divides by zero  return infinity.
    public static Double DivideValues(String value1, String value2)
    {
        double inf = Double.POSITIVE_INFINITY;
        double result=0.0;
             try {
                    result=Double.parseDouble(value1)/Double.parseDouble(value2);
                 } catch (ArithmeticException  e) {
                  result=inf;
             }

        return result;
    }
}
