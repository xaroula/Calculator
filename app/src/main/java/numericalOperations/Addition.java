package numericalOperations;

public class Addition {


    //Addition function for double values and return double
    public static Double AdditionDoubleValues(String value1,String value2){
        Double result=null;

        result=Double.parseDouble(value1)+Double.parseDouble(value2);

        return result;
    }

    //Additon function for integer values and return int
    public static int AdditionIntValues(String value1,String value2)
    {
        int result= 0;

        result=Integer.parseInt(value1)+Integer.parseInt(value2);

        return result;
    }


}
