package org.inwork;

public class MyArrayException extends Exception{
    protected String message;
    protected int x;
    protected int y;

    public String getMessage() {
        return message;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public MyArrayException(String message) {
        this.message = message;
//        this.x = x;
//        this.y = y;
    }
}
