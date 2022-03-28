package ru.gb.java2.lesson2;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j, Throwable couse) {
        super("Неверный формат в ячейки "+i+" "+j, couse);
    }
}
