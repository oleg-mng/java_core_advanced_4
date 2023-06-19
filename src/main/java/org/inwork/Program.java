package org.inwork;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Character[][] ch = new Character[][]{
                {'1', '2', '3', '4'},
                {'1', '2', 'k', '4'},
                {'1', '2', '3', '4'},
                {'1', '2', '3', '4'},

        };

        System.out.println();
        MyCharArray myCharArray = new MyCharArray();
        myCharArray.checkDataArray(ch, myCharArray.checkSizeArray(ch));

    }
}