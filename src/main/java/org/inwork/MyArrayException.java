package org.inwork;

public class MyArrayException extends ArrayIndexOutOfBoundsException{
    protected String name;
    protected int x;
    protected int y;

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
