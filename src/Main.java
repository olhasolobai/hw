import arrayValueCalculator.ArrayValueCalculator;

import exceptions.ArrayDataException;
import exceptions.ArraySizeException;

public class Main {

    public static void main(String[] args) throws ArrayDataException, ArraySizeException {
        ArrayValueCalculator obj = new ArrayValueCalculator();

        String[][] arr1 = new String[][]{
                {"0", "1", "2", "3"},
                {"4", "5", "6", "7"}};


        String[][] arr2 = new String[][]{
                {"0", "1", "2", "3"},
                {"4", "5", "6", "/"},
                {"8", "9", "10", "11"},
                {"12", "13", "14", "15"}};


        String[][] arr3 = new String[][]{
                {"0", "1", "2", "3"},
                {"4", "5", "6", "7"},
                {"8", "9", "10", "11"},
                {"12", "13", "14", "15"}};


        try {
            int res = obj.doCalc(arr1);
            System.out.println(res);
        } catch (ArraySizeException | ArrayDataException ex) {
            System.out.println("Message of Exception: " + ex.getMessage());
        }


        try {
            int res = obj.doCalc(arr2);
            System.out.println(res);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println("Message of Exception: " + exception.getMessage());
        }


        try {
            int res = obj.doCalc(arr3);
            System.out.println(res);
        } catch (ArraySizeException | ArrayDataException exception) {
            System.out.println("Message of Exception: " + exception.getMessage());
        }
    }
}