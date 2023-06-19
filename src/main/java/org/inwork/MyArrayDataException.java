package org.inwork;

public class MyArrayDataException extends MyArrayException{
    int x;
    int y;
    char c;


    public MyArrayDataException(String message, int x, int y, char c) {
        super(message);
        this.x = x;
        this.y = y;
        this.c = c;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public char getC() {
        return c;
    }
}
