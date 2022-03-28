package ru.gb.java2.lesson2;

public class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(int length) {
        super("массив не верного размера "+length+"х"+length+" массив должен быть 4х4");
    }
}
