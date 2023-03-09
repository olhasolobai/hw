package arrayValueCalculator;

import exceptions.ArrayDataException;
import exceptions.ArraySizeException;

public class ArrayValueCalculator {

    public int doCalc(String array[][]) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        int size = array.length;
        for(int i = 0; i < size; i++){
            for (int j = 0; j < array[i].length; j++) {
                if (size != 4 || array[i].length != 4) throw new ArraySizeException();
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new ArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

}
