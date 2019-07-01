package ru.javabegin.training.fastjava2.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task5_51 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любое натуральное число.");
        String s;
        int n;
        for (; ; ) {
            s = br.readLine();
            n = Integer.parseInt(s);
            if (n > 0) {
                break;
            } else {
                System.out.println("Число не натуральное, повторите ввод.");
                continue;
            }
        }
        double b = 0;
        double a;
        System.out.println("Введите числа.");
        for (int i = 1; i <= n; i++) {
            String aS = br.readLine();
            a = Double.parseDouble(aS);
            b = b+a;
        }
        System.out.println("Среднее арифмитическое: " + b/n);
    }
}