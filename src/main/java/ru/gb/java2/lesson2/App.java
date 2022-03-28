package ru.gb.java2.lesson2;


public class App {
    public static void main(String[] args) {
        int arraySize = 4;
        String[][] array = new String[arraySize][arraySize];
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                array[i][j] = String.valueOf(i + j);
            }
        }
        array[1][0] = "f";
        try {
          arraySumm(array);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

    }

    public static void arraySumm(String[][] array) throws MyArraySizeException {
        int summ = 0;
        if (array.length > 4) {
            throw new MyArraySizeException(array.length);
        } else {

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    try {
                        summ += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j, e);
                    }
                }
            }
        }
        System.out.println(summ);
    }

}
