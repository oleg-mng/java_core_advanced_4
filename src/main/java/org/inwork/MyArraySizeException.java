package org.inwork;

public class MyArraySizeException extends MyArrayException{
    protected int size;

    public MyArraySizeException(String message, int size) {
        super(message);
        this.size = size;
    }

    public int getSize() {
        System.out.println(getClass());
        return size;
    }
}
