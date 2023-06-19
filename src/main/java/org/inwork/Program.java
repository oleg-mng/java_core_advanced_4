package org.inwork;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Character[][] ch = new Character[][] {
                {'1','2','3','4'},
                {'1','2','3','4'},
                {'1','2','k','4'},
                {'1','2','3','4'},
        };

        System.out.println();
        MyCharArray myCharArray = new MyCharArray();
//        myCharArray.checkSizeArray(ch);
        myCharArray.checkDataArray(ch);

//        int[][] arInt = new int [4][4];
//        for (int i = 0; i < ch.length; i++) {
//            for (int j = 0; j < ch[0].length; j++) {
//                arInt[i][j] = Character.digit(ch[i][j], 10);
//                if (!Character.isDigit(ch[i][j])){
//                  break;
//                }
////              System.out.printf("строка: %d, столбец :%d", i, j);
//               System.out.print(arInt[i][j]);
//
//            }
//            System.out.println();
//        }

    }
}