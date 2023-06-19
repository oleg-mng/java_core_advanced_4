package org.inwork;

public class MyArrayDataException extends MyArrayException{
    int x;
    int y;
    char c;


    public MyArrayDataException(Class<? extends MyCharArray> name, String message, int x, int y, char c) {
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
        System.out.println(getClass());
        return c;
    }

}
