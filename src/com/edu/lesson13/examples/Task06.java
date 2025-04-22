package com.edu.lesson13.examples;

public class Task06 {
    private int hours, minutes, seconds;

    public Task06(int hours, int minutes, int seconds) {
        this.hours = (hours >= 0 && hours < 24) ? hours : 0;
        this.minutes = (minutes >= 0 && minutes < 60) ? minutes : 0;
        this.seconds = (seconds >= 0 && seconds < 60) ? seconds : 0;
    }

    public void addHours(int h) { hours = (hours + h) % 24; }
    public void addMinutes(int m) { minutes = (minutes + m) % 60; }
    public void addSeconds(int s) { seconds = (seconds + s) % 60; }

    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        Task06 time = new Task06(23, 59, 50);
        time.display();

        time.addSeconds(15);
        time.display();
    }
}