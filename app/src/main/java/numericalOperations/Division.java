package numericalOperations;

public class Division {

    //Divide values and send a warning message if user tries to divide by zero
    public static String DivideValues(String value1, String value2)
    {
       double result;
       String errorMessage="Infinity";
       try {
           result = Double.parseDouble(value1) / Double.parseDouble(value2);
           } catch(ArithmeticException e) //case that user divides by zero
            {
               return errorMessage;
            }

        return String.valueOf(result);
    }
}
