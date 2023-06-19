package org.inwork;

import java.util.Arrays;

public class MyCharArray {
    String name;
    int size;
    int x;
    int y;

    public MyCharArray() {
//        this.name = name;
//        this.x = x;
//        this.y = y;
    }

//    protected char[][] myCharArray = new char[4][4];

    public boolean checkSizeArray(Character[][] myCharArray) {
        boolean b = true;
        try {
            if (myCharArray.length != 4) {
                size = myCharArray.length;
                throw new MyArraySizeException("Число строк не соответствует 4-м", size);
            }
            if (myCharArray[0].length != 4) {
                size = myCharArray[0].length;
                throw new MyArraySizeException("Число столбцов не соответствует 4-м", size);
            }
            for (int i = 0; i < myCharArray.length; i++) {
                for (int j = 0; j < myCharArray[0].length; j++) {
                    if (myCharArray[i][j].equals(null)) {
                        throw new ArrayIndexOutOfBoundsException();
                    }

                }
            }

        } catch (MyArraySizeException ex) {
            b = false;
            System.out.printf("сообщение: %s, текущее количество: %d\n", ex.getMessage(), ex.getSize());

        } catch (ArrayIndexOutOfBoundsException ex) {
            b = false;
            System.out.println("Не все элементы присутствуют, массив должен быть 4x4");
        }

        return b;

    }

    public void checkDataArray(Character[][] myCharArray, boolean b) {
        int y =  4;
        int x =  4;
        int[][] intAr = new int[x][y];
        int sum = 0;
        if (b == true) {

            try {
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        if (!Character.isDigit(myCharArray[i][j])) {
                            throw new MyArrayDataException(getClass(), "Данный элемент не число", i, j, myCharArray[i][j]);
                        }
                        intAr[i][j] = Character.digit(myCharArray[i][j], 10);
                        sum += intAr[i][j];
                    }
                }
            } catch (MyArrayDataException ex) {
                System.out.printf("сообщение: %s - '%c' - координаты элемента: i = %d, j = %d \n",
                        ex.getMessage(), ex.getC(), ex.getX(), ex.getY());
            } finally {
                System.out.printf("Сумма элементов равна %d: ", sum);
            }
        }

    }
}
