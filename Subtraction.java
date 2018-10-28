package numericalOperations;

public class Subtraction
{
    //Subtraction function for double values
    public static Double SubtractionDouble(String value1,String value2)    {
        Double result=null;
        result=Double.parseDouble(value1)-Double.parseDouble(value2);
        return result;
    }
}
