package ru.strushenkosa.range;

/**
 * Created by Sergei on 21.05.2017.
 */
public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public double getLength() {
        return to - from;
    }

    public void printLength() {
        System.out.printf("Длина интервала равна: %.1f%n", getLength());
    }

    public boolean isInside(double number) {
        return (number >= from) && (number <= to);
    }
}
