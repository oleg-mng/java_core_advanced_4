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

    public void checkSizeArray(Character[][] myCharArray) {
        try {
            if (myCharArray.length != 4) {
                size = myCharArray.length;
                throw new MyArraySizeException("Число строк не соответствует 4-м", size);
            }
            if (myCharArray[0].length != 4) {
                size = myCharArray[0].length;
                throw new MyArraySizeException("Число столбов не соответствует 4-м", size);
            }
//            for (int i = 0; i < 4; i++) {
//                for (int j = 0; j < 4; i++) {
//                    if (myCharArray[i][j] == 0) {
//                        throw new ArrayIndexOutOfBoundsException();
//                    }
////                    else continue;
//                }
//            }

        } catch (MyArraySizeException ex) {
            System.out.printf("сообщение: %s, текущее количество: %d\n", ex.getMessage(), ex.getSize());

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Не все элементы присутствуют, массив должен быть 4x4");
        }

    }
    public void checkDataArray(Character[][] myCharArray){
        int[][] intAr = new int [4][4];
        int sum = 0;
        try {
            for (int i = 0; i < intAr.length; i++) {
                for (int j = 0; j < intAr[0].length; j++) {
                    intAr[i][j] = Character.digit(myCharArray[i][j], 10);
                    sum += intAr[i][j];
                    if (!Character.isDigit(myCharArray[i][j])){
                        throw new MyArrayDataException("Данный элемент не число", i, j, myCharArray[i][j] );
                    }
                }
            }
        }
        catch (MyArrayDataException ex){
            System.out.printf("сообщение: %s - '%c' - координаты элемента: i = %d, j =%d \n",
                    ex.getMessage(), ex.getC(),ex.getX(), ex.getY());
        }
        finally {
            System.out.printf("Сумма элементов равна %d: ", sum);
            System.out.println(Arrays.asList(intAr));
        }

    }
}
