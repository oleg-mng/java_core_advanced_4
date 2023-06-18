package org.inwork;

public class Program {
    public static void main(String[] args) {
        char[][] ch = new char[][]{
                {'1','2','3','4'},
                {'1','2','3','4'},
                {'1','2','3','4'},
                {'1','2','u','4'},
        };

        System.out.println(ch[3][2]);
    }
}