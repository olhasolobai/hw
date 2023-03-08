package exceptions;

public class ArraySizeException extends Exception{

    @Override
    public String getMessage(){
        return "Error. Length of array is not 4.";
    }
}
