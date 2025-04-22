package com.edu.lesson13.examples;

public class Task05 {
    private int value;
    private int min;
    private int max;

    // Конструктор по умолчанию
    public Task05() {
        this(0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    // Конструктор с произвольными значениями
    public Task05(int start, int min, int max) {
        this.value = start;
        this.min = min;
        this.max = max;
    }

    // Метод увеличения значения счетчика
    public void increment() {
        if (value < max) {
            value++;
        }
    }

    // Метод уменьшения значения счетчика
    public void decrement() {
        if (value > min) {
            value--;
        }
    }

    // Метод получения текущего состояния счетчика
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Task05 counter = new Task05(5, 0, 10);

        System.out.println("Начальное значение: " + counter.getValue());

        counter.increment();
        System.out.println("После увеличения: " + counter.getValue());

        counter.decrement();
        counter.decrement();
        System.out.println("После двух уменьшений: " + counter.getValue());
    }
}