package ru.strushenkosa.range;

import java.util.Scanner;

/**
 * Created by Sergei on 21.05.2017.
 */
public class RangeMain {
    public static void main(String[] args) {

        Range range = new Range(5, 8);
        range.printLength();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double number = scanner.nextDouble();

        if (range.isInside(number)) {
            System.out.println("Число входит в диапазон");
        } else {
            System.out.println("Число не входит в диапазон");
        }
    }
}

