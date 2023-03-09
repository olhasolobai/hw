package exceptions;

public class ArrayDataException extends Exception {
    private int i;
    private int j;
    public ArrayDataException(int i, int j){
        this.i = i;
        this.j = j;
    }

    @Override
    public String getMessage(){
        return ("Incorrect data: (" + i + ", " + j + ")");
    }
}
